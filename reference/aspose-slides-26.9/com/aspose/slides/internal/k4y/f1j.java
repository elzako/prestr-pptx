package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f1j extends b3 {
   private long n5;
   private String l6;
   private long k5;
   private boolean u3;
   private double a6;
   private boolean u9;
   private boolean h0;
   private byte c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private List<u1v> y4;
   private l0k e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "r", "spans", "s", "customFormat", "ht", "hidden", "customHeight", "outlineLevel", "collapsed", "thickTop", "thickBot", "ph", "c", "extLst"
   );

   public f1j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      f1j$1 var2 = new f1j$1(this);
      n5(var1, var2);
      n5(var1, new f1j$2(this, var1));
   }

   public f1j() {
      this.c8();
   }

   private void c8() {
      this.n5 = 4294967295L;
      this.k5 = 0L;
      this.u3 = false;
      this.a6 = Double.NaN;
      this.u9 = false;
      this.h0 = false;
      this.c8 = 0;
      this.t2 = false;
      this.s7 = false;
      this.x8 = false;
      this.n3 = false;
      this.y4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("r", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("spans", this.l6);
      }

      if ((this.k5 & 4294967295L) != 0L) {
         var2.l6("s", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3) {
         var2.l6("customFormat", this.u3 ? "1" : "0");
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.a6)) {
         var2.l6("ht", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (this.u9) {
         var2.l6("hidden", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("customHeight", this.h0 ? "1" : "0");
      }

      if ((this.c8 & 255) != 0) {
         var2.l6("outlineLevel", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (this.t2) {
         var2.l6("collapsed", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("thickTop", this.s7 ? "1" : "0");
      }

      if (this.x8) {
         var2.l6("thickBot", this.x8 ? "1" : "0");
      }

      if (this.n3) {
         var2.l6("ph", this.n3 ? "1" : "0");
      }

      List$Enumerator var4 = this.y4.iterator();

      try {
         while (var4.hasNext()) {
            u1v var5 = (u1v)var4.next();
            var5.n5("ssml", var2, "c");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.e2 != null) {
         this.e2.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final u1v n5() {
      u1v var1 = new u1v();
      this.y4.addItem(var1);
      return var1;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final double k5() {
      return this.a6;
   }

   public final boolean u3() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final boolean a6() {
      return this.h0;
   }

   public final u1v[] u9() {
      return this.y4.toArray(new u1v[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return t9;
   }

   // $VF: synthetic method
   static long n5(f1j var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(f1j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(f1j var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f1j var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(f1j var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(f1j var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(f1j var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte n5(f1j var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u3(f1j var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean a6(f1j var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u9(f1j var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean h0(f1j var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static List n5(f1j var0) {
      return var0.y4;
   }

   // $VF: synthetic method
   static l0k n5(f1j var0, l0k var1) {
      return var0.e2 = var1;
   }
}
