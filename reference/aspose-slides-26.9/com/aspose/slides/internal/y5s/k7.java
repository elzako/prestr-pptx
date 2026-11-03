package com.aspose.slides.internal.y5s;

public abstract class k7 extends m3 {
   protected k7() {
   }

   protected k7(com.aspose.slides.internal.j3b.u3 var1) {
      super(var1);
   }

   @Override
   public final boolean u3() {
      return com.aspose.slides.internal.v6g.k5.l6(this.m1(), com.aspose.slides.internal.u7c.n5.class);
   }

   @Override
   public final void a6() {
      this.n5(j5.n5().n3(), (int[])null);
   }

   protected abstract void n5(int var1, int var2);

   protected void q0() {
   }

   @Override
   protected final void n5(j5 var1, int[] var2) {
      if (!com.aspose.slides.internal.v6g.k5.l6(this.m1(), com.aspose.slides.internal.u7c.n5.class)) {
         com.aspose.slides.internal.u7c.n5 var3 = null;

         try {
            var3 = new com.aspose.slides.internal.u7c.n5(this.t9(), this.n3());
            var3.n5(this.y4());
            if (j5.l6(var1, this.s7()) && var2 != null) {
               var3.l6(var1.n3(), var2);
            } else {
               z1 var4 = new z1(var3);
               this.k5(this.s7().n3(), var4);
               if (var2 != null) {
                  var3.l6(var1.n3(), var2);
               }
            }
         } catch (RuntimeException var5) {
            if (var3 != null) {
               var3.dispose();
            }

            throw var5;
         }

         this.n5(var3);
      } else if (var2 != null) {
         com.aspose.slides.internal.v6g.k5.n5(this.m1(), com.aspose.slides.internal.u7c.n5.class).l6(var1.n3(), var2);
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.j3b.u3 var1, com.aspose.slides.internal.j3b.u3 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.m1(), com.aspose.slides.internal.u7c.n5.class)) {
         com.aspose.slides.internal.v6g.k5.n5(this.m1(), com.aspose.slides.internal.u7c.n5.class).n5(var2);
      }

      super.n5(var1, var2);
   }

   protected void n5(com.aspose.slides.internal.u7c.n5 var1) {
      this.n5((com.aspose.slides.internal.j3b.s7)var1);
      if (var1 != null) {
         this.n5(var1.t9(), var1.n3());
      }

      this.q0();
   }
}
