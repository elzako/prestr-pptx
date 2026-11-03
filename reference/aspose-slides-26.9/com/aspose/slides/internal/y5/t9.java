package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.f5.s3;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class t9 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.z3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_tagName",
      "getAttribute",
      "setAttribute",
      "removeAttribute",
      "getAttributeNode",
      "setAttributeNode",
      "removeAttributeNode",
      "getElementsByTagName",
      "getAttributeNS",
      "setAttributeNS",
      "removeAttributeNS",
      "getAttributeNodeNS",
      "setAttributeNodeNS",
      "getElementsByTagNameNS",
      "hasAttribute",
      "hasAttributeNS",
      "get_schemaTypeInfo",
      "setIdAttribute",
      "setIdAttributeNS",
      "setIdAttributeNode",
      "get_firstElementChild",
      "get_lastElementChild",
      "get_previousElementSibling",
      "get_nextElementSibling",
      "get_childElementCount"
   );

   @Override
   public void l6() {
      this.k5("getAttribute");
      this.k5("setAttribute");
      this.k5("removeAttribute");
      this.k5("getAttributeNode");
      this.k5("setAttributeNode");
      this.k5("removeAttributeNode");
      this.k5("getElementsByTagName");
      this.k5("getAttributeNS");
      this.k5("setAttributeNS");
      this.k5("removeAttributeNS");
      this.k5("getAttributeNodeNS");
      this.k5("setAttributeNodeNS");
      this.k5("getElementsByTagNameNS");
      this.k5("hasAttribute");
      this.k5("hasAttributeNS");
      this.k5("setIdAttribute");
      this.k5("setIdAttributeNS");
      this.k5("setIdAttributeNode");
      this.n5("tagName", 1);
      this.n5("schemaTypeInfo", 1);
      this.n5("firstElementChild", 1);
      this.n5("lastElementChild", 1);
      this.n5("previousElementSibling", 1);
      this.n5("nextElementSibling", 1);
      this.n5("childElementCount", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.z3 var4 = (com.aspose.slides.internal.f5.z3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.a6());
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.u3(var3[0].toString()));
         case 2:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString(), var3[1].toString());
            break;
         case 3:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.a6(var3[0].toString());
            break;
         case 4:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.u9(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class));
         case 5:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(
               var4.n5((com.aspose.slides.internal.j3.k5)((com.aspose.slides.internal.f5.n5)var3[0].D_())), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class)
            );
         case 6:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(
               var4.l6((com.aspose.slides.internal.j3.k5)((com.aspose.slides.internal.f5.n5)var3[0].D_())), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class)
            );
         case 7:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.j5 var10 = var4.h0(var3[0].toString());
            return this.n5(var10, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class));
         case 8:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.l6(var3[0].toString(), var3[1].toString()));
         case 9:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString(), var3[1].toString(), var3[2].toString());
            break;
         case 10:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.k5(var3[0].toString(), var3[1].toString());
            break;
         case 11:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.u3(var3[0].toString(), var3[1].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class));
         case 12:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(
               var4.k5((com.aspose.slides.internal.j3.k5)((com.aspose.slides.internal.f5.n5)var3[0].D_())), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class)
            );
         case 13:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.j5 var9 = var4.a6(var3[0].toString(), var3[1].toString());
            return this.n5(var9, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class));
         case 14:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.t2(var3[0].toString()));
         case 15:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.u9(var3[0].toString(), var3[1].toString()));
         case 16:
            return this.n5(var4.t9(), com.aspose.slides.internal.v6g.k5.n5(s3.class));
         case 17:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString(), var3[1].n5());
            break;
         case 18:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString(), var3[1].toString(), var3[2].n5());
            break;
         case 19:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5((com.aspose.slides.internal.f5.n5)var3[0].D_(), var3[1].n5());
            break;
         case 20:
            com.aspose.slides.internal.j3.z3 var8 = var4.t4();
            if (var8 == null) {
               return this.u9();
            }

            return this.n5(var8, j8.n5(var8));
         case 21:
            com.aspose.slides.internal.j3.z3 var7 = var4.q0();
            if (var7 == null) {
               return this.u9();
            }

            return this.n5(var7, j8.n5(var7));
         case 22:
            com.aspose.slides.internal.j3.z3 var6 = var4.z3();
            if (var6 == null) {
               return this.u9();
            }

            return this.n5(var6, j8.n5(var6));
         case 23:
            com.aspose.slides.internal.j3.z3 var5 = var4.m1();
            if (var5 == null) {
               return this.u9();
            }

            return this.n5(var5, j8.n5(var5));
         case 24:
            return this.n5(var4.k7());
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class);
   }
}
