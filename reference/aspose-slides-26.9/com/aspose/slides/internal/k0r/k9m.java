package com.aspose.slides.internal.k0r;

public class k9m extends d0 {
   public e1 l6() {
      z4 var1 = this.n5("___PPT9");
      return var1 == null ? null : (e1)var1.l6();
   }

   public v1 u3() {
      z4 var1 = this.n5("___PPT10");
      return var1 == null ? null : (v1)var1.l6();
   }

   public m6 a6() {
      z4 var1 = this.n5("___PPT11");
      return var1 == null ? null : (m6)var1.l6();
   }

   public e1 u9() {
      z4 var1 = this.n5("___PPT9");
      if (var1 == null) {
         var1 = new e3m();
         z1 var2 = new z1("___PPT9", (short)0);
         var2.l6(var1);
         var1.e2().addItem(var2);
         e1 var3 = new e1();
         var3.l6(var1);
         var1.e2().addItem(var3);
         var1.l6(this);
         this.e2().addItem(var1);
         return var3;
      } else {
         return (e1)var1.l6();
      }
   }
}
