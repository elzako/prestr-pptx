package com.aspose.slides.internal.c3;

import com.aspose.slides.Collections.Generic.List;

public abstract class n5 extends y8 {
   protected com.aspose.slides.internal.l7h.a5 n5 = new com.aspose.slides.internal.l7h.a5();
   private boolean k5;
   private n5$l6 u3 = new n5$l6();
   private n5$n5 a6;
   private com.aspose.slides.internal.f5.d2 u9;

   protected n5(int var1) {
      super(var1);
   }

   public final String n5() {
      return this.n5.toString();
   }

   public final void n5(String var1) {
      this.n5.l6(0, this.n5.l6());
      this.n5.n5(var1);
   }

   public final boolean l6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final n5$l6 k5() {
      return this.u3;
   }

   public final com.aspose.slides.internal.f5.d2 u3() {
      if (this.u9 == null) {
         this.u9 = com.aspose.slides.internal.f5.d2.n5(this.n5());
      }

      return this.u9;
   }

   public final void n5(char var1) {
      if (!com.aspose.slides.ms.System.t9.c8(var1)) {
         var1 = com.aspose.slides.ms.System.t9.z1(var1);
      }

      this.n5.n5(var1);
   }

   public final void l6(char var1) {
      this.a6.n5(var1);
   }

   public final void k5(char var1) {
      this.a6.l6(var1);
   }

   public final void n5(char[] var1) {
      this.a6.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.j3.s7 var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < this.u3.size(); var3++) {
         n5$n5 var4 = this.u3.get_Item(var3);
         String var5 = var4.n5();
         if (var2.containsItem(var5)) {
            if (var1 != null) {
               var1.n5(
                  new com.aspose.slides.internal.f5.t2(
                     (byte)2,
                     com.aspose.slides.ms.System.d1.n5("Duplicate attribute name '{0}'", new Object[]{var5}),
                     "",
                     null,
                     null,
                     new com.aspose.slides.internal.f5.y4(-1L, -1L, 0L, -1L, null, null)
                  )
               );
            }

            this.u3.removeAt(var3);
            var3--;
         } else {
            var2.addItem(var4.n5());
         }
      }
   }

   public final void a6() {
      this.a6 = new n5$n5();
      this.u3.addItem(this.a6);
   }

   public final void n5(String var1, String var2) {
      if (this.u3 == null) {
         this.u3 = new n5$l6();
      }

      this.a6 = new n5$n5(var1, var2);
      this.u3.addItem(this.a6);
   }

   public final boolean n5(com.aspose.slides.internal.f5.d2 var1) {
      return this.u3().n5(var1);
   }
}
