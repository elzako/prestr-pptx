package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e7n extends b3 {
   private String k5;
   private boolean u3;
   private String a6;
   private long u9;
   private long h0;
   private int c8;
   private double t2;
   private String s7;
   private com.aspose.slides.ms.System.j5 x8 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 n3 = new com.aspose.slides.ms.System.s4();
   private byte y4;
   private String e2;
   private List<u1x> t9;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "table:cell-address",
      "table:matrix-covered",
      "table:formula",
      "table:number-matrix-columns-spanned",
      "table:number-matrix-rows-spanned",
      "office:value-type",
      "office:value",
      "office:currency",
      "office:date-value",
      "office:time-value",
      "office:boolean-value",
      "office:string-value",
      "p"
   );

   public e7n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e7n$1 var2 = new e7n$1(this);
      n5(var1, var2);
      n5(var1, new e7n$2(this, var1));
   }

   public e7n() {
      this.l6();
   }

   private void l6() {
      this.u3 = false;
      this.u9 = 4294967295L;
      this.h0 = 4294967295L;
      this.c8 = 0;
      this.t2 = Double.NaN;
      n5.u3(this.x8);
      l6.u3(this.n3);
      this.y4 = -1;
      this.t9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("table:cell-address", this.k5);
      }

      if (this.u3) {
         var2.l6("table:matrix-covered", this.u3 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("table:formula", this.a6);
      }

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("table:number-matrix-columns-spanned", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("table:number-matrix-rows-spanned", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("office:value-type", x6e.n5(this.c8));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.t2)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("office:currency", this.s7);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.x8, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.x8.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.n3, l6)) {
         var2.l6("office:time-value", n5(this.n3.n3()));
      }

      if (this.y4 != -1) {
         var2.l6("office:boolean-value", this.y4 == 1 ? "true" : "false");
      }

      if (this.e2 != null) {
         var2.l6("office:string-value", this.e2);
      }

      List$Enumerator var4 = this.t9.iterator();

      try {
         while (var4.hasNext()) {
            u1x var5 = (u1x)var4.next();
            var5.n5("text", var2, "p");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z1;
   }

   // $VF: synthetic method
   static String n5(e7n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(e7n var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(e7n var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(e7n var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long l6(e7n var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int n5(e7n var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static double n5(e7n var0, double var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(e7n var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(e7n var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(e7n var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static byte n5(e7n var0, byte var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String u3(e7n var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static List k5(e7n var0) {
      return var0.t9;
   }
}
