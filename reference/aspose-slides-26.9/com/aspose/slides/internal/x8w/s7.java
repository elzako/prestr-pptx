package com.aspose.slides.internal.x8w;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class s7 {
   private static volatile Random n5;

   private static Random n5() {
      if (n5 == null) {
         n5 = new SecureRandom();
      }

      return n5;
   }

   public static BigInteger n5(byte[] var0) {
      return new BigInteger(1, var0);
   }

   public static byte[] n5(BigInteger var0) {
      byte[] var1 = var0.toByteArray();
      if (var1[0] != 0) {
         return var1;
      }

      int var2 = var1.length;
      byte[] var3 = new byte[var2 - 1];
      System.arraycopy(var1, 1, var3, 0, var2 - 1);
      return var3;
   }

   public static BigInteger n5(BigInteger var0, BigInteger var1) {
      return var0.add(var1);
   }

   public static BigInteger l6(BigInteger var0, BigInteger var1) {
      return var0.subtract(var1);
   }

   public static BigInteger n5(BigInteger var0, long var1) {
      return var0.multiply(BigInteger.valueOf(var1));
   }

   public static BigInteger k5(BigInteger var0, BigInteger var1) {
      return var0.multiply(var1);
   }

   public static BigInteger u3(BigInteger var0, BigInteger var1) {
      return var0.divide(var1);
   }

   public static int l6(BigInteger var0, long var1) {
      return l6(var0.mod(BigInteger.valueOf(var1)));
   }

   public static BigInteger a6(BigInteger var0, BigInteger var1) {
      return var0.mod(var1);
   }

   public static int l6(BigInteger var0) {
      return var0.intValue();
   }

   public static BigInteger n5(long var0) {
      return BigInteger.valueOf(var0);
   }

   public static boolean u9(BigInteger var0, BigInteger var1) {
      return var0.compareTo(var1) > 0;
   }

   public static boolean h0(BigInteger var0, BigInteger var1) {
      return var0.compareTo(var1) >= 0;
   }

   public static boolean c8(BigInteger var0, BigInteger var1) {
      return var0.compareTo(var1) < 0;
   }

   public static boolean t2(BigInteger var0, BigInteger var1) {
      return var0.compareTo(var1) <= 0;
   }

   public static boolean s7(BigInteger var0, BigInteger var1) {
      return var0.equals(var1);
   }

   public static boolean n5(BigInteger var0, int var1) {
      return var0.equals(BigInteger.valueOf(var1));
   }

   public static BigInteger n5(int var0) {
      return new BigInteger(var0, n5());
   }

   public static BigInteger l6(int var0) {
      return BigInteger.probablePrime(var0, n5());
   }
}
