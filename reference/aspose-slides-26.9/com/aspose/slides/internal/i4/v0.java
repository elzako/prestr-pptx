package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class v0 extends j4 implements j9 {
   private w2 n5;
   private int u3;
   private f0 a6;
   private w5 u9;
   private t1 h0;
   private a6 c8;
   private e2 t2;
   private r4 s7;
   private p8 x8;
   private p8 n3;
   private p8 y4;
   private p8 e2;
   private p8 t9;
   private p8 z1;
   private p8 t4;
   private c3 q0;
   private b5 z3;
   private p7 m1;
   private w3 k7;
   private j4 m3;
   private u6 z8;
   private Dictionary<com.aspose.slides.ms.System.y8, com.aspose.slides.internal.q3.k5> j5 = new Dictionary<>();

   @Override
   public final w2 s7() {
      return this.n5;
   }

   public final void n5(w2 var1) {
      this.n5 = var1;
   }

   public final int x8() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   @Override
   public String u3() {
      return "Global";
   }

   @Override
   public final w5 n3() {
      return this.u9;
   }

   public final void n5(w5 var1) {
      this.u9 = var1;
   }

   @Override
   public final t1 y4() {
      return this.h0;
   }

   public final void n5(t1 var1) {
      this.h0 = var1;
   }

   @Override
   public final a6 e2() {
      return this.c8;
   }

   public final void n5(a6 var1) {
      this.c8 = var1;
   }

   @Override
   public final e2 t9() {
      return this.t2;
   }

   public final void n5(e2 var1) {
      this.t2 = var1;
   }

   @Override
   public final r4 z1() {
      return this.s7;
   }

   public final void n5(r4 var1) {
      this.s7 = var1;
   }

   @Override
   public final p8 t4() {
      return this.x8;
   }

   public final void n5(p8 var1) {
      this.x8 = var1;
   }

   @Override
   public final p8 q0() {
      return this.n3;
   }

   public final void l6(p8 var1) {
      this.n3 = var1;
   }

   @Override
   public final p8 z3() {
      return this.y4;
   }

   public final void k5(p8 var1) {
      this.y4 = var1;
   }

   @Override
   public final p8 m1() {
      return this.e2;
   }

   public final void u3(p8 var1) {
      this.e2 = var1;
   }

   @Override
   public final p8 k7() {
      return this.t9;
   }

   public final void a6(p8 var1) {
      this.t9 = var1;
   }

   @Override
   public final p8 m3() {
      return this.z1;
   }

   public final void u9(p8 var1) {
      this.z1 = var1;
   }

   public final p8 z8() {
      return this.t4;
   }

   public final void h0(p8 var1) {
      this.t4 = var1;
   }

   public final c3 j5() {
      return this.q0;
   }

   public final void n5(c3 var1) {
      this.q0 = var1;
   }

   @Override
   public final b5 w1() {
      return this.z3;
   }

   public final void n5(b5 var1) {
      this.z3 = var1;
   }

   @Override
   public final p7 r4() {
      return this.m1;
   }

   public final void n5(p7 var1) {
      this.m1 = var1;
   }

   @Override
   public final w3 c4() {
      return this.k7;
   }

   public final void n5(w3 var1) {
      this.k7 = var1;
   }

   @Override
   public final boolean k5(int var1) {
      return (this.x8() & var1) == var1;
   }

   @Override
   public final g7 y2() {
      return this.n5("NaN");
   }

   @Override
   public final void n5(com.aspose.slides.internal.q3.k5 var1) {
      com.aspose.slides.internal.q3.c8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.q3.c8.class);
      if (var2 != null) {
         this.j5.addItem(var2.n5(), var1);
      }

      var1.n5(this);
   }

   public final com.aspose.slides.internal.q3.c8 n5(com.aspose.slides.ms.System.y8 var1) {
      if (this.j5.containsKey(var1)) {
         return (com.aspose.slides.internal.q3.c8)this.j5.get_Item(var1);
      } else {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Extension for type '{0}' is not found.", new Object[]{var1.s7()}));
      }
   }

   public v0(i1 var1, int var2) {
      super(y5.n5);
      this.l6(var2);
      this.n5(var1);
      this.a6 = new f0(this, var1, null, y5.n5);
      this.n5("null", y5.n5);
      this.m3 = new j4(y5.n5);
      this.z8 = new f0(this, null, "prototype", this.m3);
      this.n5(new t1(this, this.z8));
      this.n5(new w5(this, this.z8, this.m3));
      this.n5("Function", this.y4());
      this.n5("Object", this.n3());
      this.n3().n5((com.aspose.slides.internal.i4.j9)(this));
      this.n5(new a6(this));
      this.n5(new e2(this));
      this.n5(new r4(this));
      this.n5("Array", this.e2());
      this.n5("Boolean", this.t9());
      this.n5("Date", this.z1());
      this.n5(new p8(this, "Error"));
      this.l6(new p8(this, "EvalError"));
      this.k5(new p8(this, "RangeError"));
      this.u3(new p8(this, "ReferenceError"));
      this.a6(new p8(this, "SyntaxError"));
      this.u9(new p8(this, "TypeError"));
      this.h0(new p8(this, "URIError"));
      this.n5("Error", this.t4());
      this.n5("EvalError", this.q0());
      this.n5("RangeError", this.z3());
      this.n5("ReferenceError", this.m1());
      this.n5("SyntaxError", this.k7());
      this.n5("TypeError", this.m3());
      this.n5("URIError", this.z8());
      this.n5(new b5(this));
      this.n5(new p7(this));
      this.n5(new w3(this));
      this.n5(new c3(this));
      this.n5("Number", this.w1());
      this.n5("RegExp", this.r4());
      this.n5("String", this.c4());
      this.n5("Math", this.j5());
      IGenericEnumerator var3 = this.u9().iterator();

      try {
         while (var3.hasNext()) {
            g7 var4 = (g7)var3.next();
            z8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, z8.class);
            if (var5 != null) {
               var5.n5((com.aspose.slides.internal.i4.j9)(this));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.n5("NaN", this.w1().n5("NaN"));
      this.n5("Infinity", this.w1().n5("POSITIVE_INFINITY"));
      this.n5("undefined", l5.n5);
      this.n5("this", this);
      this.n5("eval", new f0(this, var1, "eval", this.y4().z1()));
      this.n5("parseInt", new f0(this, var1, "parseInt", this.y4().z1()));
      this.n5("parseFloat", new f0(this, var1, "parseFloat", this.y4().z1()));
      this.n5("isNaN", new f0(this, var1, "isNaN", this.y4().z1()));
      this.n5("isFinite", new f0(this, var1, "isFinite", this.y4().z1()));
      this.n5("decodeURI", new f0(this, var1, "decodeURI", this.y4().z1()));
      this.n5("encodeURI", new f0(this, var1, "encodeURI", this.y4().z1()));
      this.n5("decodeURIComponent", new f0(this, var1, "decodeURIComponent", this.y4().z1()));
      this.n5("encodeURIComponent", new f0(this, var1, "encodeURIComponent", this.y4().z1()));
   }
}
