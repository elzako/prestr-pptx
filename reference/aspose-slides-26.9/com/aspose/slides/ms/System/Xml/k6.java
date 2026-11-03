package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;

@com.aspose.slides.ms.System.j3
public class k6 implements Cloneable {
   private static k6$n5 l6 = null;
   private String k5;
   private String u3;
   @com.aspose.slides.ms.System.e9
   private int a6;
   public static final k6 n5 = new k6(com.aspose.slides.ms.System.d1.n5);

   public k6() {
      this(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);
   }

   public k6(String var1) {
      this(var1, com.aspose.slides.ms.System.d1.n5);
   }

   public k6(String var1, String var2) {
      this.u3 = var2 == null ? com.aspose.slides.ms.System.d1.n5 : var2;
      this.k5 = var1 == null ? com.aspose.slides.ms.System.d1.n5 : var1;
   }

   public final String n5() {
      return this.u3;
   }

   public final String l6() {
      return this.k5;
   }

   @Override
   public int hashCode() {
      if (this.a6 == 0) {
         if (l6 == null) {
            l6 = h0();
         }

         this.a6 = l6.n5(this.l6(), this.l6().length(), 0L);
      }

      return this.a6;
   }

   public final boolean k5() {
      return this.l6().length() == 0 && this.n5().length() == 0;
   }

   @Override
   public String toString() {
      return this.n5().length() == 0 ? this.l6() : com.aspose.slides.ms.System.d1.n5(new String[]{this.n5(), ":", this.l6()});
   }

   @Override
   public boolean equals(Object other) {
      if (this == other) {
         return true;
      }

      k6 var2 = com.aspose.slides.internal.v6g.k5.n5(other, k6.class);
      return var2 == null ? false : com.aspose.slides.ms.System.d1.a6(this.l6(), var2.l6()) && com.aspose.slides.ms.System.d1.a6(this.n5(), var2.n5());
   }

   public static boolean n5(k6 var0, k6 var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0 != null && var1 != null
            ? com.aspose.slides.ms.System.d1.a6(var0.l6(), var1.l6()) && com.aspose.slides.ms.System.d1.a6(var0.n5(), var1.n5())
            : false;
      }
   }

   public static boolean l6(k6 var0, k6 var1) {
      return !n5(var0, var1);
   }

   public static String n5(String var0, String var1) {
      return var1 != null && var1.length() != 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{var1, ":", var0}) : var0;
   }

   private static k6$n5 h0() {
      return new o7();
   }

   private static int l6(String var0, int var1, long var2) {
      return var0.hashCode();
   }

   public final void l6(String var1, String var2) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = 0;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final void u3() {
      f4.k5(this.k5);
      if (this.u3.length() != 0) {
         f4.z8(this.u3);
      }
   }

   public final void n5(z9 var1) {
      this.k5 = var1.n5(this.k5);
      this.u3 = var1.n5(this.u3);
   }

   public static k6 n5(String var0, a3 var1, String[] var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      y5.n5(var0, var2, var4);
      var3 = var4[0];
      String var5 = var1.n5(var2[0]);
      if (var5 == null) {
         if (var2[0].length() != 0) {
            throw new XmlException("'{0}' is an undeclared prefix.", var2[0]);
         }

         var5 = com.aspose.slides.ms.System.d1.n5;
      }

      return new k6(var3, var5);
   }

   public final k6 a6() {
      return (k6)this.u9();
   }

   protected Object u9() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static int n5(String var0, int var1, long var2) {
      return l6(var0, var1, var2);
   }
}
