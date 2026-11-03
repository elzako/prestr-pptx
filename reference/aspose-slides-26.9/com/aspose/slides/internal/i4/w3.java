package com.aspose.slides.internal.i4;

public class w3 extends z8 {
   private u6 u3;
   private u6 a6;
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

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.u3 = new i4(var1, "split", var2);
      this.a6 = new i4(var1, "replace", var2);
      this.u9 = new i4(var1, "toString", var2);
      this.h0 = new i4(var1, "toLocaleString", var2);
      this.c8 = new i4(var1, "match", var2);
      this.t2 = new i4(var1, "localeCompare", var2);
      this.s7 = new i4(var1, "substring", var2);
      this.x8 = new i4(var1, "substr", var2);
      this.n3 = new i4(var1, "search", var2);
      this.y4 = new i4(var1, "valueOf", var2);
      this.e2 = new i4(var1, "concat", var2);
      this.t9 = new i4(var1, "charAt", var2);
      this.z1 = new i4(var1, "charCodeAt", var2);
      this.t4 = new i4(var1, "lastIndexOf", var2);
      this.q0 = new i4(var1, "indexOf", var2);
      this.z3 = new i4(var1, "toLowerCase", var2);
      this.m1 = new i4(var1, "toLocaleLowerCase", var2);
      this.k7 = new i4(var1, "toUpperCase", var2);
      this.m3 = new i4(var1, "toLocaleUpperCase", var2);
      this.z8 = new i4(var1, "slice", var2);
      var2.n5("split", this.u3, 2);
      var2.n5("replace", this.a6, 2);
      var2.n5("toString", this.u9, 2);
      var2.n5("toLocaleString", this.h0, 2);
      var2.n5("match", this.c8, 2);
      var2.n5("localeCompare", this.t2, 2);
      var2.n5("substring", this.s7, 2);
      var2.n5("substr", this.x8, 2);
      var2.n5("search", this.n3, 2);
      var2.n5("valueOf", this.y4, 2);
      var2.n5("concat", this.e2, 2);
      var2.n5("charAt", this.t9, 2);
      var2.n5("charCodeAt", this.z1, 2);
      var2.n5("lastIndexOf", this.t4, 2);
      var2.n5("indexOf", this.q0, 2);
      var2.n5("toLowerCase", this.z3, 2);
      var2.n5("toLocaleLowerCase", this.m1, 2);
      var2.n5("toUpperCase", this.k7, 2);
      var2.n5("toLocaleUpperCase", this.m3, 2);
      var2.n5("slice", this.z8, 2);
      var2.n5(new q3(var1, var2, "length"));
   }

   public final i9 s7() {
      return this.u9(com.aspose.slides.ms.System.d1.n5);
   }

   public final i9 u9(String var1) {
      return new i9(var1, this.z1());
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      if (var2 != null && com.aspose.slides.internal.v6g.k5.n5(var2, j9.class) != var1.u3()) {
         if (var3.length > 0) {
            var2.n5((Object)var3[0].toString());
         } else {
            var2.n5((Object)com.aspose.slides.ms.System.d1.n5);
         }

         return var1.l6(var2);
      } else {
         return var3.length > 0 ? var1.l6(this.x8().c4().u9(var3[0].toString())) : var1.l6(this.x8().c4().u9(com.aspose.slides.ms.System.d1.n5));
      }
   }

   public w3(j9 var1) {
      super(var1);
      this.n5("prototype", var1.n3().n5(this), 7);
      this.h0("String");
      this.n5("fromCharCode", new i4(var1, "fromCharCode", this.z1()));
   }
}
