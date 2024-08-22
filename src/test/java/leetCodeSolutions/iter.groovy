/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class iter
{
    public static Map<String, Object> _expectedAliasMultiSelectOnDemandMap =
        [subject    : "Test a",
         sender     : "sender1",
         attachments: [],
         reason     : 'ON_DEMAND',
         url        : []]

    public static Map<String, Object> _expectedDLMultiSelectOnDemandMap =
        [subject    : "Test dl",
         sender     : "sender2",
         attachments: [],
         reason     : 'ON_DEMAND',
         url        : []]

    public static Map<String, Object> _expectedMultiRcptMultiSelectOnDemandMap =
        [subject: "Test multi",
         sender : "sender3",
         reason : 'ON_DEMAND',
         url    : []]

    public static void main(String[] args)
    {

        List expectedRecordList = [_expectedAliasMultiSelectOnDemandMap,
                                   _expectedMultiRcptMultiSelectOnDemandMap,
                                   _expectedDLMultiSelectOnDemandMap]
        for (Map<String, Object> expectedRecord: expectedRecordList )
        {
            if(expectedRecord == _expectedAliasMultiSelectOnDemandMap){
                System.out.println("Inside if block")
                System.out.println("expectedRecord :::" + expectedRecord)
            }else{
                System.out.println("expectedRecord :::" + expectedRecord)
            }
        }
    }
}
