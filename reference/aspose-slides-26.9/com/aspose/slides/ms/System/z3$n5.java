package com.aspose.slides.ms.System;

enum z3$n5 {
   BooleanClass(Boolean.class),
   CharClass(Character.class),
   ByteClass(Byte.class),
   ShortClass(Short.class),
   IntClass(Integer.class),
   LongClass(Long.class),
   FloatClass(Float.class),
   DoubleClass(Double.class),
   DecimalClass(c4.class),
   StringClass(String.class),
   DateTimeClass(j5.class),
   ObjectClass(Object.class);

      // Preserve original obfuscated fields while restoring Enum.name()/valueOf().
      public static final z3$n5 n5 = BooleanClass;
      public static final z3$n5 l6 = CharClass;
      public static final z3$n5 k5 = ByteClass;
      public static final z3$n5 u3 = ShortClass;
      public static final z3$n5 a6 = IntClass;
      public static final z3$n5 u9 = LongClass;
      public static final z3$n5 h0 = FloatClass;
      public static final z3$n5 c8 = DoubleClass;
      public static final z3$n5 t2 = DecimalClass;
      public static final z3$n5 s7 = StringClass;
      public static final z3$n5 x8 = DateTimeClass;
      public static final z3$n5 n3 = ObjectClass;
      private static final z3$n5[] e2 = {BooleanClass, CharClass, ByteClass, ShortClass, IntClass, LongClass, FloatClass, DoubleClass, DecimalClass, StringClass, DateTimeClass, ObjectClass};


   private final Class<?> y4;

   public static z3$n5[] n5() {
      return (z3$n5[])e2.clone();
   }

   z3$n5(Class<?> var3) {
      this.y4 = var3;
   }

   // $VF: synthetic method
   static Class n5(z3$n5 var0) {
      return var0.y4;
   }
}
