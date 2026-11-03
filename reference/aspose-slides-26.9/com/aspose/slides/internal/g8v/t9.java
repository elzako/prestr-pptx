package com.aspose.slides.internal.g8v;

class t9 {
   private String l6;
   private int k5;
   private int u3;
   static String[] n5 = new String[]{"realm", "opaque", "nonce", "algorithm", "qop"};
   private String[] a6 = new String[n5.length];

   public t9(String var1) {
      this.l6 = com.aspose.slides.ms.System.d1.l6(var1);
   }

   public String n5() {
      return this.a6[0];
   }

   public String l6() {
      return this.a6[1];
   }

   public String k5() {
      return this.a6[2];
   }

   public String u3() {
      return this.a6[3];
   }

   public String a6() {
      return this.a6[4];
   }

   public boolean u9() {
      if (!com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(this.l6), "digest ")) {
         return false;
      }

      this.u3 = 6;
      this.k5 = this.l6.length();

      while (this.u3 < this.k5) {
         Object var1 = null;
         String var2 = null;
         String[] var3 = new String[]{(String)var1};
         String[] var4 = new String[]{var2};
         boolean var5 = !this.n5(var3, var4);
         String var7 = var3[0];
         var2 = var4[0];
         if (var5) {
            return false;
         }

         this.h0();
         if (this.u3 < this.k5 && this.l6.charAt(this.u3) == ',') {
            this.u3++;
         }

         int var6 = com.aspose.slides.ms.System.u3.n5(n5, var7);
         if (var6 != -1) {
            if (this.a6[var6] != null) {
               return false;
            }

            this.a6[var6] = var2;
         }
      }

      return this.n5() != null && this.k5() != null;
   }

   private void h0() {
      char var1 = ' ';

      while (this.u3 < this.k5 && (var1 == ' ' || var1 == '\t' || var1 == '\r' || var1 == '\n')) {
         var1 = this.l6.charAt(this.u3++);
      }

      this.u3--;
   }

   private String c8() {
      this.h0();
      int var1 = this.u3;

      while (this.u3 < this.k5 && this.l6.charAt(this.u3) != '=') {
         this.u3++;
      }

      return com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(this.l6, var1, this.u3 - var1)));
   }

   private boolean n5(String[] var1, String[] var2) {
      var1[0] = null;
      var2[0] = null;
      var1[0] = this.c8();
      if (this.u3 >= this.k5) {
         return false;
      }

      this.h0();
      if (this.u3 + 1 < this.k5 && this.l6.charAt(this.u3++) == '=') {
         this.h0();
         if (this.u3 + 1 >= this.k5) {
            return false;
         }

         boolean var3 = false;
         if (this.l6.charAt(this.u3) == '"') {
            this.u3++;
            var3 = true;
         }

         int var4 = this.u3;
         if (var3) {
            this.u3 = com.aspose.slides.ms.System.d1.l6(this.l6, '"', this.u3);
            if (this.u3 == -1) {
               return false;
            }
         } else {
            char var5;
            do {
               var5 = this.l6.charAt(this.u3);
            } while (var5 != ',' && var5 != ' ' && var5 != '\t' && var5 != '\r' && var5 != '\n' && ++this.u3 < this.k5);

            if (this.u3 >= this.k5 && var4 == this.u3) {
               return false;
            }
         }

         var2[0] = com.aspose.slides.ms.System.d1.l6(this.l6, var4, this.u3 - var4);
         this.u3 += var3 ? 2 : 1;
         return true;
      } else {
         return false;
      }
   }
}
