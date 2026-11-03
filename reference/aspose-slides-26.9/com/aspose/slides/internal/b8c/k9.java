package com.aspose.slides.internal.b8c;

public class k9 extends d8 {
   private String n5;
   private int l6 = 0;
   private i4 k5;

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final i4 l6() {
      return this.k5;
   }

   public final int u9() {
      return this.l6 == 0 ? 3 : this.l6;
   }

   public final void k5(String var1) {
      if (this.n5 != null) {
         this.k5 = new i4(this.n5, var1);
      } else {
         this.k5 = new i4();
      }
   }

   public final void a6(String var1) {
      if (this.n5 != null) {
         this.k5 = new q2(this.n5, var1);
      } else {
         this.k5 = new i4();
      }
   }

   public final boolean n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      return this.k5.n5(var1.n5());
   }

   public static boolean n5(k9 var0, k9 var1) {
      return i4.n5(var0.l6(), var1.l6());
   }

   public static k9 n5(k9 var0, k9 var1, boolean var2) {
      i4 var3 = i4.l6(var0.l6(), var1.l6(), var2);
      if (var3 != null) {
         k9 var4 = new k9();
         var4.k5 = var3;
         var4.n5(var0.n5());
         var4.l6(var0.u3());
         return var4;
      } else {
         return null;
      }
   }

   public static k9 l6(k9 var0, k9 var1, boolean var2) {
      i4 var3 = i4.n5(var0.l6(), var1.l6(), var2);
      if (var3 != null) {
         k9 var4 = new k9();
         var4.k5 = var3;
         var4.l6 = var0.l6;
         var4.l6(var0.u3());
         return var4;
      } else {
         return null;
      }
   }
}
