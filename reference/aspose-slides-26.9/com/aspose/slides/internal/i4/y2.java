package com.aspose.slides.internal.i4;

public abstract class y2 {
   private String u3;
   protected boolean n5;
   protected boolean l6;
   protected boolean k5;
   private y1 a6;
   private boolean u9;

   public final String n5() {
      return this.u3;
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean u3() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final y1 a6() {
      return this.a6;
   }

   public boolean u9() {
      return this.u9;
   }

   public void u3(boolean var1) {
      this.u9 = var1;
   }

   public abstract boolean h0();

   public void c8() {
      this.u3(true);
   }

   public abstract y2 t2();

   public abstract g7 n5(y1 var1);

   public abstract void n5(y1 var1, g7 var2);

   public abstract int s7();

   public static y2 n5(j9 var0, y1 var1, String var2, g7 var3) {
      if (!"Object".equals(var3.u3())) {
         throw new n1(var0.m3().u9("The target object has to be an instance of an object"));
      }

      j4 var4 = (j4)var3;
      if (!var4.u3("value") && !var4.u3("writable") || !var4.u3("set") && !var4.u3("get")) {
         g7 var5 = null;
         y2 var6;
         if (var4.u3("value")) {
            var6 = new u2(var1, var2, var4.n5("value"));
         } else {
            var6 = new c2(var0, var1, var2);
         }

         g7[] var7 = new g7[]{var5};
         boolean var8 = var4.n5("enumerable", var7);
         var5 = var7[0];
         if (var8) {
            var6.n5(var5.n5());
         }

         var7[0] = var5;
         boolean var9 = var4.n5("configurable", var7);
         var5 = var7[0];
         if (var9) {
            var6.l6(var5.n5());
         }

         var7[0] = var5;
         boolean var10 = var4.n5("writable", var7);
         var5 = var7[0];
         if (var10) {
            var6.k5(var5.n5());
         }

         var7[0] = var5;
         boolean var11 = var4.n5("get", var7);
         var5 = var7[0];
         if (var11) {
            u6 var12 = com.aspose.slides.internal.v6g.k5.n5(var5, u6.class);
            if (var12 == null) {
               throw new n1(var0.m3().u9("The getter has to be a function"));
            }

            ((c2)var6).n5(var12);
         }

         var7[0] = var5;
         boolean var19 = var4.n5("set", var7);
         var5 = var7[0];
         if (var19) {
            u6 var13 = com.aspose.slides.internal.v6g.k5.n5(var5, u6.class);
            if (var13 == null) {
               throw new n1(var0.m3().u9("The setter has to be a function"));
            }

            ((c2)var6).l6(var13);
         }

         return var6;
      } else {
         throw new n1(var0.m3().u9("The property cannot be both writable and have get/set accessors or cannot have both a value and an accessor defined"));
      }
   }

   public y2(y1 var1, String var2) {
      this.a6 = var1;
      this.u3 = var2;
   }
}
