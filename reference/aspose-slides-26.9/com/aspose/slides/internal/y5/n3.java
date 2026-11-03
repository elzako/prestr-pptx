package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.f5.a0;
import com.aspose.slides.internal.f5.d5;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.i4.z6;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class n3 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.z1.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_domConfig",
      "normalizeDocument",
      "renameNode",
      "get_doctype",
      "get_implementation",
      "get_documentElement",
      "createElement",
      "createDocumentFragment",
      "createTextNode",
      "createComment",
      "createCDATASection",
      "createProcessingInstruction",
      "createAttribute",
      "createEntityReference",
      "getElementsByTagName",
      "importNode",
      "createElementNS",
      "createAttributeNS",
      "getElementsByTagNameNS",
      "getElementById",
      "get_inputEncoding",
      "get_xmlEncoding",
      "get_xmlStandalone",
      "set_xmlStandalone",
      "get_xmlVersion",
      "set_xmlVersion",
      "get_strictErrorChecking",
      "set_strictErrorChecking",
      "get_documentURI",
      "set_documentURI",
      "adoptNode",
      "createEvent",
      "write",
      "writeln"
   );

   @Override
   public void l6() {
      this.k5("normalizeDocument");
      this.k5("renameNode");
      this.k5("createElement");
      this.k5("createDocumentFragment");
      this.k5("createTextNode");
      this.k5("createComment");
      this.k5("createCDATASection");
      this.k5("createProcessingInstruction");
      this.k5("createAttribute");
      this.k5("createEntityReference");
      this.k5("getElementsByTagName");
      this.k5("importNode");
      this.k5("createElementNS");
      this.k5("createAttributeNS");
      this.k5("getElementsByTagNameNS");
      this.k5("getElementById");
      this.k5("adoptNode");
      this.k5("createEvent");
      this.k5("write");
      this.k5("writeln");
      this.n5("doctype", 1);
      this.n5("implementation", 1);
      this.n5("documentElement", 1);
      this.n5("inputEncoding", 1);
      this.n5("xmlEncoding", 1);
      this.n5("xmlStandalone", 3);
      this.n5("xmlVersion", 3);
      this.n5("strictErrorChecking", 3);
      this.n5("documentURI", 3);
      this.n5("domConfig", 1);
      this.n5("defaultView", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.z1 var4 = (com.aspose.slides.internal.f5.z1)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.z8(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.j3.n5.class));
         case 1:
            var4.f2();
            break;
         case 2:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var17 = var4.n5((com.aspose.slides.internal.f5.r4)var3[0].D_(), var3[1].toString(), var3[2].toString());
            return this.n5(var17, j8.n5(var17));
         case 3:
            return this.n5(var4.a6(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.q0.class));
         case 4:
            return this.n5(var4.u9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.s7.class));
         case 5:
            com.aspose.slides.internal.j3.z3 var16 = var4.e2();
            if (var16 == null) {
               return this.u9();
            }

            return this.n5(var16, j8.n5(var16));
         case 6:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z3 var15 = var4.a6(var3[0].toString());
            return this.n5(var15, j8.n5(var15));
         case 7:
            return this.n5(var4.t9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.t4.class));
         case 8:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.u9(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(d5.class));
         case 9:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.h0(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.j5.class));
         case 10:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.c8(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.u3.class));
         case 11:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].toString(), var3[1].toString()), com.aspose.slides.internal.v6g.k5.n5(a0.class));
         case 12:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.t2(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class));
         case 13:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.s7(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.z8.class));
         case 14:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.j5 var14 = var4.x8(var3[0].toString());
            g7 var20 = this.n5(var14, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class));
            var20.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.r1.n5.class)), z6.class));
            return var20;
         case 15:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var13 = var4.n5((com.aspose.slides.internal.f5.r4)var3[0].D_(), var3[1].n5());
            if (var13 == null) {
               return this.u9();
            }

            return this.n5(var13, j8.n5(var13));
         case 16:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z3 var12 = var4.k5(var3[0].toString(), var3[1].toString());
            return this.n5(var12, j8.n5(var12));
         case 17:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.k5 var11 = var4.u3(var3[0].toString(), var3[1].toString());
            return this.n5(var11, j8.n5(var11));
         case 18:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.j5 var10 = var4.a6(var3[0].toString(), var3[1].toString());
            g7 var19 = this.n5(var10, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class));
            var19.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.r1.n5.class)), z6.class));
            return var19;
         case 19:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z3 var9 = var4.n3(var3[0].toString());
            if (var9 == null) {
               return this.u9();
            }

            return this.n5(var9, j8.n5(var9));
         case 20:
            return this.n5(var4.t4());
         case 21:
            return this.n5(var4.q0());
         case 22:
            return this.n5(var4.z3());
         case 23:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].n5());
            break;
         case 24:
            return this.n5(var4.m1());
         case 25:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.y4(var3[0].toString());
            break;
         case 26:
            return this.n5(var4.k7());
         case 27:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.k5(var3[0].n5());
            break;
         case 28:
            return this.n5(var4.m3());
         case 29:
            break;
         case 30:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.j3.z8 var8 = var4.n5((com.aspose.slides.internal.j3.z8)((com.aspose.slides.internal.f5.r4)var3[0].D_()));
            if (var8 == null) {
               return this.u9();
            }

            return this.n5(var8, j8.n5(var8));
         case 31:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(new com.aspose.slides.internal.s4.n5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s4.n5.class));
         case 32:
            String[] var7 = new String[var3.length];
            if (var3.length != 0) {
               for (int var18 = 0; var18 < var3.length; var18++) {
                  var7[var18] = var3[var18].toString();
               }
            }

            var4.n5(var7);
            break;
         case 33:
            String[] var5 = new String[var3.length];
            if (var3.length != 0) {
               for (int var6 = 0; var6 < var3.length; var6++) {
                  var5[var6] = var3[var6].toString();
               }
            }

            var4.l6(var5);
            break;
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
