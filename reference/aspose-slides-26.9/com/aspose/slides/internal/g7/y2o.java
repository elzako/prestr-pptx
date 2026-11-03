package com.aspose.slides.internal.g7;

public class y2o extends c9t implements c6, l1, o3 {
   private h3r n5;
   private Object l6 = new Object();
   private boolean k5 = true;
   private c9t$n5 u3;
   private c9t a6;

   public y2o(c9t var1) {
      super(var1.y1(), 0L, 0L, 0L);
      this.u3 = new c9t$n5(var1.n5().n5());

      for (int var2 = 0; var2 < var1.n5().n5(); var2++) {
         this.u3.l6(0);
      }

      this.a6 = var1;
   }

   public final void n5(h3r var1) {
      this.n5 = var1;
      var1.y4().n5.n5(this);
      var1.y4().l6.n5(this);
      var1.y4().k5.n5(this);
   }

   @Override
   public c9t$n5 n5() {
      this.l6();
      return this.u3;
   }

   private void l6() {
      if (this.k5) {
         synchronized (this.l6) {
            if (this.k5) {
               long var2 = 0L;

               for (int var4 = 0; var4 < this.u3.n5(); var4++) {
                  this.u3.n5(var4, var2);
                  if (this.n5.k7().l6(var4)) {
                     this.u3.n5(var4, var2);
                     long var5 = this.a6.n5().n5(var4);
                     long var7 = (this.a6.n5().n5(var4 + 1) & 4294967295L) - (var5 & 4294967295L) & 4294967295L;
                     var2 = (var2 & 4294967295L) + (var7 & 4294967295L) & 4294967295L;
                  }
               }

               this.k5 = false;
            }
         }
      }
   }

   @Override
   public final void n5(Object var1) {
      this.k5 = true;
   }

   @Override
   public final void n5(Object var1, c7 var2) {
      this.k5 = true;
   }
}
