# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.mh.validate.Validate {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/mh/validate/repack'
-flattenpackagehierarchy
-dontpreverify
