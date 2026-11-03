package com.aspose.slides.internal.i4;

public class w5 extends z8 {
   private u6 u3;
   private u6 a6;
   private u6 u9;
   private u6 h0;
   private u6 c8;
   private u6 t2;
   private u6 s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9("String", "Number", "Boolean");

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      j4 var3 = var1.y4().z1();
      this.u3 = new q1(var1, "toString", var3);
      this.a6 = new q1(var1, "toString", var3);
      this.u9 = new q1(var1, "valueOf", var3);
      this.h0 = new q1(var1, "hasOwnProperty", var3);
      this.c8 = new q1(var1, "isPrototypeOf", var3);
      this.t2 = new q1(var1, "propertyIsEnumerable", var3);
      this.s7 = new q1(var1, "getPrototypeOf", var3);
      var2.n5("constructor", this, 2);
      var2.n5("toString", this.u3, 2);
      var2.n5("toLocaleString", this.a6, 2);
      var2.n5("valueOf", this.u9, 2);
      var2.n5("hasOwnProperty", this.h0, 2);
      var2.n5("isPrototypeOf", this.c8, 2);
      var2.n5("propertyIsEnumerable", this.t2, 2);
      var2.n5("getPrototypeOf", this.s7, 2);
      if (var1.k5(4)) {
         var2.n5("defineProperty", new q1(var1, "defineProperty", var3), 2);
         var2.n5("__lookupGetter__", new q1(var1, "__lookupGetter__", var3), 2);
         var2.n5("__lookupSetter__", new q1(var1, "__lookupSetter__", var3), 2);
      }
   }

   public final j4 n5(u6 var1) {
      j4 var2 = new j4(this.z1());
      u2 var3 = new u2(var2, "constructor", var1);
      var3.n5(false);
      var2.n5(var3);
      return var2;
   }

   public final j4 l6(Object var1) {
      return new j4(var1, this.z1());
   }

   public final j4 s7() {
      return this.l6((java.lang.Object)null);
   }

   public final j4 k5(j4 var1) {
      return new j4(var1);
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      if (var3.length > 0) {
         switch (x8.n5(var3[0].u3())) {
            case 0:
               return this.x8().c4().u9(var3[0].toString());
            case 1:
               return this.x8().w1().n5(var3[0].l6());
            case 2:
               return this.x8().t9().n5(var3[0].n5());
            default:
               return var3[0];
         }
      } else {
         return this.n5(this);
      }
   }

   public w5(j9 var1, j4 var2, j4 var3) {
      super(var1);
      this.h0("Object");
      this.n5("prototype", var3, 7);
   }
}
