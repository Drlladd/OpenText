package com.drladd.opentext.opentext.data;

/**
 * Created by Daryl on 08/09/2017.
 */

public class Contact {
    /**
     * Data model object for a contact.
     */

    private String mContactName;
    private String mNumber; //String as '07' would validate to remove the 0
    private String mNickname;



    private Contact(String name, String number){
        initialiseContact(name, number);
    }

    private Contact(String number){
        initialiseContact("", number);
    }

    private void initialiseContact(String name, String number){
        mContactName = name;
        mNumber = number;
    }

    public String getmContactName() {
        return mContactName;
    }

    public void setmContactName(String mContactName) {
        this.mContactName = mContactName;
    }

    public synchronized String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {

        this.mNumber = mNumber;
    }

    public String getmNickname() {
        return mNickname;
    }

    public void setmNickname(String mNickname) {
        ;this.mNickname = mNickname;
    }
}
