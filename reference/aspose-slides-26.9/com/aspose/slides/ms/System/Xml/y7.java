package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;

public final class y7 implements Cloneable {
   private com.aspose.slides.internal.l7h.j5 n5;
   private boolean l6;
   private int k5;
   private String u3;
   private int a6;
   private String u9;
   private boolean h0;
   private boolean c8;
   private int t2;
   private int s7;
   private boolean x8;
   private boolean n3;
   private int y4;
   private List<k6> e2 = new List<>();
   private boolean t9;
   private boolean z1;
   private String t4;
   private String q0;
   private String z3;
   private int m1;
   private boolean k7;
   private boolean m3;

   public y7() {
      this.r4();
   }

   public final com.aspose.slides.internal.l7h.j5 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.l7h.j5 var1) {
      this.l6("Encoding");
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6("OmitXmlDeclaration");
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final boolean a6() {
      return this.a6 == 1;
   }

   public final void l6(boolean var1) {
      this.l6("Indent");
      this.a6 = var1 ? 1 : 0;
   }

   public final String u9() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.l6("IndentChars");
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.u9 = var1;
   }

   public final boolean h0() {
      return this.h0;
   }

   public final boolean c8() {
      return this.c8;
   }

   public final int t2() {
      return this.s7;
   }

   public final boolean s7() {
      return this.x8;
   }

   public final int x8() {
      return this.t2;
   }

   public final boolean n3() {
      return this.n3;
   }

   public final int y4() {
      return this.y4;
   }

   public final void n5(int var1) {
      this.y4 = var1;
   }

   public final y7 e2() {
      y7 var1 = com.aspose.slides.internal.v6g.k5.n5(this.w1(), y7.class);
      var1.e2 = new List<>(this.e2);
      var1.m3 = false;
      return var1;
   }

   public final List<k6> t9() {
      return this.e2;
   }

   public final boolean z1() {
      return this.t9;
   }

   public final boolean t4() {
      return this.z1;
   }

   public final String q0() {
      return this.t4;
   }

   public final String z3() {
      return this.q0;
   }

   public final String m1() {
      return this.z3;
   }

   public final int k7() {
      return this.m1;
   }

   public final boolean m3() {
      return this.k7;
   }

   public final int z8() {
      return this.a6;
   }

   public final boolean j5() {
      return this.e2.size() != 0 || this.z3 != null || this.q0 != null || this.m1 == 1;
   }

   public final l1 n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("output");
      }

      v9 var2;
      if ("utf-8".equals(this.n5().s7())) {
         switch (this.y4()) {
            case 0:
               if (this.a6()) {
                  var2 = new g2(var1, this);
               } else {
                  var2 = new o6(var1, this);
               }
               break;
            case 1:
               if (this.a6()) {
                  var2 = new f2(var1, this);
               } else {
                  var2 = new p8(var1, this);
               }
               break;
            case 2:
               var2 = new n1(var1, this);
               break;
            case 3:
               var2 = new q1(var1, this);
               break;
            default:
               return null;
         }
      } else {
         switch (this.y4()) {
            case 0:
               if (this.a6()) {
                  var2 = new a2(var1, this);
               } else {
                  var2 = new n9(var1, this);
               }
               break;
            case 1:
               if (this.a6()) {
                  var2 = new d5(var1, this);
               } else {
                  var2 = new d2(var1, this);
               }
               break;
            case 2:
               var2 = new j3(var1, this);
               break;
            case 3:
               var2 = new q1(var1, this);
               break;
            default:
               return null;
         }
      }

      if (this.y4() != 3 && this.j5()) {
         var2 = new j8(var2, this);
      }

      return new b6(var2, this);
   }

   public final l1 n5(com.aspose.slides.internal.z0k.a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("output");
      }

      v9 var2;
      switch (this.y4()) {
         case 0:
            if (this.a6()) {
               var2 = new a2(var1, this);
            } else {
               var2 = new n9(var1, this);
            }
            break;
         case 1:
            if (this.a6()) {
               var2 = new d5(var1, this);
            } else {
               var2 = new d2(var1, this);
            }
            break;
         case 2:
            var2 = new j3(var1, this);
            break;
         case 3:
            var2 = new q1(var1, this);
            break;
         default:
            return null;
      }

      if (this.y4() != 3 && this.j5()) {
         var2 = new j8(var2, this);
      }

      return new b6(var2, this);
   }

   public final void k5(boolean var1) {
      this.m3 = var1;
   }

   private void l6(String var1) {
      if (this.m3) {
         throw new XmlException(
            "The '{0}' property is read only and cannot be set.", com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), '.', var1})
         );
      }
   }

   private void r4() {
      this.n5 = com.aspose.slides.internal.l7h.j5.z3();
      this.l6 = false;
      this.k5 = 0;
      this.u3 = com.aspose.slides.ms.System.p8.k5();
      this.a6 = -1;
      this.u9 = "  ";
      this.h0 = false;
      this.c8 = false;
      this.t2 = 0;
      this.s7 = 2;
      this.x8 = true;
      this.n3 = true;
      this.y4 = 0;
      this.e2.clear();
      this.z1 = false;
      this.t4 = null;
      this.q0 = null;
      this.z3 = null;
      this.m1 = 0;
      this.t9 = false;
      this.m3 = false;
   }

   protected Object w1() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
