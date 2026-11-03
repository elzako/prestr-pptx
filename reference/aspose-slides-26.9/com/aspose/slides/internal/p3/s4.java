package com.aspose.slides.internal.p3;

public abstract class s4 extends d1 {
   private com.aspose.slides.internal.v8.u9 n5;
   private boolean l6;
   private v3 k5;
   private boolean u3;
   private boolean a6;

   public s4(j8 var1, com.aspose.slides.internal.v8.u9 var2, v3 var3, boolean var4, boolean var5, boolean var6) {
      super(var1);
      this.n5 = var2;
      this.k5 = var3;
      this.l6 = var4;
      this.u3 = var5;
      this.a6 = var6;
   }

   @Override
   public boolean a6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.v8.u9 s7() {
      return this.n5;
   }

   public final void l6(com.aspose.slides.internal.v8.u9 var1) {
      this.n5 = var1;
   }

   public final v3 x8() {
      return this.k5;
   }

   public final boolean n3() {
      return this.u3;
   }

   public final boolean t9() {
      return this.a6;
   }

   public abstract void n5(com.aspose.slides.internal.v8.u9 var1);

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(this.x8().n5()).n5(", ");
      var1.n5(this.n5.toString());
      if (this.a6()) {
         var1.n5("[discard]");
      } else {
         var1.n5("[RETAIN]");
      }

      if (this.n3()) {
         var1.n5("[first]");
      }

      if (this.t9()) {
         var1.n5("[last]");
      }

      return var1.toString();
   }
}
