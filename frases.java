class frases {
    public static void main() {

        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(conjunction);
        arrayList.add(proper_noun);
        arrayList.add(common_noun);

        Random random = new Random();
        for(Array[] currentArray : arrayList){
            String chosenString = currentArray[random.nextInt(currentArray.lenght)];
            System.out.println(chosenString);
        }
    }
}