package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class z8 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "set_textContent",
      "isSameNode",
      "lookupPrefix",
      "isDefaultNamespace",
      "lookupNamespaceURI",
      "isEqualNode",
      "getFeature",
      "setUserData",
      "getUserData",
      "get_nodeName",
      "get_nodeValue",
      "set_nodeValue",
      "get_nodeType",
      "get_parentNode",
      "get_childNodes",
      "get_firstChild",
      "get_lastChild",
      "get_previousSibling",
      "get_nextSibling",
      "get_attributes",
      "get_ownerDocument",
      "insertBefore",
      "replaceChild",
      "removeChild",
      "appendChild",
      "hasChildNodes",
      "cloneNode",
      "normalize",
      "isSupported",
      "get_namespaceURI",
      "get_prefix",
      "set_prefix",
      "get_localName",
      "hasAttributes",
      "get_baseURI",
      "compareDocumentPosition",
      "get_textContent",
      "addEventListener",
      "removeEventListener",
      "dispatchEvent"
   );

   @Override
   public void l6() {
      this.k5("isSameNode");
      this.k5("lookupPrefix");
      this.k5("isDefaultNamespace");
      this.k5("lookupNamespaceURI");
      this.k5("isEqualNode");
      this.k5("getFeature");
      this.k5("setUserData");
      this.k5("getUserData");
      this.k5("insertBefore");
      this.k5("replaceChild");
      this.k5("removeChild");
      this.k5("appendChild");
      this.k5("hasChildNodes");
      this.k5("cloneNode");
      this.k5("normalize");
      this.k5("isSupported");
      this.k5("hasAttributes");
      this.k5("compareDocumentPosition");
      this.k5("addEventListener");
      this.k5("removeEventListener");
      this.k5("dispatchEvent");
      this.n5("nodeName", 1);
      this.n5("nodeValue", 3);
      this.n5("nodeType", 1);
      this.n5("parentNode", 1);
      this.n5("childNodes", 1);
      this.n5("firstChild", 1);
      this.n5("lastChild", 1);
      this.n5("previousSibling", 1);
      this.n5("nextSibling", 1);
      this.n5("attributes", 1);
      this.n5("ownerDocument", 1);
      this.n5("namespaceURI", 1);
      this.n5("prefix", 3);
      this.n5("localName", 1);
      this.n5("baseURI", 1);
      this.n5("textContent", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            var4.t9(var3[0].toString());
            break;
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.u9((com.aspose.slides.internal.f5.r4)var3[0].D_()));
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.z1(var3[0].toString()));
         case 3:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.t4(var3[0].toString()));
         case 4:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.q0(var3[0].toString()));
         case 5:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.h0((com.aspose.slides.internal.f5.r4)var3[0].D_()));
         case 6:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.c8(var3[0].toString(), var3[0].toString()));
         case 7:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].toString(), var3[1].D_(), (com.aspose.slides.internal.j3.y1)var3[2].D_()));
         case 8:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.z3(var3[0].toString()));
         case 9:
            return this.n5(var4.h0());
         case 10:
            return this.n5(var4.c8());
         case 11:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.l6(var3[0].toString());
            break;
         case 12:
            return this.n5(var4.n3() & 0xFF);
         case 13:
            com.aspose.slides.internal.j3.z8 var20 = var4.a5();
            if (var20 == null) {
               return this.u9();
            }

            return this.n5(var20, j8.n5(var20));
         case 14:
            return this.n5(var4.y1(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class));
         case 15:
            com.aspose.slides.internal.j3.z8 var19 = var4.t1();
            if (var19 == null) {
               return this.u9();
            }

            return this.n5(var19, j8.n5(var19));
         case 16:
            com.aspose.slides.internal.j3.z8 var18 = var4.u6();
            if (var18 == null) {
               return this.u9();
            }

            return this.n5(var18, j8.n5(var18));
         case 17:
            com.aspose.slides.internal.j3.z8 var17 = var4.v4();
            if (var17 == null) {
               return this.u9();
            }

            return this.n5(var17, j8.n5(var17));
         case 18:
            com.aspose.slides.internal.j3.z8 var16 = var4.z7();
            if (var16 == null) {
               return this.u9();
            }

            return this.n5(var16, j8.n5(var16));
         case 19:
            return this.n5(var4.A_(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.j3.m3.class));
         case 20:
            com.aspose.slides.internal.j3.z1 var15 = var4.c4();
            if (var15 == null) {
               return this.u9();
            }

            return this.n5(var15, j8.n5(var15));
         case 21:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var14 = var4.n5((com.aspose.slides.internal.f5.r4)var3[0].D_(), (com.aspose.slides.internal.f5.r4)var3[1].D_());
            if (var14 == null) {
               return this.u9();
            }

            return this.n5(var14, j8.n5(var14));
         case 22:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var13 = var4.k5((com.aspose.slides.internal.f5.r4)var3[0].D_(), (com.aspose.slides.internal.f5.r4)var3[1].D_());
            if (var13 == null) {
               return this.u9();
            }

            return this.n5(var13, j8.n5(var13));
         case 23:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var12 = var4.l6((com.aspose.slides.internal.f5.r4)var3[0].D_());
            if (var12 == null) {
               return this.u9();
            }

            return this.n5(var12, j8.n5(var12));
         case 24:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var11 = var4.k5((com.aspose.slides.internal.f5.r4)var3[0].D_());
            if (var11 == null) {
               return this.u9();
            }

            return this.n5(var11, j8.n5(var11));
         case 25:
            return this.n5(var4.p8());
         case 26:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var10 = var4.l6(var3[0].n5());
            if (var10 == null) {
               return this.u9();
            }

            return this.n5(var10, j8.n5(var10));
         case 27:
            var4.f2();
            break;
         case 28:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.h0(var3[0].toString(), var3[1].toString()));
         case 29:
            return this.n5(var4.s7());
         case 30:
            return this.n5(var4.x8());
         case 31:
            var4.k5(var3[0].toString());
            break;
         case 32:
            return this.n5(var4.t2());
         case 33:
            return this.n5(var4.i1());
         case 34:
            return this.n5(var4.j5());
         case 35:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.a6((com.aspose.slides.internal.f5.r4)var3[0].D_()));
         case 36:
            return this.n5(var4.e5());
         case 37:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            String var9 = var3[0].toString();
            g7 var21 = var3[1];
            boolean var22 = var3[2].n5();
            return this.u9();
         case 38:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            String var8 = var3[0].toString();
            g7 var6 = var3[1];
            boolean var7 = var3[2].n5();
            return this.u9();
         case 39:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.s4.n5 var5 = (com.aspose.slides.internal.s4.n5)var3[0].D_();
            return this.n5(((com.aspose.slides.internal.f5.r4)var4).n5(var5));
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }
}
