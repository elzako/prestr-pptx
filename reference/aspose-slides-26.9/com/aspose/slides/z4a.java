package com.aspose.slides;

class z4a implements com.aspose.slides.ms.System.a5<z4a> {
   private boolean n5;
   private boolean l6;
   private int k5;
   private int u3;
   private com.aspose.slides.ms.System.o5<Byte> a6 = new com.aspose.slides.ms.System.o5<>();
   private boolean u9;

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.ms.System.o5<Byte> a6() {
      return this.a6.k5();
   }

   public final void n5(com.aspose.slides.ms.System.o5<Byte> var1) {
      this.a6 = var1.k5();
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void k5(boolean var1) {
      this.u9 = var1;
   }

   final boolean h0() {
      return d3v.n5(new z4a(), this);
   }

   public z4a() {
      this.n5(1);
      this.l6(3);
   }

   public z4a(z4a var1) {
      this.n5(var1.n5());
      this.l6(var1.l6());
      this.n5(var1.k5());
      this.l6(var1.u3());
      this.n5(var1.a6().k5());
      this.k5(var1.u9());
   }

   public final boolean n5(z4a var1) {
      return var1 == null
         ? false
         : this.n5() == var1.n5()
            && this.l6() == var1.l6()
            && this.k5() == var1.k5()
            && this.u3() == var1.u3()
            && com.aspose.slides.ms.System.o5.n5(this.a6(), var1.a6())
            && this.u9() == var1.u9();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.ms.System.j8.n5(obj) == com.aspose.slides.ms.System.j8.n5(this) && this.n5((z4a)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
