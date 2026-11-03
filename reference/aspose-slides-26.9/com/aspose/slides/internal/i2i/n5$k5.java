package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;

public class n5$k5 {
   private byte n5;
   private String l6;
   private n5$n5 k5;
   private k5 u3;
   private ArrayList a6;
   private n5$u3 u9;
   private boolean h0;
   private boolean c8;

   public n5$k5() {
      this.n5 = 1;
      this.k5 = new n5$n5();
      this.u3 = new k5();
      this.a6 = new ArrayList();
      this.u9 = new n5$u3();
      this.h0 = true;
      this.c8 = false;
   }

   public n5$k5(com.aspose.slides.internal.x8w.l6 var1) {
      if (var1.n5(0).l6() != 48 || var1.n5(0).n5() < 4) {
         throw new ArgumentException("Invalid SignedData");
      }

      if (var1.n5(0).n5(0).l6() != 2) {
         throw new ArgumentException("Invalid version");
      }

      this.n5 = var1.n5(0).n5(0).u3()[0];
      this.k5 = new n5$n5(var1.n5(0).n5(2));
      int var2 = 3;
      this.u3 = new k5();
      if ((var1.n5(0).n5(var2).l6() & 255) == 160) {
         for (int var3 = 0; var3 < var1.n5(0).n5(var2).n5(); var3++) {
            this.u3.n5(new l6(var1.n5(0).n5(var2).n5(var3).a6()));
         }

         var2++;
      }

      this.a6 = new ArrayList();
      if ((var1.n5(0).n5(var2).l6() & 255) == 161) {
         for (int var4 = 0; var4 < var1.n5(0).n5(var2).n5(); var4++) {
            this.a6.addItem(var1.n5(0).n5(var2).n5(var4).a6());
         }

         var2++;
      }

      if (var1.n5(0).n5(var2).n5() > 0) {
         this.u9 = new n5$u3(var1.n5(0).n5(var2));
      } else {
         this.u9 = new n5$u3();
      }

      if (this.u9.k5() != null) {
         this.n5(this.l6(this.u9.k5()));
      }

      this.h0 = this.u9.l6().size() > 0;
   }

   public k5 n5() {
      return this.u3;
   }

   public void n5(String var1) {
      this.l6 = var1;
      this.u9.n5(var1);
   }

   public n5$u3 l6() {
      return this.u9;
   }

   String l6(String var1) {
      switch (com.aspose.slides.internal.i2i.n5.n5().n5(var1)) {
         case 0:
            return "SHA1";
         case 1:
            return "MD2";
         case 2:
            return "MD5";
         case 3:
            return "SHA256";
         case 4:
            return "SHA384";
         case 5:
            return "SHA512";
         default:
            return var1;
      }
   }
}
