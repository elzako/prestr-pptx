package com.aspose.slides.internal.i4;

public class r4 extends z8 {
   private c4 u3;
   private j4 a6;
   private u6 u9;
   private u6 h0;
   private u6 c8;
   private u6 t2;
   private u6 s7;
   private u6 x8;
   private u6 n3;
   private u6 y4;
   private u6 e2;
   private u6 t9;
   private u6 z1;
   private u6 t4;
   private u6 q0;
   private u6 z3;
   private u6 m1;
   private u6 k7;
   private u6 m3;
   private u6 z8;
   private u6 j5;
   private u6 w1;
   private u6 r4;
   private u6 c4;
   private u6 y2;
   private u6 y1;
   private u6 a0;
   private u6 d2;
   private u6 d5;
   private u6 s3;
   private u6 p8;
   private u6 f2;
   private u6 i1;
   private u6 e5;
   private u6 b3;
   private u6 o0;
   private u6 z7;
   private u6 v4;
   private u6 u6;
   private u6 t1;
   private u6 a5;
   private u6 h2;
   private u6 v0;
   private u6 f0;
   private u6 a3;
   private u6 p3;

   protected r4(j9 var1, boolean var2) {
      super(var1);
      this.n5 = "Date";
      this.a6 = var1.n3().n5(this);
      this.u9 = new c4(var1, "parse", var1.y4().z1());
      this.h0 = new c4(var1, "parseLocale", var1.y4().z1());
      this.c8 = new c4(var1, "UTC", var1.y4().z1());
      this.n5("prototype", this.a6, 7);
      this.n5("parse", this.u9, 2);
      this.n5("parseLocale", this.h0, 2);
      this.n5("UTC", this.c8, 2);
   }

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.c8 = new c4(var1, "UTC", var1.y4().z1());
      var2.n5("UTC", this.c8, 2);
      this.u9 = new c4(var1, "parse", var1.y4().z1());
      this.h0 = new c4(var1, "parseLocale", var1.y4().z1());
      var2.n5("parse", this.u9, 2);
      var2.n5("parseLocale", this.h0, 2);
      this.t2 = new c4(var1, "toString", this.z1());
      this.s7 = new c4(var1, "toDateString", this.z1());
      this.x8 = new c4(var1, "toTimeString", this.z1());
      this.n3 = new c4(var1, "toLocaleString", this.z1());
      this.y4 = new c4(var1, "toLocaleDateString", this.z1());
      this.e2 = new c4(var1, "toLocaleTimeString", this.z1());
      this.t9 = new c4(var1, "valueOf", this.z1());
      this.z1 = new c4(var1, "getTime", this.z1());
      this.t4 = new c4(var1, "getFullYear", this.z1());
      this.q0 = new c4(var1, "getUTCFullYear", this.z1());
      this.z3 = new c4(var1, "getMonth", this.z1());
      this.m1 = new c4(var1, "getUTCMonth", this.z1());
      this.k7 = new c4(var1, "getDate", this.z1());
      this.m3 = new c4(var1, "getUTCDate", this.z1());
      this.z8 = new c4(var1, "getDay", this.z1());
      this.j5 = new c4(var1, "getUTCDay", this.z1());
      this.w1 = new c4(var1, "getHours", this.z1());
      this.r4 = new c4(var1, "getUTCHours", this.z1());
      this.c4 = new c4(var1, "getMinutes", this.z1());
      this.y2 = new c4(var1, "getUTCMinutes", this.z1());
      this.y1 = new c4(var1, "getSeconds", this.z1());
      this.a0 = new c4(var1, "getUTCSeconds", this.z1());
      this.d2 = new c4(var1, "getMilliseconds", this.z1());
      this.d5 = new c4(var1, "getUTCMilliseconds", this.z1());
      this.s3 = new c4(var1, "getTimezoneOffset", this.z1());
      this.p8 = new c4(var1, "setTime", this.z1());
      this.f2 = new c4(var1, "setMilliseconds", this.z1());
      this.i1 = new c4(var1, "setUTCMilliseconds", this.z1());
      this.e5 = new c4(var1, "setSeconds", this.z1());
      this.b3 = new c4(var1, "setUTCSeconds", this.z1());
      this.o0 = new c4(var1, "setMinutes", this.z1());
      this.z7 = new c4(var1, "setUTCMinutes", this.z1());
      this.v4 = new c4(var1, "setHours", this.z1());
      this.u6 = new c4(var1, "setUTCHours", this.z1());
      this.t1 = new c4(var1, "setDate", this.z1());
      this.a5 = new c4(var1, "setUTCDate", this.z1());
      this.h2 = new c4(var1, "setMonth", this.z1());
      this.v0 = new c4(var1, "setUTCMonth", this.z1());
      this.f0 = new c4(var1, "setFullYear", this.z1());
      this.a3 = new c4(var1, "setUTCFullYear", this.z1());
      this.p3 = new c4(var1, "toUTCString", this.z1());
      var2.n5("toString", this.t2, 2);
      var2.n5("toDateString", this.s7, 2);
      var2.n5("toTimeString", this.x8, 2);
      var2.n5("toLocaleString", this.n3, 2);
      var2.n5("toLocaleDateString", this.y4, 2);
      var2.n5("toLocaleTimeString", this.e2, 2);
      var2.n5("valueOf", this.t9, 2);
      var2.n5("getTime", this.z1, 2);
      var2.n5("getFullYear", this.t4, 2);
      var2.n5("getUTCFullYear", this.q0, 2);
      var2.n5("getMonth", this.z3, 2);
      var2.n5("getUTCMonth", this.m1, 2);
      var2.n5("getDate", this.k7, 2);
      var2.n5("getUTCDate", this.m3, 2);
      var2.n5("getDay", this.z8, 2);
      var2.n5("getUTCDay", this.j5, 2);
      var2.n5("getHours", this.w1, 2);
      var2.n5("getUTCHours", this.r4, 2);
      var2.n5("getMinutes", this.c4, 2);
      var2.n5("getUTCMinutes", this.y2, 2);
      var2.n5("getSeconds", this.y1, 2);
      var2.n5("getUTCSeconds", this.a0, 2);
      var2.n5("getMilliseconds", this.d2, 2);
      var2.n5("getUTCMilliseconds", this.d5, 2);
      var2.n5("getTimezoneOffset", this.s3, 2);
      var2.n5("setTime", this.p8, 2);
      var2.n5("setMilliseconds", this.f2, 2);
      var2.n5("setUTCMilliseconds", this.i1, 2);
      var2.n5("setSeconds", this.e5, 2);
      var2.n5("setUTCSeconds", this.b3, 2);
      var2.n5("setMinutes", this.o0, 2);
      var2.n5("setUTCMinutes", this.z7, 2);
      var2.n5("setHours", this.v4, 2);
      var2.n5("setUTCHours", this.u6, 2);
      var2.n5("setDate", this.t1, 2);
      var2.n5("setUTCDate", this.a5, 2);
      var2.n5("setMonth", this.h2, 2);
      var2.n5("setUTCMonth", this.v0, 2);
      var2.n5("setFullYear", this.f0, 2);
      var2.n5("setUTCFullYear", this.a3, 2);
      var2.n5("toUTCString", this.p3, 2);
   }

   public final w1 n5(double var1) {
      return new w1(var1, this.z1());
   }

   public final w1 n5(com.aspose.slides.ms.System.j5 var1) {
      return new w1(var1.k7().m3(), this.z1());
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      w1 var4 = this.u3.k5(var3);
      return var2 != null && com.aspose.slides.internal.v6g.k5.n5(var2, j9.class) != var1.u3() ? var4 : var1.l6(this.u3.n5(var4, g7.k5));
   }

   public r4(j9 var1) {
      this(var1, true);
      this.u3 = new c4(var1, null, this.z1());
   }
}
