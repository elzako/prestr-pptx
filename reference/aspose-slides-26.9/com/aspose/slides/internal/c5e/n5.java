package com.aspose.slides.internal.c5e;

public enum n5 {
   FILTER_NONE(0),
   FILTER_SUB(1),
   FILTER_UP(2),
   FILTER_AVERAGE(3),
   FILTER_PAETH(4),
   FILTER_DEFAULT(-1),
   FILTER_AGGRESSIVE(-2),
   FILTER_VERYAGGRESSIVE(-3),
   FILTER_CYCLIC(-50),
   FILTER_UNKNOWN(-100);

      // Preserve original obfuscated fields while restoring Enum.name()/valueOf().
      public static final n5 n5 = FILTER_NONE;
      public static final n5 l6 = FILTER_SUB;
      public static final n5 k5 = FILTER_UP;
      public static final n5 u3 = FILTER_AVERAGE;
      public static final n5 a6 = FILTER_PAETH;
      public static final n5 u9 = FILTER_DEFAULT;
      public static final n5 h0 = FILTER_AGGRESSIVE;
      public static final n5 c8 = FILTER_VERYAGGRESSIVE;
      public static final n5 t2 = FILTER_CYCLIC;
      public static final n5 s7 = FILTER_UNKNOWN;
      private static final n5[] n3 = {FILTER_NONE, FILTER_SUB, FILTER_UP, FILTER_AVERAGE, FILTER_PAETH, FILTER_DEFAULT, FILTER_AGGRESSIVE, FILTER_VERYAGGRESSIVE, FILTER_CYCLIC, FILTER_UNKNOWN};


   public final int x8;

   public static n5[] n5() {
      return (n5[])n3.clone();
   }

   n5(int var3) {
      this.x8 = var3;
   }

   public static n5 n5(int var0) {
      for (n5 var4 : n5()) {
         if (var4.x8 == var0) {
            return var4;
         }
      }

      return null;
   }
}
