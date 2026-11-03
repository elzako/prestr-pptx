package com.aspose.slides.internal.p3;

public class u9 {
   public static final u9 n5 = new u9("none");
   public static final u9 l6 = new u9("space-before");
   public static final u9 k5 = new u9("space-after");
   public static final u9 u3 = new u9("line-number");
   public static final u9 a6 = new u9("line-height");
   private final String u9;

   private u9(String var1) {
      this.u9 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.ms.System.d1.a6(this.u9, ((u9)obj).u9);
   }

   @Override
   public int hashCode() {
      return this.u9 != null ? this.u9.hashCode() : 0;
   }

   @Override
   public String toString() {
      return this.u9;
   }
}
