class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // ÉTAPE 1 : Compter les fréquences (Exactement comme avant)
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // ÉTAPE 2 : Créer les "Buckets" (Seaux)
        // La taille est nums.length + 1 car la fréquence maximale possible est la taille du tableau.
        // On crée un tableau de Listes, car plusieurs chiffres peuvent avoir la même fréquence.
        List<Integer>[] buckets = new List[nums.length + 1];
        
        // On place chaque chiffre dans le seau correspondant à sa fréquence
        for (int key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            
            // Si le seau est vide, on l'initialise avec une nouvelle liste
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            // On ajoute le chiffre dans le bon seau
            buckets[frequency].add(key);
        }

        // ÉTAPE 3 : Récolter les K éléments en partant de la fin (les plus fréquents)
        int[] result = new int[k];
        int compteurResultat = 0;
        
        // On parcourt les seaux à l'envers (de la plus grande fréquence à 0)
        for (int i = buckets.length - 1; i >= 0 && compteurResultat < k; i--) {
            if (buckets[i] != null) {
                // On vide le seau dans notre tableau de résultat
                for (int num : buckets[i]) {
                    result[compteurResultat] = num;
                    compteurResultat++;
                    
                    // Dès qu'on a nos K éléments, on arrête tout et on renvoie le résultat
                    if (compteurResultat == k) {
                        return result;
                    }
                }
            }
        }
        
        return result;
    }
}