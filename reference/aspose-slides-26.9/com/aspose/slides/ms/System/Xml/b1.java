package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;

public class b1 {
   private z9 n5 = null;
   private s2 l6 = null;
   private String k5 = com.aspose.slides.ms.System.d1.n5;
   private String u3 = com.aspose.slides.ms.System.d1.n5;
   private String a6 = com.aspose.slides.ms.System.d1.n5;
   private String u9 = com.aspose.slides.ms.System.d1.n5;
   private String h0 = com.aspose.slides.ms.System.d1.n5;
   private int c8;
   private String t2 = com.aspose.slides.ms.System.d1.n5;
   private com.aspose.slides.internal.l7h.j5 s7 = null;

   public b1(z9 var1, s2 var2, String var3, int var4) {
      this(var1, var2, null, null, null, null, com.aspose.slides.ms.System.d1.n5, var3, var4);
   }

   public b1(z9 var1, s2 var2, String var3, String var4, String var5, String var6, String var7, String var8, int var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public b1(z9 var1, s2 var2, String var3, String var4, String var5, String var6, String var7, String var8, int var9, com.aspose.slides.internal.l7h.j5 var10) {
      if (var2 != null) {
         if (var1 == null) {
            this.n5 = var2.n5();
         } else {
            if (var1 != var2.n5()) {
               throw new XmlException("Not the same name table.", com.aspose.slides.ms.System.d1.n5);
            }

            this.n5 = var1;
         }
      } else {
         this.n5 = var1;
      }

      this.l6 = var2;
      this.k5 = null == var3 ? com.aspose.slides.ms.System.d1.n5 : var3;
      this.u3 = null == var4 ? com.aspose.slides.ms.System.d1.n5 : var4;
      this.a6 = null == var5 ? com.aspose.slides.ms.System.d1.n5 : var5;
      this.u9 = null == var6 ? com.aspose.slides.ms.System.d1.n5 : var6;
      this.t2 = null == var7 ? com.aspose.slides.ms.System.d1.n5 : var7;
      this.h0 = null == var8 ? com.aspose.slides.ms.System.d1.n5 : var8;
      this.c8 = var9;
      this.s7 = var10;
   }

   public final z9 n5() {
      return this.n5;
   }

   public final s2 l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final String a6() {
      return this.a6;
   }

   public final String u9() {
      return this.t2;
   }

   public final String h0() {
      return this.u9;
   }

   public final String c8() {
      return this.h0;
   }

   public final int t2() {
      return this.c8;
   }

   public final com.aspose.slides.internal.l7h.j5 s7() {
      return this.s7;
   }

   public final boolean x8() {
      return !com.aspose.slides.ms.System.d1.a6(this.u9, com.aspose.slides.ms.System.d1.n5)
         || !com.aspose.slides.ms.System.d1.a6(this.u3, com.aspose.slides.ms.System.d1.n5)
         || !com.aspose.slides.ms.System.d1.a6(this.a6, com.aspose.slides.ms.System.d1.n5);
   }
}
