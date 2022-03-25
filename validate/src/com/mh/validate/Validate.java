package com.mh.validate;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import validatetor.RegexMatcher;
import validatetor.ValidateTor;

public class Validate extends AndroidNonvisibleComponent {


  private ValidateTor validateTor;
  private RegexMatcher regexMatcher;

  public Validate(ComponentContainer container) {
    super(container.$form());

    validateTor = new ValidateTor();
    regexMatcher = new RegexMatcher();
  }

  @SimpleFunction()
  public boolean containsSubstring(String str,String speed){
    return validateTor.containsSubstring(str,speed);
  }
  @SimpleFunction()
  public boolean isAlpha(String str){
    return validateTor.isAlpha(str);
  }
  @SimpleFunction()
  public boolean isAlphanumeric(String str){
    return validateTor.isAlphanumeric(str);
  }
  @SimpleFunction()
  public boolean isBoolean(String str){
    return validateTor.isBoolean(str);
  }
  @SimpleFunction()
  public boolean isIPAddress(String str){
    return validateTor.isIPAddress(str);
  }
  @SimpleFunction()
  public boolean isEmail(String str){
    return validateTor.isEmail(str);
  }
  @SimpleFunction()
  public boolean isPhoneNumber(String str){
    return validateTor.isPhoneNumber(str);
  }
  @SimpleFunction()
  public boolean isEmpty(String str){
    return validateTor.isEmpty(str);
  }

  @SimpleFunction()
  public boolean isBase64(String str){
    return validateTor.isBase64(str);
  }
  @SimpleFunction()
  public boolean isDecimal(String str){
    return validateTor.isDecimal(str);
  }
  @SimpleFunction()
  public boolean isAtleastLength(String str,int len){
    return validateTor.isAtleastLength(str,len);
  }
  @SimpleFunction()
  public boolean isAtMostLength(String str,int len){
    return validateTor.isAtMostLength(str,len);
  }
  @SimpleFunction()
  public boolean isLowercase(String str){
    return validateTor.isLowercase(str);
  }
  @SimpleFunction()
  public boolean isUppercase(String str){
    return validateTor.isUppercase(str);
  }
  @SimpleFunction()
  public boolean isValidMD5(String str){
    return validateTor.isValidMD5(str);
  }
  @SimpleFunction()
  public boolean isNumeric(String str){
    return validateTor.isNumeric(str);
  }
  @SimpleFunction()
  public boolean isMACAddress(String str){
    return validateTor.isMACAddress(str);
  }
  @SimpleFunction()
  public boolean isJSON(String str){
    return validateTor.isJSON(str);
  }
  @SimpleFunction()
  public boolean isInteger(String str){
    return validateTor.isInteger(str);
  }
  /*
  @SimpleFunction()
  public boolean isIn(String str, String[] values){
    return validateTor.isIn(str,values);
  }

   */
  @SimpleFunction()
  public boolean isHexadecimal(String str){
    return validateTor.isHexadecimal(str);
  }
  @SimpleFunction()
  public boolean isPinCode(String str){
    return validateTor.isPinCode(str);
  }
  @SimpleFunction()
  public boolean isHexColor(String str){
    return validateTor.isHexColor(str);
  }
  @SimpleFunction()
  public boolean hasAtleastOneDigit(String str){
    return validateTor.hasAtleastOneDigit(str);
  }
  @SimpleFunction()
  public boolean hasAtleastOneLetter(String str){
    return validateTor.hasAtleastOneLetter(str);
  }
  @SimpleFunction()
  public boolean hasAtleastOneLowercaseCharacter(String str){
    return validateTor.hasAtleastOneLowercaseCharacter(str);
  }
  @SimpleFunction()
  public boolean hasAtleastOneUppercaseCharacter(String str){
    return validateTor.hasAtleastOneUppercaseCharacter(str);
  }
  @SimpleFunction()
  public boolean hasAtleastOneSpecialCharacter(String str){
    return validateTor.hasAtleastOneSpecialCharacter(str);
  }
  @SimpleFunction()
  public boolean validateCreditCard(String str){
    return validateTor.validateCreditCard(str);
  }
  @SimpleFunction()
  public validatetor.CardInformation getCreditCardInfo(String str){
    return validateTor.getCreditCardInfo(str);
  }

//////////////////////////////ValidateTor Regex\\\\\\\\\\\\\\\\\\\\\\\

  @SimpleFunction()
  public boolean validateRegex(String dataStr, String regex){
    return regexMatcher.validate(dataStr,regex);
  }
  @SimpleFunction()
  public boolean validatePattern(String dataStr, String pattern){
    return regexMatcher.validate(dataStr,pattern);
  }

  @SimpleFunction()
  public boolean findRegex(String dataStr, String regex){
    return regexMatcher.find(dataStr,regex);
  }
  @SimpleFunction()
  public boolean findPattern(String dataStr, String pattern){
    return regexMatcher.find(dataStr,pattern);
  }


}
