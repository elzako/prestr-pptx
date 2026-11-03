package com.aspose.slides.internal.z8;

import com.aspose.slides.ms.System.d1;

public class u9 {
   private static final long[] n5 = new long[]{0L, 0L, 2281701374L, 134217726L};
   private static final long[] l6 = new long[]{0L, 67051520L, 2281701374L, 134217726L};

   public static boolean n5(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'f' || var0 >= 'A' && var0 <= 'F';
   }

   public static int l6(char var0) {
      return var0 >= 48 && var0 <= 57 ? var0 - 48 : var0 - 97 + 10;
   }

   public static u3 n5(Throwable var0) {
      return new u3(var0.getMessage());
   }

   public static u3 n5(String var0) {
      return new u3(var0);
   }

   public static u3 n5(com.aspose.slides.internal.l6.n3 var0) {
      return new u3(d1.n5("Invalid color '{0}' at line {1}:{2}",new Object[]{ var0.x8(), var0.c8(), var0.t2()}));
   }

   public static u3 l6(String var0) {
      String var1 = d1.n5("Invalid identifier '{0}'.", new Object[]{var0});
      return new u3(var1);
   }

   public static u3 l6(com.aspose.slides.internal.l6.n3 var0) {
      return n5(var0.s7(), var0.x8());
   }

   public static u3 n5(int var0, String var1) {
      String var2 = d1.n5("Invalid token '{0}'.", new Object[]{var1});
      return new u3(var2);
   }

   public static u3 n5(short var0) {
      String var1 = d1.n5("Lexical unit '{0}' is not supported.", new Object[]{var0});
      return new u3(var1);
   }

   public static u3 k5(String var0) {
      String var1 = d1.n5("Invalid property value '{0}'.", new Object[]{var0});
      return new u3(var1);
   }

   public static u3 u3(String var0) {
      String var1 = d1.n5("Invalid property values '{0}'.", new Object[]{var0});
      return new u3(var1);
   }

   public static u3 a6(String var0) {
      String var1 = d1.n5("Malformed function '{0}'.", new Object[]{var0});
      return new u3(var1);
   }
}
