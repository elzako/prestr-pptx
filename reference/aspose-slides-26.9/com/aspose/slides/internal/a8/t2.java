package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.m3.a0;
import com.aspose.slides.internal.m3.a2;
import com.aspose.slides.internal.m3.a7;
import com.aspose.slides.internal.m3.b5;
import com.aspose.slides.internal.m3.c3;
import com.aspose.slides.internal.m3.d5;
import com.aspose.slides.internal.m3.e0;
import com.aspose.slides.internal.m3.h2;
import com.aspose.slides.internal.m3.h9;
import com.aspose.slides.internal.m3.i1;
import com.aspose.slides.internal.m3.j4;
import com.aspose.slides.internal.m3.j5;
import com.aspose.slides.internal.m3.m3;
import com.aspose.slides.internal.m3.m8;
import com.aspose.slides.internal.m3.q0;
import com.aspose.slides.internal.m3.q2;
import com.aspose.slides.internal.m3.q3;
import com.aspose.slides.internal.m3.u6;
import com.aspose.slides.internal.m3.v4;
import com.aspose.slides.internal.m3.v6;
import com.aspose.slides.internal.m3.x0;
import com.aspose.slides.internal.m3.y9;
import com.aspose.slides.internal.m3.z1;
import com.aspose.slides.internal.m3.z7;
import com.aspose.slides.internal.m3.z8;
import com.aspose.slides.internal.q0.e2;
import com.aspose.slides.internal.w8.c4;
import com.aspose.slides.internal.w8.o0;
import com.aspose.slides.internal.w8.p3;
import com.aspose.slides.internal.w8.z6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.g7;

public class t2 implements IGenericEnumerable<h0> {
   private Dictionary<String, h0> n5 = new Dictionary<>();
   private c8 l6;
   private static final g7<com.aspose.slides.internal.w5.k5> k5 = new t2$1();

   public t2(c8 var1) {
      this.l6 = var1;
   }

   public t2(c8 var1, com.aspose.slides.internal.w5.k5 var2, com.aspose.slides.internal.j4.l6 var3) {
      this(var1, var2, var2.a3(), var3);
   }

   public t2(c8 var1, com.aspose.slides.internal.w5.k5 var2, com.aspose.slides.internal.t9.u3 var3, com.aspose.slides.internal.j4.l6 var4) {
      this(var1);
      this.n5(var2, var3, var4);
   }

   @Override
   public final IGenericEnumerator<h0> iterator() {
      return this.n5.getValues().iterator();
   }

