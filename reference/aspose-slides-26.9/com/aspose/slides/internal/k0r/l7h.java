package com.aspose.slides.internal.k0r;

public class l7h extends d0 {
   public m2 l6() {
      z4 var1 = this.n5("___PPT9");
      return var1 == null ? null : (m2)var1.l6();
   }

   public g4 u3() {
      z4 var1 = this.n5("___PPT10");
      return var1 == null ? null : (g4)var1.l6();
   }

   public f3 a6() {
      z4 var1 = this.n5("___PPT12");
      return var1 == null ? null : (f3)var1.l6();
   }

   public m2 u9() {
      z4 var1 = this.n5("___PPT9");
      if (var1 == null) {
         var1 = new m6n();
         z1 var2 = new z1("___PPT9", (short)0);
         var2.l6(var1);
         var1.e2().addItem(var2);
         m2 var3 = new m2();
         var3.l6(var1);
         var1.e2().addItem(var3);
         var1.l6(this);
         this.e2().addItem(var1);
         return var3;
      } else {
         return (m2)var1.l6();
      }
   }
}
