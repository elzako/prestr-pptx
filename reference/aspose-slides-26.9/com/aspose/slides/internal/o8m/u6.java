package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class u6 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "1.2.840.113549.1.1.1",
      "1.2.840.113549.1.7.1",
      "1.2.840.113549.1.9.3",
      "1.2.840.113549.1.9.4",
      "1.2.840.113549.1.9.5",
      "1.2.840.113549.3.7",
      "2.5.29.19",
      "2.5.29.15",
      "2.5.29.37",
      "2.5.29.14",
      "2.5.29.17",
      "2.16.840.1.113730.1.1",
      "1.2.840.113549.2.5",
      "1.3.14.3.2.26",
      "RSA",
      "PKCS 7 Data",
      "Content Type",
      "Message Digest",
      "Signing Time",
      "3des",
      "Basic Constraints",
      "Key Usage",
      "Enhanced Key Usage",
      "Subject Key Identifier",
      "Subject Alternative Name",
      "Netscape Cert Type",
      "md5",
      "sha1"
   );

   public u6() {
   }

   public u6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("oid");
      }

      this.n5 = var1;
      this.l6 = this.n5(var1);
   }

   public u6(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public u6(u6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("oid");
      }

      this.n5 = var1.l6();
      this.l6 = var1.n5();
   }

   public String n5() {
      return this.l6;
   }

   public String l6() {
      return this.n5;
   }

   private String n5(String var1) {
      switch (k5.n5(var1)) {
         case 0:
            return "RSA";
         case 1:
            return "PKCS 7 Data";
         case 2:
            return "Content Type";
         case 3:
            return "Message Digest";
         case 4:
            return "Signing Time";
         case 5:
            return "3des";
         case 6:
            return "Basic Constraints";
         case 7:
            return "Key Usage";
         case 8:
            return "Enhanced Key Usage";
         case 9:
            return "Subject Key Identifier";
         case 10:
            return "Subject Alternative Name";
         case 11:
            return "Netscape Cert Type";
         case 12:
            return "md5";
         case 13:
            return "sha1";
         default:
            return this.l6;
      }
   }
}