   private h0 o7(String var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1) : null;
   }

   private void n5(String var1, String var2) {
      if (d1.n5(var2)) {
         if (this.n5.containsKey(var1)) {
            this.n5.removeItemByKey(var1);
         }
      } else if (this.n5.containsKey(var1)) {
         this.n5.get_Item(var1).n5(var2);
      } else {
         this.n5.addItem(var1, new h0(var1, var2));
      }
   }

   private String v9(String var1) {
      h0 var2 = this.o7(var1);
      return var2 != null ? var2.l6() : null;
   }

   public final void n5(String var1) {
      this.n5("alignment-adjust", var1);
   }

   public final void l6(String var1) {
      this.n5("alignment-baseline", var1);
   }

   public final void k5(String var1) {
      this.n5("azimuth", var1);
   }

   public final void u3(String var1) {
      this.n5("background", var1);
   }

   public final void a6(String var1) {
      this.n5("background-attachment", var1);
   }

   public final void u9(String var1) {
      this.n5("background-color", var1);
   }

   public final void h0(String var1) {
      this.n5("background-image", var1);
   }

   public final void c8(String var1) {
      this.n5("background-position-horizontal", var1);
   }

   public final void t2(String var1) {
      this.n5("background-position-vertical", var1);
   }

   public final void s7(String var1) {
      this.n5("background-repeat", var1);
   }

   public final void x8(String var1) {
      this.n5("baseline-shift", var1);
   }

   public final void n3(String var1) {
      this.n5("border", var1);
   }

   public final void y4(String var1) {
      this.n5("border-bottom", var1);
   }

   public final void e2(String var1) {
      this.n5("border-bottom-color", var1);
   }

   public final void t9(String var1) {
      this.n5("border-bottom-style", var1);
   }

   public final void z1(String var1) {
      this.n5("border-bottom-width", var1);
   }

   public final void t4(String var1) {
      this.n5("border-collapse", var1);
   }

   public final void q0(String var1) {
      this.n5("border-color", var1);
   }

   public final void z3(String var1) {
      this.n5("border-left-color", var1);
   }

   public final void m1(String var1) {
      this.n5("border-left-style", var1);
   }

   public final void k7(String var1) {
      this.n5("border-left-width", var1);
   }

   public final void m3(String var1) {
      this.n5("border-right-color", var1);
   }

   public final void z8(String var1) {
      this.n5("border-right-style", var1);
   }

   public final void j5(String var1) {
      this.n5("border-top-left-radius-h", var1);
   }

   public final void w1(String var1) {
      this.n5("border-top-left-radius-w", var1);
   }

   public final void r4(String var1) {
      this.n5("border-top-right-radius-h", var1);
   }

   public final void c4(String var1) {
      this.n5("border-top-right-radius-w", var1);
   }

   public final void y2(String var1) {
      this.n5("border-bottom-right-radius-h", var1);
   }

   public final void y1(String var1) {
      this.n5("border-bottom-right-radius-w", var1);
   }

   public final void a0(String var1) {
      this.n5("border-bottom-left-radius-h", var1);
   }

   public final void d2(String var1) {
      this.n5("border-bottom-left-radius-w", var1);
   }

   public final void d5(String var1) {
      this.n5("border-right-width", var1);
   }

   public final void s3(String var1) {
      this.n5("border-spacing", var1);
   }

   public final void p8(String var1) {
      this.n5("border-style", var1);
   }

   public final void f2(String var1) {
      this.n5("border-top-color", var1);
   }

   public final String n5() {
      return this.v9("border-top-style");
   }

   public final void i1(String var1) {
      this.n5("border-top-style", var1);
   }

   public final String l6() {
      return this.v9("border-top-width");
   }

   public final void e5(String var1) {
      this.n5("border-top-width", var1);
   }

   public final void b3(String var1) {
      this.n5("border-width", var1);
   }

   public final void o0(String var1) {
      this.n5("bottom", var1);
   }

   public final void z7(String var1) {
      this.n5("break-after", var1);
   }

   public final void v4(String var1) {
      this.n5("break-before", var1);
   }

   public final void u6(String var1) {
      this.n5("caption-side", var1);
   }

   public final void t1(String var1) {
      this.n5("clear", var1);
   }

   public final void a5(String var1) {
      this.n5("clip", var1);
   }

   public final String k5() {
      return this.v9("color");
   }

   public final void h2(String var1) {
      this.n5("color", var1);
   }

   public final void v0(String var1) {
      this.n5("column-count", var1);
   }

   public final void f0(String var1) {
      this.n5("column-gap", var1);
   }

   public final void a3(String var1) {
      this.n5("column-width", var1);
   }

   public final void p3(String var1) {
      this.n5("content-height", var1);
   }

   public final void x9(String var1) {
      this.n5("content-width", var1);
   }

   public final void y0(String var1) {
      this.n5("control-type", var1);
   }

   public final void j9(String var1) {
      this.n5("control-height", var1);
   }

   public final void z6(String var1) {
      this.n5("control-value", var1);
   }

   public final void e9(String var1) {
      this.n5("control-selected", var1);
   }

   public final String u3() {
      return this.v9("control-width");
   }

   public final void o5(String var1) {
      this.n5("control-width", var1);
   }

   public final void j8(String var1) {
      this.n5("direction", var1);
   }

   public final void w2(String var1) {
      this.n5("display-align", var1);
   }

   public final void s0(String var1) {
      this.n5("dominant-baseline", var1);
   }

   public final void v8(String var1) {
      this.n5("elevation", var1);
   }

   public final void v3(String var1) {
      this.n5("empty-cells", var1);
   }

   public final void g7(String var1) {
      this.n5("end-indent", var1);
   }

   public final void j4(String var1) {
      this.n5("external-destination", var1);
   }

   public final void i9(String var1) {
      this.n5("float", var1);
   }

   public final void f5(String var1) {
      this.n5("flow-name", var1);
   }

   public final void j3(String var1) {
      this.n5("font", var1);
   }

   public final void n1(String var1) {
      this.n5("font-family", var1);
   }

   public final String a6() {
      return this.v9("font-size");
   }

   public final void p6(String var1) {
      this.n5("font-size", var1);
   }

   public final void d1(String var1) {
      this.n5("font-size-adjust", var1);
   }

   public final void s4(String var1) {
      this.n5("font-stretch", var1);
   }

   public final void h6(String var1) {
      this.n5("font-style", var1);
   }

   public final void y8(String var1) {
      this.n5("font-variant", var1);
   }

   public final void c3(String var1) {
      this.n5("font-weight", var1);
   }

   public final String u9() {
      return this.v9("height");
   }

   public final void l4(String var1) {
      this.n5("height", var1);
   }

   public final void i6(String var1) {
      this.n5("id", var1);
   }

   public final void a7(String var1) {
      this.n5("isLegend", var1);
   }

   public final void r8(String var1) {
      this.n5("leader-length", var1);
   }

   public final void r1(String var1) {
      this.n5("leader-pattern", var1);
   }

   public final String h0() {
      return this.v9("left");
   }

   public final void y5(String var1) {
      this.n5("left", var1);
   }

   public final void k8(String var1) {
      this.n5("letter-spacing", var1);
   }

   public final void b5(String var1) {
      this.n5("linefeed-treatment", var1);
   }

   public final void u8(String var1) {
      this.n5("line-height", var1);
   }

   public final void w5(String var1) {
      this.n5("line-stacking-strategy", var1);
   }

   public final void q1(String var1) {
      this.n5("margin", var1);
   }

   public final String c8() {
      return this.v9("margin-bottom");
   }

   public final void u5(String var1) {
      this.n5("margin-bottom", var1);
   }

   public final String t2() {
      return this.v9("margin-left");
   }

   public final void w8(String var1) {
      this.n5("margin-left", var1);
   }

   public final String s7() {
      return this.v9("margin-right");
   }

   public final void c2(String var1) {
      this.n5("margin-right", var1);
   }

   public final String x8() {
      return this.v9("margin-top");
   }

   public final void t3(String var1) {
      this.n5("margin-top", var1);
   }

   public final void u4(String var1) {
      this.n5("master-name", var1);
   }

   public final void s9(String var1) {
      this.n5("master-reference", var1);
   }

   public final void p7(String var1) {
      this.n5("max-height", var1);
   }

   public final void z5(String var1) {
      this.n5("max-width", var1);
   }

   public final void h5(String var1) {
      this.n5("min-height", var1);
   }

   public final void a8(String var1) {
      this.n5("min-width", var1);
   }

   public final void f4(String var1) {
      this.n5("number-columns-spanned", var1);
   }

   public final void y9(String var1) {
      this.n5("number-rows-spanned", var1);
   }

   public final void a1(String var1) {
      this.n5("odd-or-even", var1);
   }

   public final void w3(String var1) {
      this.n5("orphans", var1);
   }

   public final void i4(String var1) {
      this.n5("overflow", var1);
   }

   public final void q3(String var1) {
      this.n5("outline-width", var1);
   }

   public final void q2(String var1) {
      this.n5("outline-style", var1);
   }

   public final void p4(String var1) {
      this.n5("outline-color", var1);
   }

   public final void d6(String var1) {
      this.n5("padding", var1);
   }

   public final String n3() {
      return this.v9("padding-bottom");
   }

   public final void y6(String var1) {
      this.n5("padding-bottom", var1);
   }

   public final String y4() {
      return this.v9("padding-left");
   }

   public final void n7(String var1) {
      this.n5("padding-left", var1);
   }

   public final String e2() {
      return this.v9("padding-right");
   }

   public final void l5(String var1) {
      this.n5("padding-right", var1);
   }

   public final String t9() {
      return this.v9("padding-top");
   }

   public final void u2(String var1) {
      this.n5("padding-top", var1);
   }

   public final void d9(String var1) {
      this.n5("page-break-after", var1);
   }

   public final void c5(String var1) {
      this.n5("page-break-before", var1);
   }

   public final void t5(String var1) {
      this.n5("page-break-inside", var1);
   }

   public final void j6(String var1) {
      this.n5("page-height", var1);
   }

   public final void w9(String var1) {
      this.n5("page-position", var1);
   }

   public final void m8(String var1) {
      this.n5("page-width", var1);
   }

   public final void b9(String var1) {
      this.n5("pitch", var1);
   }

   public final void r6(String var1) {
      this.n5("pitch-range", var1);
   }

   public final void r5(String var1) {
      this.n5("play-during", var1);
   }

   public final String z1() {
      return this.v9("position");
   }

   public final void h9(String var1) {
      this.n5("position", var1);
   }

   public final void r7(String var1) {
      this.n5("richness", var1);
   }

   public final void n9(String var1) {
      this.n5("right", var1);
   }

   public final void a2(String var1) {
      this.n5("rule-style", var1);
   }

   public final void h1(String var1) {
      this.n5("rule-thickness", var1);
   }

   public final void t6(String var1) {
      this.n5("scaling", var1);
   }

   public final void v6(String var1) {
      this.n5("src", var1);
   }

   public final void x0(String var1) {
      this.n5("start-indent", var1);
   }

   public final void o2(String var1) {
      this.n5("table-layout", var1);
   }

   public final String t4() {
      return this.v9("text-align");
   }

   public final void e0(String var1) {
      this.n5("text-align", var1);
   }

   public final void i2(String var1) {
      this.n5("text-align-last", var1);
   }

   public final void x7(String var1) {
      this.n5("text-decoration", var1);
   }

   public final void z0(String var1) {
      this.n5("text-indent", var1);
   }

   public final void z9(String var1) {
      this.n5("text-shadow", var1);
   }

   public final void f8(String var1) {
      this.n5("text-transform", var1);
   }

   public final String q0() {
      return this.v9("top");
   }

   public final void s2(String var1) {
      this.n5("top", var1);
   }

   public final void n2(String var1) {
      this.n5("unicode-bidi", var1);
   }

   public final void l0(String var1) {
      this.n5("vertical-align", var1);
   }

   public final void p9(String var1) {
      this.n5("visibility", var1);
   }

   public final void g8(String var1) {
      this.n5("white-space", var1);
   }

   public final void i0(String var1) {
      this.n5("white-space-collapse", var1);
   }

   public final void b4(String var1) {
      this.n5("white-space-treatment", var1);
   }

   public final void x5(String var1) {
      this.n5("widows", var1);
   }

   public final String z3() {
      return this.v9("width");
   }

   public final void i8(String var1) {
      this.n5("width", var1);
   }

   public final void a4(String var1) {
      this.n5("word-break", var1);
   }

   public final void x3(String var1) {
      this.n5("word-spacing", var1);
   }

   public final void b2(String var1) {
      this.n5("wrap-option", var1);
   }

   public final void m4(String var1) {
      this.n5("writing-mode", var1);
   }

   public final void b1(String var1) {
      this.n5("z-index", var1);
   }

   public final void j1(String var1) {
      this.n5("background-all-page", var1);
   }

   public final void k6(String var1) {
      this.n5("html-body", var1);
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      IGenericEnumerator var2 = this.iterator();

      try {
         while (var2.hasNext()) {
            h0 var3 = (h0)var2.next();
            var1.n5("{0}=\"{1}\" ", var3.n5(), var3.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.l6() == 0 ? d1.n5 : var1.n5(0, var1.l6() - 1);
   }

   public final void n5(com.aspose.slides.internal.w5.k5 var1, com.aspose.slides.internal.t9.u3 var2, com.aspose.slides.internal.j4.l6 var3) {
      this.i6(this.l6.n5().n5(var1));
      IGenericEnumerator var4 = var2.h6().iterator();

      try {
         while (var4.hasNext()) {
            int var5 = com.aspose.slides.internal.v6g.k5.u3(var4.next(), int.class);
            if (var2.n5(var5, var1) && (!com.aspose.slides.internal.v6g.k5.l6(var1, c4.class) || 62 != var5 && 54 != var5 && 37 != var5 && 49 != var5)) {
               switch (var5) {
                  case 3:
                     this.n5(var2.a6().toString());
                     break;
                  case 4:
                     this.l6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.m3.u9.class), var2.u9()));
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 16:
                  case 19:
                  case 22:
                  case 25:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  case 40:
                  case 41:
                  case 42:
                  case 43:
                  case 44:
                  case 45:
                  case 46:
                  case 47:
                  case 51:
                  case 52:
                  case 57:
                  case 58:
                  case 64:
                  case 66:
                  case 67:
                  case 68:
                  case 74:
                  case 76:
                  case 77:
                  case 78:
                  case 79:
                  case 80:
                  case 81:
                  case 83:
                  case 84:
                  case 85:
                  case 86:
                  case 87:
                  case 88:
                  case 89:
                  case 90:
                  case 92:
                  case 94:
                  case 95:
                  case 96:
                  case 97:
                  case 98:
                  case 99:
                  case 102:
                  case 103:
                  case 104:
                  case 105:
                  case 106:
                  case 107:
                  case 108:
                  case 109:
                  case 110:
                  case 112:
                  case 115:
                  case 120:
                  case 122:
                  case 123:
                  case 124:
                  case 125:
                  case 126:
                  case 128:
                  case 129:
                  case 130:
                  case 131:
                  case 132:
                  case 133:
                  case 134:
                  case 135:
                  case 136:
                  case 137:
                  case 138:
                  case 139:
                  case 140:
                  case 141:
                  case 143:
                  case 144:
                  case 145:
                  case 146:
                  case 147:
                  case 148:
                  case 149:
                  case 152:
                  case 154:
                  case 155:
                  case 156:
                  case 158:
                  case 159:
                  case 160:
                  case 161:
                  case 167:
                  case 168:
                  case 169:
                  case 170:
                  case 171:
                  case 172:
                  case 177:
                  case 178:
                  case 179:
                  case 180:
                  case 181:
                  case 182:
                  case 183:
                  case 184:
                  case 185:
                  case 186:
                  case 188:
                  case 190:
                  case 193:
                  case 194:
                  case 195:
                  case 206:
                  case 207:
                  case 208:
                  case 209:
                  case 210:
                  case 211:
                  case 216:
                  case 217:
                  case 218:
                  case 219:
                  case 220:
                  case 223:
                  case 224:
                  case 225:
                  case 226:
                  case 227:
                  case 228:
                  case 229:
                  case 230:
                  case 231:
                  case 232:
                  case 233:
                  case 234:
                  case 235:
                  case 236:
                  case 237:
                  case 239:
                  case 242:
                  case 243:
                  case 244:
                  case 245:
                  case 247:
                  case 248:
                  case 249:
                  case 250:
                  case 251:
                  case 252:
                  case 253:
                  case 255:
                  case 256:
                  case 257:
                  case 259:
                  case 261:
                  case 263:
                  case 264:
                  case 265:
                  case 266:
                  case 267:
                  case 268:
                  case 269:
                  case 270:
                  case 274:
                  case 275:
                  case 276:
                  case 277:
                  case 278:
                  case 279:
                  case 280:
                  case 281:
                  case 282:
                  case 290:
                  default:
                     break;
                  case 15:
                     this.k5(var2.h0().toString());
                     break;
                  case 17:
                     this.u3(var2.c8().toString());
                     break;
                  case 18:
                     this.a6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.m3.s7.class), var2.c8().a6()));
                     break;
                  case 20:
                     if (var1.a3().k7().h0() != 0 || !this.n5(var1, k5, 2)) {
                        this.u9(new com.aspose.slides.internal.a1.k5(var1, var2.c8().n5().o8()).n5());
                     }
                     break;
                  case 21:
                     this.h0(new com.aspose.slides.internal.a1.n5(var1, var3, this.l6).n5());
                     break;
                  case 23:
                     this.c8(var2.c8().k5().h0().toString());
                     this.t2(var2.c8().k5().c8().toString());
                     break;
                  case 24:
                     this.s7(new com.aspose.slides.internal.a1.l6(var1).n5());
                     break;
                  case 26:
                     this.x8(var2.t2().toString());
                     break;
                  case 32:
                     this.n3(var2.s7().toString());
                     break;
                  case 33:
                     this.y4(var2.s7().u3().toString());
                     break;
                  case 34:
                     this.e2(new com.aspose.slides.internal.a1.k5(var1, var2.s7().u3().n5().o8()).n5());
                     break;
                  case 35:
                     this.a0(var2.s7().h0().u3().h0().toString());
                     this.d2(var2.s7().h0().u3().c8().toString());
                     break;
                  case 36:
                     this.y2(var2.s7().h0().k5().h0().toString());
                     this.y1(var2.s7().h0().k5().c8().toString());
                     break;
                  case 37:
                     this.t9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q0.class), var2.s7().u3().k5()));
                     this.e2(new com.aspose.slides.internal.a1.k5(var1, var2.s7().u3().n5().o8()).n5());
                     break;
                  case 38:
                     this.z1(var2.s7().u3().l6().toString());
                     break;
                  case 39:
                     this.t4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), var2.s7().a6()));
                     break;
                  case 48:
                     this.z3(new com.aspose.slides.internal.a1.k5(var1, var2.s7().n5().n5().o8()).n5());
                     break;
                  case 49:
                     this.m1(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q0.class), var2.s7().n5().k5()));
                     this.z3(new com.aspose.slides.internal.a1.k5(var1, var2.s7().n5().n5().o8()).n5());
                     break;
                  case 50:
                     this.k7(var2.s7().n5().l6().toString());
                     break;
                  case 53:
                     this.m3(new com.aspose.slides.internal.a1.k5(var1, var2.s7().l6().n5().o8()).n5());
                     break;
                  case 54:
                     this.z8(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q0.class), var2.s7().l6().k5()));
                     this.m3(new com.aspose.slides.internal.a1.k5(var1, var2.s7().l6().n5().o8()).n5());
                     break;
                  case 55:
                     this.d5(var2.s7().l6().l6().toString());
                     break;
                  case 56:
                     this.s3(var2.s7().u9().toString());
                     break;
                  case 59:
                     this.f2(new com.aspose.slides.internal.a1.k5(var1, var2.s7().k5().n5().o8()).n5());
                     break;
                  case 60:
                     this.j5(var2.s7().h0().n5().h0().toString());
                     this.w1(var2.s7().h0().n5().c8().toString());
                     break;
                  case 61:
                     this.r4(var2.s7().h0().l6().h0().toString());
                     this.c4(var2.s7().h0().l6().c8().toString());
                     break;
                  case 62:
                     this.i1(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q0.class), var2.s7().k5().k5()));
                     this.f2(new com.aspose.slides.internal.a1.k5(var1, var2.s7().k5().n5().o8()).n5());
                     break;
                  case 63:
                     this.e5(var2.s7().k5().l6().toString());
                     break;
                  case 65:
                     this.o0(var2.x8().toString());
                     break;
                  case 69:
                     this.u6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(z8.class), var2.n3()));
                     break;
                  case 70:
                     this.t1(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(j5.class), var2.y4()));
                     break;
                  case 71:
                     this.a5(var2.e2().toString());
                     break;
                  case 72:
                     this.h2(new com.aspose.slides.internal.a1.k5(var1, var2.t9().o8()).n5());
                     break;
                  case 73:
                     this.v0(var2.t4().l6().toString());
                     break;
                  case 75:
                     this.f0(var2.t4().k5().toString());
                     break;
                  case 82:
                     this.a3(var2.t4().n5().toString());
                     break;
                  case 91:
                     if (var2.m1() == 0) {
                        this.m4("lr-tb");
                     } else {
                        this.m4("rl-tb");
                     }

                     this.j8(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(a0.class), var2.m1()));
                     break;
                  case 93:
                     this.s0(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(d5.class), var2.m3()));
                     break;
                  case 100:
                     this.v8(var2.z8().toString());
                     break;
                  case 101:
                     this.v3(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(i1.class), var2.j5()));
                     break;
                  case 111:
                     if (var2.w1() != 2) {
                        this.i9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(z7.class), var2.w1()));
                     }
                     break;
                  case 113:
                     this.j3(var2.r4().toString());
                     break;
                  case 114:
                     this.n1(new com.aspose.slides.internal.a1.u3(var1).n5());
                     break;
                  case 116:
                     this.p6(new com.aspose.slides.internal.a1.a6(var1).n5());
                     break;
                  case 117:
                     this.d1(var2.r4().k5().toString());
                     break;
                  case 118:
                     this.s4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(v4.class), var2.r4().h0()));
                     break;
                  case 119:
                     this.h6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(u6.class), var2.r4().u3()));
                     break;
                  case 121:
                     this.y8(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(h2.class), var2.r4().a6().n5()));
                     break;
                  case 127:
                     this.c3(new com.aspose.slides.internal.a1.u9(var1).n5());
                     break;
                  case 142:
                     if (var1.a3().a3() == 2) {
                        this.l4(var2.c4().toString());
                     } else {
                        com.aspose.slides.internal.w5.k5 var14 = com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.w5.k5.class);
                        if (!var2.c4().h0() && var2.c4().c8().n5() == 1 && var14 != null) {
                           if (!var14.a3().c4().h0() && var14.a3().c4().c8().n5() != 1) {
                              float var15 = var14.a3().c4().c8().l6() / 100.0F * var2.c4().c8().l6();
                              this.l4(new e2(var15, var14.a3().c4().c8().n5()).toString());
                              this.p3(this.u9());
                              continue;
                           }

                           if (d1.l6(var14.a6(), "body", (short)5)) {
                              this.l4(var2.c4().toString());
                           }
                           continue;
                        }

                        this.l4(var2.c4().toString());
                        this.p3(this.u9());
                     }
                     break;
                  case 150:
                     this.y5(var2.y2().toString());
                     break;
                  case 151:
                     this.k8(var2.y1().toString());
                     break;
                  case 153:
                     this.u8(var2.a0().toString());
                     break;
                  case 157:
                     this.w5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(j4.class), var2.d2().n5()));
                     break;
                  case 162:
                     this.q1(var2.s3().toString());
                     break;
                  case 163:
                     if ("P".equals(var1.a6()) && !var1.t4(var1.s7())) {
                        break;
                     }

                     if (!var2.s3().k5().h0()
                        && var2.s3().k5().c8().l6() == 1.12F
                        && var2.s3().k5().c8().n5() == 2
                        && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.a5.class)) {
                        com.aspose.slides.internal.w5.l6 var13 = com.aspose.slides.internal.v6g.k5.n5(var1.y4().a6(), com.aspose.slides.internal.w5.l6.class);
                        if (l6(z6.class, var1)) {
                           if (var13 != null && var13.t9()) {
                              this.u5(var2.s3().k5().toString());
                              break;
                           }

                           this.u5("auto");
                           break;
                        }

                        this.u5(var2.s3().k5().toString());
                        break;
                     }

                     this.u5(var2.s3().k5().toString());
                     break;
                  case 164:
                     if (!"P".equals(var1.a6()) || var1.t4(var1.s7())) {
                        this.w8(var2.s3().u3().toString());
                     }
                     break;
                  case 165:
                     if (!"P".equals(var1.a6()) || var1.t4(var1.s7())) {
                        this.c2(var2.s3().l6().toString());
                     }
                     break;
                  case 166:
                     if ("P".equals(var1.a6()) && !var1.t4(var1.s7())) {
                        break;
                     }

                     if (!var2.s3().n5().h0()
                        && var2.s3().n5().c8().l6() == 1.12F
                        && var2.s3().n5().c8().n5() == 2
                        && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.a5.class)) {
                        com.aspose.slides.internal.w5.l6 var12 = com.aspose.slides.internal.v6g.k5.n5(var1.y4().a6(), com.aspose.slides.internal.w5.l6.class);
                        if (n5(z6.class, var1)) {
                           if (var12 != null && var12.t9()) {
                              this.t3(var2.s3().n5().toString());
                              break;
                           }

                           this.t3("auto");
                           break;
                        }

                        this.t3(var2.s3().n5().toString());
                        break;
                     }

                     this.t3(var2.s3().n5().toString());
                     break;
                  case 173:
                     this.p7(var2.p8().toString());
                     break;
                  case 174:
                     this.z5(var2.f2().toString());
                     break;
                  case 175:
                     this.h5(var2.i1().toString());
                     break;
                  case 176:
                     this.a8(var2.e5().toString());
                     break;
                  case 187:
                     this.w3(a3.l6(var2.b3()));
                     break;
                  case 189:
                     if (!var2.o0().n5().h0()) {
                        this.p4(new com.aspose.slides.internal.a1.k5(var1, var2.o0().n5().c8().o8()).n5());
                     } else {
                        com.aspose.slides.internal.o9b.c8 var11 = var2.c8().n5().o8();
                        com.aspose.slides.internal.o9b.c8.n5(255 - (var11.x8() & 255), 255 - (var11.n3() & 255), 255 - (var11.y4() & 255)).n5(var11);
                        this.p4(new com.aspose.slides.internal.a1.k5(var1, var11.o8()).n5());
                     }
                     break;
                  case 191:
                     this.q2(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q0.class), var2.o0().k5()));
                     break;
                  case 192:
                     this.q3(var2.o0().l6().toString());
                     break;
                  case 196:
                     this.i4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(c3.class), var2.z7().n5()));
                     break;
                  case 197:
                     this.i4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(c3.class), var2.z7().l6()));
                     break;
                  case 198:
                     this.d6(var2.v4().toString());
                     break;
                  case 199:
                     this.y6(var2.v4().k5().toString());
                     break;
                  case 200:
                     this.n7(var2.v4().u3().toString());
                     break;
                  case 201:
                     this.l5(var2.v4().l6().toString());
                     break;
                  case 202:
                     this.u2(var2.v4().n5().toString());
                     break;
                  case 203:
                     this.d9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(a7.class), var2.u6()));
                     break;
                  case 204:
                     this.c5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(a7.class), var2.t1()));
                     break;
                  case 205:
                     this.t5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(a7.class), var2.a5()));
                     break;
                  case 212:
                     this.b9(var2.v0().toString());
                     break;
                  case 213:
                     this.r6(var2.h2().toString());
                     break;
                  case 214:
                     this.r5(var2.f0().toString());
                     break;
                  case 215:
                     if (var2.k7().h0() == 3) {
                     }

                     if (var2.a3() != 1) {
                        if (var2.a3() != 0) {
                           this.h9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(b5.class), var2.a3()));
                        }
                     } else {
                        if ((
                              var1.a0() == null
                                 || var1.a0().n3() != 3
                                 || d1.l6(var1.a0().e5()).length() != 0
                                 || var1.t4() == null
                                 || var1.t4().n3() != 1
                                 || !com.aspose.slides.internal.v6g.k5.l6(var1.t4(), o0.class)
                                 || !"image/svg+xml".equals(d1.a6(((o0)var1.t4()).p6()))
                           )
                           && (
                              var1.a0() == null
                                 || var1.a0().n3() != 1
                                 || !com.aspose.slides.internal.v6g.k5.l6(var1.a0(), o0.class)
                                 || !"image/svg+xml".equals(d1.a6(((o0)var1.t4()).p6()))
                           )) {
                           this.h9("relative");
                           break;
                        }

                        this.h9("absolute");
                     }
                     break;
                  case 221:
                     this.r7(var2.p3().toString());
                     break;
                  case 222:
                     this.n9(var2.x9().toString());
                     break;
                  case 238:
                     this.o2(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(y9.class), var2.y0()));
                     break;
                  case 240:
                     this.e0(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q3.class), var2.j9()));
                     break;
                  case 241:
                     this.i2(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q2.class), var2.z6()));
                     break;
                  case 246:
                     this.x7(new com.aspose.slides.internal.a1.c8(var1, var2).n5());
                     break;
                  case 254:
                     this.z0(var2.o5().toString());
                     break;
                  case 258:
                     this.z9(var2.j8().toString());
                     break;
                  case 260:
                     this.f8(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(m8.class), var2.w2()));
                     break;
                  case 262:
                     if (var1.a3().a3() == 2
                        && var1.p3() != null
                        && "BODY".equals(var1.p3().a6())
                        && !var1.a3().s3().n5().h0()
                        && !var1.a3().s0().h0()
                        && var1.a3().s3().n5().c8().n5() == var1.a3().s0().c8().n5()) {
                        this.s2(new e2(var1.a3().s3().n5().c8().l6() + var1.a3().s0().c8().l6() - 8.0F, var1.a3().s3().n5().c8().n5()).toString());
                        break;
                     }

                     this.s2(var2.s0().toString());
                     break;
                  case 271:
                     this.n2(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(h9.class), var2.v8()));
                     break;
                  case 272:
                     if (var1.a3().k7().h0() == 14 && var1.a3().v3().h0()) {
                        switch (var1.a3().v3().c8()) {
                           case 3:
                              this.w2("before");
                           case 4:
                           default:
                              break;
                           case 5:
                              this.w2("center");
                              break;
                           case 6:
                              this.w2("after");
                        }
                     }

                     this.l0(var2.v3().toString());
                     break;
                  case 273:
                     this.p9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(a2.class), var2.g7()));
                     break;
                  case 283:
                     this.g8(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(v6.class), var2.j4()));
                     if (var2.j4() == 1) {
                        this.i0("false");
                        this.b2("no-wrap");
                        this.b5("preserve");
                        this.b4("preserve");
                     }
                     break;
                  case 284:
                     this.x5(a3.l6(var2.i9()));
                     break;
                  case 285:
                     if (!com.aspose.slides.internal.v6g.k5.l6(var1, p3.class)
                        && !com.aspose.slides.internal.v6g.k5.l6(var1, c4.class)
                        && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.t2.class)
                        && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.j4.class)
                        && var1.a3().k7().h0() != 0) {
                        com.aspose.slides.internal.w5.k5 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.w5.k5.class);
                        if (var6 != null && var2.f5().c8().n5() == 1 && !var6.a3().f5().h0() && var6.a3().f5().c8().n5() != 1) {
                           float var7 = var6.a3().f5().c8().l6() / 100.0F * var2.f5().c8().l6();
                           this.i8(new e2(var7, var6.a3().f5().c8().n5()).toString());
                           this.x9(this.z3());
                           continue;
                        }

                        this.i8(var2.f5().toString());
                     } else if ("IMG".equals(var1.a6())) {
                        this.i8(var2.f5().toString());
                        this.x9(this.z3());
                     }
                     break;
                  case 286:
                     this.a4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(x0.class), var2.n1()));
                     break;
                  case 287:
                     this.x3(var2.j3().toString());
                     break;
                  case 288:
                     this.m4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(e0.class), var2.d1()));
                     break;
                  case 289:
                     this.b1(var2.s4().toString());
                     break;
                  case 291:
                     this.z7(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(m3.class), var2.q0()));
                     break;
                  case 292:
                     this.v4(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(m3.class), var2.z3()));
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.w5.k5 var1, g7<com.aspose.slides.internal.w5.k5> var2, int var3) {
      r4 var4 = var1.a0();

      while (var4 != null) {
         if (var4.n3() == 3 && d1.l6(var4.e5()).length() == 0) {
            var4 = var4.s3();
            if (var4 == null) {
               return false;
            }
         }

         if (var4.n3() == 1 && var2.invoke(com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.w5.k5.class))) {
            return true;
         }

         var4 = var4.a0();
         if (--var3 <= 0) {
            break;
         }
      }

      return false;
   }

   private static <TParent extends com.aspose.slides.internal.h6.n5> boolean n5(Class<TParent> var0, com.aspose.slides.internal.h6.n5 var1) {
      while (
         var1 != null
            && (var1.d5() == null || var1.z3() == null && (var1.d5().n3() != 3 || d1.l6(var1.d5().e5()).length() == 0))
            && var1.y2() != null
            && var1.y2().n3() == 1
      ) {
         var1 = (com.aspose.slides.internal.h6.n5)var1.y2();
         if (com.aspose.slides.internal.v6g.k5.l6(var1, var0)) {
            return true;
         }
      }

      return false;
   }

   private static <TParent extends com.aspose.slides.internal.h6.n5> boolean l6(Class<TParent> var0, com.aspose.slides.internal.h6.n5 var1) {
      while (
         var1 != null
            && (var1.s3() == null || var1.m1() == null && (var1.s3().n3() != 3 || d1.l6(var1.s3().e5()).length() == 0))
            && var1.y2() != null
            && var1.y2().n3() == 1
      ) {
         var1 = (com.aspose.slides.internal.h6.n5)var1.y2();
         if (com.aspose.slides.internal.v6g.k5.l6(var1, var0)) {
            return true;
         }
      }

      return false;
   }

   public final t2 n5(t2 var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            h0 var3 = (h0)var2.next();
            this.n5(var3.n5(), var3.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return this;
   }
}
