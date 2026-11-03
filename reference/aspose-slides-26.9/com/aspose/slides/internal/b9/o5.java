package com.aspose.slides.internal.b9;

public class o5 extends s9 {
   private com.aspose.slides.internal.t5.t2 n5;
   private byte[] l6;
   private byte[] k5;
   private String u3;

   public o5(s9 var1) {
      super(var1);
      this.n5(new com.aspose.slides.internal.t5.t2());
   }

   public o5(o5 var1) {
      super(var1);
      this.n5(var1.u3());
      this.l6(var1.k5());
      this.n5(var1.n5());
      this.n5(var1.l6());
   }

   public o5(com.aspose.slides.internal.d9.n5 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.t5.t2 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.t5.t2 var1) {
      this.n5 = var1;
   }

   public final byte[] l6() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final byte[] k5() {
      return this.k5;
   }

   public final void l6(byte[] var1) {
      this.k5 = var1;
   }

   public final String u3() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, EmfHeader: {1}, EmfHeaderRecordBuffer: {2}, EmfDescriptionBuffer: {3}, EmfDescription: {4}",
         super.toString(),
         this.n5,
         this.l6,
         this.k5,
         this.u3
      );
   }

   protected final boolean n5(o5 var1) {
      return super.n5(var1)
         && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6)
         && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5)
         && com.aspose.slides.ms.System.d1.a6(this.u3, var1.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((o5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
      return var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
   }
}
