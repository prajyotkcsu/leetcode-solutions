class Result {

    /*
     * Complete the 'closestColor' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY pixels as parameter.
     */

    public static List<String> closestColor(List<String> pixels) {
        List<String> ls=new ArrayList<>();
        for(String pixel:pixels){
            int[] rgb=convertToRGB(pixel);
            ls.add(findProximities(rgb));
        }
        return ls;
    }
    private static int[] convertToRGB(String binary){
        int[] rgb=new int[3];
        String redString=binary.substring(0,9);
        String greenString=binary.substring(8,17);
        String blueString=binary.substring(16,24);
        int red=Integer.parseInt(redString,2);
        int green=Integer.parseInt(greenString,2);
        int blue=Integer.parseInt(blueString,2);
        return new int[]{red,green,blue};
    }
     static String findProximities(int[] rgb){
        Map<String,Double> hm=new HashMap<>();
        double black=Math.pow((Math.pow((rgb[0]-0),2)+Math.pow((rgb[1]-0),2)+Math.pow((rgb[2]-0),2)),1/2);
        double white=Math.pow((Math.pow((rgb[0]-255),2)+Math.pow((rgb[1]-255),2)+Math.pow((rgb[2]-255),2)),1/2);
        double red=Math.pow((Math.pow((rgb[0]-255),2)+Math.pow((rgb[1]-0),2)+Math.pow((rgb[2]-0),2)),1/2);
        double green=Math.pow((Math.pow((rgb[0]-0),2)+Math.pow((rgb[1]-255),2)+Math.pow((rgb[2]-0),2)),1/2);
        double blue=Math.pow((Math.pow((rgb[0]-0),2)+Math.pow((rgb[1]-0),2)+Math.pow((rgb[2]-255),2)),1/2);
        hm.put("Black",black);
        hm.put("White",white);
        hm.put("Red",red);
        hm.put("Green",green);
        hm.put("Blue",blue);
        
        List<Map.Entry<String,Double>>entryList=new ArrayList<>(hm.entrySet());
        Collections.sort(entryList,new Comparator<Map.Entry<String,Double>>(){
            public int compare(Map.Entry<String,Double>entry1,Map.Entry<String,Double>entry2){
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        LinkedHashMap<String,Double> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Double> entry:entryList){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        
        System.out.println(sortedMap);
        List<Double> list=new ArrayList<>(sortedMap.values());
        if(list.get(0)==list.get(1)){
            return "Ambiguous";
        }
        for(Map.Entry<String,Double> entry:sortedMap.entrySet()){
            return entry.getKey();
        }
        return "";
    }

}
