package com.aspose.slides.internal.n2d;

public class t2 {
   public static double n5 = 72.0;
   public static final int l6 = com.aspose.slides.internal.v6g.k5.u3(50.0, 14);

   public static double n5(double var0) {
      return n5(var0, 96.0);
   }

   public static double n5(double var0, double var2) {
      return var0 / n5 * var2;
   }

   public static int l6(double var0) {
      return t4.n5(n5(var0));
   }

   public static double k5(double var0) {
      return var0 / a6();
   }

   public static int u3(double var0) {
      return t4.n5(k5(var0));
   }

   public static double a6(double var0) {
      return l6(var0, 96.0);
   }

   public static double l6(double var0, double var2) {
      return var0 / var2 * n5;
   }

   public static double u9(double var0) {
      return var0 / n5;
   }

   public static double h0(double var0) {
      return var0 * u9();
   }

   public static double c8(double var0) {
      return var0 * h0();
   }

   public static int t2(double var0) {
      return t4.n5(var0 * 20.0);
   }

   public static int s7(double var0) {
      return t4.n5(var0 * 12700.0);
   }

   public static double n5(int var0) {
      return var0 / t2();
   }

   public static float x8(double var0) {
      return (float)(var0 * c8());
   }

   public static float n3(double var0) {
      return (float)(var0 / c8());
   }

   public static float n5() {
      return (float)n5 * 0.01F;
   }

   public static float l6() {
      return (float)n5 * 0.001F;
   }

   private static double u9() {
      return n5 / 25.4;
   }

   public static float k5() {
      return (float)u9() * 0.1F;
   }

   public static float u3() {
      return (float)u9() * 0.01F;
   }

   public static float a6() {
      return (float)u9() * 0.001F;
   }

   private static double h0() {
      return u9() * 10.0;
   }

   private static double c8() {
      return n5 / 576.0;
   }

   private static double t2() {
      return 12700.0 * n5;
   }
}
