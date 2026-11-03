package com.aspose.slides.internal.w4w;

public enum a6$n5 {
   Object(Object.class),
   BooleanPrimitive(boolean.class),
   BooleanObject(Boolean.class),
   BytePrimitive(byte.class),
   ByteObject(Byte.class),
   ShortPrimitive(short.class),
   ShortObject(Short.class),
   CharPrimitive(char.class),
   CharObject(Character.class),
   IntPrimitive(int.class),
   IntObject(Integer.class),
   FloatPrimitive(float.class),
   FloatObject(Float.class),
   LongPrimitive(long.class),
   LongObject(Long.class),
   DoublePrimitive(double.class),
   DoubleObject(Double.class);

      // Preserve original obfuscated fields while restoring Enum.name()/valueOf().
      public static final a6$n5 n5 = Object;
      public static final a6$n5 l6 = BooleanPrimitive;
      public static final a6$n5 k5 = BooleanObject;
      public static final a6$n5 u3 = BytePrimitive;
      public static final a6$n5 a6 = ByteObject;
      public static final a6$n5 u9 = ShortPrimitive;
      public static final a6$n5 h0 = ShortObject;
      public static final a6$n5 c8 = CharPrimitive;
      public static final a6$n5 t2 = CharObject;
      public static final a6$n5 s7 = IntPrimitive;
      public static final a6$n5 x8 = IntObject;
      public static final a6$n5 n3 = FloatPrimitive;
      public static final a6$n5 y4 = FloatObject;
      public static final a6$n5 e2 = LongPrimitive;
      public static final a6$n5 t9 = LongObject;
      public static final a6$n5 z1 = DoublePrimitive;
      public static final a6$n5 t4 = DoubleObject;
      private static final a6$n5[] z3 = {Object, BooleanPrimitive, BooleanObject, BytePrimitive, ByteObject, ShortPrimitive, ShortObject, CharPrimitive, CharObject, IntPrimitive, IntObject, FloatPrimitive, FloatObject, LongPrimitive, LongObject, DoublePrimitive, DoubleObject};


   private Class<?> q0;

   public static a6$n5[] n5() {
      return (a6$n5[])z3.clone();
   }

   a6$n5(Class<?> var3) {
      this.q0 = var3;
   }

   public static a6$n5 n5(Class<?> var0) {
      if (var0.equals(boolean.class)) {
         return l6;
      } else if (var0.equals(Boolean.class)) {
         return k5;
      } else if (var0.equals(byte.class)) {
         return u3;
      } else if (var0.equals(Byte.class)) {
         return a6;
      } else if (var0.equals(short.class)) {
         return u9;
      } else if (var0.equals(Short.class)) {
         return h0;
      } else if (var0.equals(char.class)) {
         return c8;
      } else if (var0.equals(Character.class)) {
         return t2;
      } else if (var0.equals(int.class)) {
         return s7;
      } else if (var0.equals(Integer.class)) {
         return x8;
      } else if (var0.equals(float.class)) {
         return n3;
      } else if (var0.equals(Float.class)) {
         return y4;
      } else if (var0.equals(long.class)) {
         return e2;
      } else if (var0.equals(Long.class)) {
         return t9;
      } else if (var0.equals(double.class)) {
         return z1;
      } else {
         return var0.equals(Double.class) ? t4 : n5;
      }
   }
}
