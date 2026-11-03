package com.aspose.slides.internal.v9e;

import com.aspose.slides.ms.System.Xml.z9;

public class v0 {
   private com.aspose.slides.ms.System.Xml.a0 n5 = new com.aspose.slides.ms.System.Xml.a0(10);
   private String l6;
   private a5 k5;
   private z9 u3;
   private int a6;

   public final String n5() {
      return this.l6;
   }

   public final h2 l6() {
      return (h2)this.n5.k5();
   }

   public v0(z9 var1, a5 var2) {
      this.u3 = var1;
      this.k5 = var2;
      this.l6 = this.k5.n5();
      h2 var3 = (h2)this.n5.n5();
      if (var3 == null) {
         var3 = new h2();
         this.n5.n5(var3);
      }

      var3.n5(
         com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, 0, com.aspose.slides.ms.System.d1.n5, false
      );
   }

   public final void n5(String var1, String var2) {
      this.l6().n5(var1, var2, this.l6);
      if (var1 == null || var1.length() == 0) {
         this.l6 = var2;
      }
   }

   public final void n5(String var1, String var2, String var3) {
      h2 var4 = this.l6();
      h2 var5 = (h2)this.n5.n5();
      if (var5 == null) {
         var5 = new h2();
         this.n5.n5(var5);
      }

      var5.n5(var1, var2, var3, var4.a6(), var4.u9(), var4.h0());
   }

   public final void k5() {
      h2 var1 = (h2)this.n5.l6();

      for (e5 var2 = var1.n5(); var2 != null; var2 = var2.u3()) {
         this.l6 = var2.k5();
      }
   }

   public final String n5(String var1) {
      boolean var2 = false;
      boolean[] var3 = new boolean[]{false};
      String var4 = this.n5(var1, var3);
      var2 = var3[0];
      return var4;
   }

   public final String n5(String var1, boolean[] var2) {
      var2[0] = true;
      if (var1 != null && var1.length() != 0) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var1, this.k5.a6())) {
            return this.k5.u9();
         }

         if (com.aspose.slides.ms.System.Xml.v8.n5(var1, this.k5.u3())) {
            return this.k5.h0();
         }

         for (int var3 = this.n5.u3() - 1; var3 >= 0; var3--) {
            h2 var4 = (h2)this.n5.n5(var3);
            String var5 = var4.n5(var1);
            if (var5 != null) {
               var2[0] = var3 == this.n5.u3() - 1;
               return var5;
            }
         }

         return null;
      } else {
         return this.l6;
      }
   }

   public final boolean n5(String var1, String[] var2) {
      for (int var3 = this.n5.u3() - 1; 0 <= var3; var3--) {
         h2 var4 = (h2)this.n5.n5(var3);
         String var5 = null;
         String[] var6 = new String[]{var5};
         boolean var7 = var4.n5(var1, var6);
         var5 = var6[0];
         if (var7) {
            String var8 = this.n5(var5);
            if (var8 != null && com.aspose.slides.ms.System.Xml.v8.n5(var8, var1)) {
               var2[0] = var5;
               return true;
            }
            break;
         }
      }

      var2[0] = null;
      return false;
   }

   public final String l6(String var1) {
      String var2;
      do {
         var2 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.k5(), var1, this.a6++);
      } while (this.u3.l6(var2) != null);

      return this.u3.n5(var2);
   }
}
