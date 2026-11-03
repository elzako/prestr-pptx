package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c6l extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private o0s h0;
   private i9f c8;
   private y6s t2;
   private c8k s7;
   private List<r1m> x8;
   private o2i n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "xml:id",
      "manufacturer",
      "model",
      "serialNo",
      "specificationRef",
      "description",
      "traceFormat",
      "sampleRate",
      "latency",
      "activeArea",
      "sourceProperty",
      "channelProperties"
   );

   public c6l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.e2();
      c6l$1 var2 = new c6l$1(this);
      n5(var1, var2);
      n5(var1, new c6l$2(this, var1));
   }

   public c6l() {
      this.e2();
   }

   private void e2() {
      this.x8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xml:id", this.n5);
      if (this.l6 != null) {
         var2.l6("manufacturer", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("model", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("serialNo", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("specificationRef", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("description", this.u9);
      }

      if (this.h0 != null) {
         this.h0.n5("inkml", var2, "traceFormat");
      }

      if (this.c8 != null) {
         this.c8.n5("inkml", var2, "sampleRate");
      }

      if (this.t2 != null) {
         this.t2.n5("inkml", var2, "latency");
      }

      if (this.s7 != null) {
         this.s7.n5("inkml", var2, "activeArea");
      }

      List$Enumerator var4 = this.x8.iterator();

      try {
         while (var4.hasNext()) {
            r1m var5 = (r1m)var4.next();
            var5.n5("inkml", var2, "sourceProperty");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.n3 != null) {
         this.n3.n5("inkml", var2, "channelProperties");
      }

      var2.s7();
   }

   public final void n5(o0s var1) {
      this.h0 = var1;
   }

   public final void n5(i9f var1) {
      this.c8 = var1;
   }

   public final void n5(y6s var1) {
      this.t2 = var1;
   }

   public final void n5(c8k var1) {
      this.s7 = var1;
   }

   public final void n5(o2i var1) {
      this.n3 = var1;
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final String u3() {
      return this.u3;
   }

   public final void u3(String var1) {
      this.u3 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void a6(String var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final void u9(String var1) {
      this.u9 = var1;
   }

   public final o0s h0() {
      return this.h0;
   }

   public final i9f c8() {
      return this.c8;
   }

   public final y6s t2() {
      return this.t2;
   }

   public final c8k s7() {
      return this.s7;
   }

   public final r1m[] x8() {
      return this.x8.toArray(new r1m[0]);
   }

   public final o2i n3() {
      return this.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y4() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(c6l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(c6l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(c6l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(c6l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(c6l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(c6l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static o0s n5(c6l var0, o0s var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static i9f n5(c6l var0, i9f var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static y6s n5(c6l var0, y6s var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static c8k n5(c6l var0, c8k var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static List n5(c6l var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static o2i n5(c6l var0, o2i var1) {
      return var0.n3 = var1;
   }
}
