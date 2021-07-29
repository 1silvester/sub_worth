package com.sub_worth.ApiQueries;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import main.com.deepinspire.starlingbank.StarlingClient;
import main.com.deepinspire.starlingbank.http.Response;
import org.javamoney.moneta.Money;

import javax.money.Monetary;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProcessStarlingData {

    private static String accountUid;

    private static StarlingClient client;


    public ProcessStarlingData(String apiUrl, String pathToKeys, String publicKeyUid, String accessToken) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
        client = new StarlingClient(
                apiUrl,
                pathToKeys,
                publicKeyUid,
                accessToken
        );

    }


    public ProcessStarlingData() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
       client = new StarlingClient(
               "https://api-sandbox.starlingbank.com",
               "/Users/silvesterstephens/Sub_Worth/keys",
               "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtE+JfCEVvNYnQg2csLIaykBN6STFLErw5JgwleCgoExcN+itxhztHLJJFczsIa8cg87JeLWsO66TAJXd5fMloznsUkVMqLzq0Gem/5VcdXi6RjDVh+1vkCjAXXm7LLFOj2IVQuofPnJZ3GCpoFYqe6elJ5BH1gAk3GV4fQ7ge3A5g69/6m9QuTIkLzfjgGFI3SU360i/s+85voukACaAF6jBZdiVPzLvKSiSDeoHmhlUmh6ggSnm7QMdqES5k+CPStDxkIZxjsj9kA6m9Q24cXMJRRh6IOENqMSwQjKO11HTtUcDv9hLQM8H44lwuJezCJ2MFwZMHLX9cGcVAuhakQIDAQAB",
               "eyJhbGciOiJQUzI1NiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAA_31TSXLbMBD8iotnj0tcxO3mWz6QBwyAgYQSCbAA0I4rlb8HJEBRVFy5sbtn6RkMf2fKuazPcFIgaDRvzqMdlL4w1Lc3bsbsNXMzCxHnGmuqsIUzdSVUDWPAmrYFqsqukbxpkOchmH5NWZ_XRVW0Xd12r5lCn4hTWSwEcm5m7X-YQZD9qUSoLbDBnJ0LaM6nBirZEnQdMSDM8y7vKG_YUtubG-mYcaK65m11AupkyOBlDh1yASSkzEt2bsqyDhlhrHfOybmYVXLZFbLgIBhDqPCM0ErRQcuapqsbVjbF0sdxM9GylOgUrqtV0DhSbwnFy5Pgv6YnQQnSXklF9sgPyvkDk4AQNpjsSSh_B1HxHvl1pHvkjj-t8vSCs78aq1x4MlBaqA8lZhxiMMMBNU_WOFoB3GhvzRAbLUzSjJbKjuiV0WAkyFkLd5fcvfsGYms-O2_GbUQaUaXCAwUj-tLjNA1fd7RGjagFeuoFDRRKbDBp9kZ-GWSyJMlS8O7-J0UbUZsG5BQ24Oli1zkeE_8VUypZfsVtupE8BjfY8wBXNeF1qAm_iDYpgjREBHsQqBEvaaao7Z_gLWqHfHcYaGDzcOu3l6Sd2rtFvDeMeCuw3EO4rVH5veZgeLiDhworAWY5iGc2ZVkj1bDZj_McqDXKEic1-QNwRyku1-FHeDAHF7P7OHBpmgO31nlk4sLCk39XYhe_qbWLsSi_kpgHEpAWlmjyPgw4TwlOuP0w8TPN4nE9YjBWPFg5spuHIxtrHTgwn_rOe1pfj7uPZ2oSMlEzc9yGzS5Hs3V55Naox8taH-_51LI_fwHSDXhM7gUAAA.YU1oFmFKVIMHMIvQGjFX-6zenyAkAaize8-TPTz0j6Skk_FxPjWpROH46BScyOG4OdQOVjb2r_5fbrAjmcwNzksgWd6uwoqctlJ1307yrd1M05DO2FREviI-hjzQuSJta7oJ7OyQTVS-J8VJfD7Gn-WH3wR2OV2Mfh9jlnx3a-ku_JVBLOcvViZSmfDHyQsIkJUbG_AxYzLxTzfqcGkmKcaKkj3rz9FadMclBLbLeAI3AuecT1IeKl8sdIwQMh8gbAXEXMKIyvVVqosuON3OO2pt58i6l02z23vAnKeUQ6MXLFoxQbU7km5DbQzsNrE_m4J3nxhi4IqLf7HxIMBznASBhjEbUR71aA7MV42xMfLh5UOcxr7CczeEzvYIJxpug9s5ilpvos7NcQm9Mr8dH9Yb43ZQzH4OTDd-g-uXy_4JAhF-LEdgXdgdKZTRAtJCi6Esawe6yYvVtsxAo6A3H4i3ctIDuBwExKX3yz_KWjqriEF8tAFDTIDZZDNJa_ClvbD8mf1yEyIVLMyJJQSrZQnWYfSwAZTGxVxYN-iam45aMXZ9WJx2bjSPYZgU_SIBkrTVbbSQsMTJj1n7V2hoeAd6NBKei4zMfXlcHoXLr0jWk9n-Ipt_Cj8XVH0w-wfd2dCOvwInV95oCQ60bjMNv93zlkp6CQr_tvAA_Yjb8xM"
       );

    }

    public Response getAccount()
    {
        return client.getAccount();
    }




    //Process String content from SDK into a hashMap
    public Map<String, String> processAccountInfo(Response response1){

        Map<String, String> contentMap = new HashMap<>();
        Multimap<String, String> multiMap = ArrayListMultimap.create();

        String responseString = response1.getContent();


        responseString = responseString.replaceAll("\\{","");
        responseString = responseString.replaceAll("}","");

        if(responseString.contains("[") ){
        int indexOfFirst = responseString.indexOf("[");
        int indexOfLastBracket = responseString.lastIndexOf("]");

        responseString = responseString.substring(indexOfFirst+1,indexOfLastBracket);
        }


        if(responseString.contains(",")){
        responseString = responseString.trim();

        String[] responseArray = responseString.split(",");

        for(String splitResponseArray: responseArray)
        {
            String[] innerSplitArray = splitResponseArray.split(":");

            String strKey = innerSplitArray[0].trim();
            String strValue = innerSplitArray[1].trim();

            strKey = strKey.replace("\"", "");
            strValue = strValue.replace("\"", "");

            contentMap.put(strKey,strValue);
        }
        } else
        {
            String[] responseArray = responseString.split(":");

            String strKey = responseArray[0].trim();
            String strValue = responseArray[1].trim();
            strKey = strKey.replace("\"", "");
            strValue = strValue.replace("\"", "");

            contentMap.put(strKey,strValue);
        }


        return contentMap;

    }

    public Multimap<String, String> processMultiKeyValues(Response response)
    {
        Multimap<String, String> multiMap = ArrayListMultimap.create();
        String responseString = response.getContent();

        responseString = responseString.replaceAll("\\{","");
        responseString = responseString.replaceAll("}","");

        if(responseString.contains("[") ){
            int indexOfFirst = responseString.indexOf("[");
            int indexOfLastBracket = responseString.lastIndexOf("]");

            responseString = responseString.substring(indexOfFirst+1,indexOfLastBracket);
        }

            responseString = responseString.trim();

            String[] responseArray = responseString.split(",");

            for(String splitResponseArray: responseArray)
            {
                String[] innerSplitArray = splitResponseArray.split(":");

                String strKey = innerSplitArray[0].trim();
                String strValue = innerSplitArray[1].trim();

                strKey = strKey.replace("\"", "");
                strValue = strValue.replace("\"", "");

                multiMap.put(strKey,strValue);
            }
      return multiMap;
    }

    public String getAccountUid(){
        Response response = getAccount();
        accountUid = processAccountInfo(response).get("accountUid");
        return processAccountInfo(response).get("accountUid");
    }

    public String getAccountHolderName()
    {
        Response response = client.getAccountHolderName();
        return processAccountInfo(response).get("accountHolderName");
    }

    //TODO to do this properly with the starling API you need to use originatorName instead of "reference"
    public Map<String, Money> getDirectDebitMandate()
    {
        Multimap<String, String> responseMap = processMultiKeyValues(client.getListDirectDebitMandates());

        Map<String, Money> listOfReferencesAndPayments = new HashMap<>();
        ArrayList<String> listOfReferences = new ArrayList<>(responseMap.get("reference"));
        ArrayList<Money> listOfMinorUnits = new ArrayList<>();

        for(String response : responseMap.get("minorUnits")) {
            listOfMinorUnits.add(Money.ofMinor(Monetary.getCurrency("GBP"), Long.parseLong(String.valueOf(response))));
        }

        for(int i =0; i < listOfReferences.size(); i++){
            listOfReferencesAndPayments.put(listOfReferences.get(i), listOfMinorUnits.get(i));
        }
        return listOfReferencesAndPayments;
    }

    public String getAccountBalance()
    {
        Response response = client.getAccountBalance(accountUid);
        System.out.println("account balance " + response);
        return "";
    }




}
