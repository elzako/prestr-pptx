package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.exceptions.UpaException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public final class e2 extends h0 {
   private String n5;
   private d0 l6 = new d0();
   private d0 k5 = new d0();
   private d0 u3 = new d0();
   private d0 a6 = new d0();
   private d0 u9 = new d0();
   private d0 h0 = new d0();
   private d0 c8 = new d0();
   private d0 t2 = new d0();
   private Stack s7 = new Stack();
   private Hashtable x8 = new Hashtable();
   private Hashtable n3 = new Hashtable();
   private a9 y4;

   public e2(com.aspose.slides.ms.System.Xml.z9 var1, b4 var2, a9 var3, x2 var4) {
      super(var1, null, var2, var4);
      this.y4 = var3;
   }

   public final boolean n5(k0t var1, x0 var2) {
      this.u9();
      if (!this.a6()) {
         this.n5(var2);
         var1.n5 = this.u3;
         var1.l6 = this.l6;
         var1.k5 = this.a6;
         var1.u3 = this.c8;
      }

      return !this.a6();
   }

   public final void n5(a9 var1, boolean var2) {
      if (this.x8.get_Item(var1) == null) {
         this.x8.addItem(var1, var1);
         IEnumerator var3 = var1.t9().k5().iterator();

         try {
            while (var3.hasNext()) {
               v1 var4 = (v1)var3.next();
               if (var2) {
                  this.n5(var4);
               }

               this.n5(this.u3, var4.z8(), var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }

         IEnumerator var69 = var1.n3().k5().iterator();

         try {
            while (var69.hasNext()) {
               l2 var5 = (l2)var69.next();
               if (var2) {
                  this.n5(var5);
               }

               this.n5(this.l6, var5.n3(), var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var69, IDisposable.class)) {
               ((IDisposable)var69).dispose();
            }
         }

         IEnumerator var70 = var1.t4().k5().iterator();

         try {
            while (var70.hasNext()) {
               f3 var6 = (f3)var70.next();
               if (var2) {
                  this.n5(var6);
               }

               this.n5(this.u9, var6.u9(), var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var70, IDisposable.class)) {
               ((IDisposable)var70).dispose();
            }
         }

         IEnumerator var71 = var1.y4().k5().iterator();

         try {
            while (var71.hasNext()) {
               j7 var7 = (j7)var71.next();
               if (var2) {
                  this.n5(var7);
               }

               this.n5(this.k5, var7.h0(), var7);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var71, IDisposable.class)) {
               ((IDisposable)var71).dispose();
            }
         }

         IEnumerator var72 = var1.e2().k5().iterator();

         try {
            while (var72.hasNext()) {
               j9e var8 = (j9e)var72.next();
               if (var2) {
                  l9 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, l9.class);
                  if (var9 != null) {
                     this.n5(var9);
                  } else {
                     this.n5(com.aspose.slides.internal.v6g.k5.n5(var8, u1s.class));
                  }
               }

               this.n5(this.a6, var8.r4(), var8);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var72, IDisposable.class)) {
               ((IDisposable)var72).dispose();
            }
         }

         IEnumerator var73 = var1.q0().k5().iterator();

         try {
            while (var73.hasNext()) {
               y3 var74 = (y3)var73.next();
               this.n5(this.h0, var74.h0(), var74);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var73, IDisposable.class)) {
               ((IDisposable)var73).dispose();
            }
         }

         IEnumerator var75 = var1.z3().k5().iterator();

         try {
            while (var75.hasNext()) {
               m2 var10 = (m2)var75.next();
               this.n5(this.t2, var10.h0(), var10);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var75, IDisposable.class)) {
               ((IDisposable)var75).dispose();
            }
         }
      }
   }

   private void h0() {
      u1s[] var1 = t4.u9();
      int var2 = var1.length - 3;

      for (int var3 = 12; var3 < var2; var3++) {
         u1s var4 = var1[var3];
         this.y4.e2().k5(var4.r4(), var4);
         this.a6.k5(var4.r4(), var4);
      }
   }

   private void n5(x0 var1) {
      IEnumerator var2 = this.x8.getValues().iterator();

      try {
         while (var2.hasNext()) {
            a9 var3 = (a9)var2.next();
            String var4 = var3.a6();
            if (var4 == null) {
               var4 = com.aspose.slides.ms.System.d1.n5;
            }

            var1.n3().set_Item(var4, true);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      IEnumerator var41 = this.u3.k5().iterator();

      try {
         while (var41.hasNext()) {
            v1 var5 = (v1)var41.next();
            var1.h0().addItem(var5.z8(), var5.a0());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
            ((IDisposable)var41).dispose();
         }
      }

      IEnumerator var42 = this.l6.k5().iterator();

      try {
         while (var42.hasNext()) {
            l2 var6 = (l2)var42.next();
            var1.e2().addItem(var6.n3(), var6.t9());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
            ((IDisposable)var42).dispose();
         }
      }

      IEnumerator var43 = this.a6.k5().iterator();

      try {
         while (var43.hasNext()) {
            j9e var7 = (j9e)var43.next();
            var1.y4().addItem(var7.r4(), var7.u6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            ((IDisposable)var43).dispose();
         }
      }

      IEnumerator var44 = this.h0.k5().iterator();

      try {
         while (var44.hasNext()) {
            y3 var8 = (y3)var44.next();
            i2 var9 = new i2(var8.h0());
            var9.n5(var8.u9());
            var9.l6(var8.l6());
            if (!var1.t9().containsKey(var9.n5().l6())) {
               var1.t9().addItem(var9.n5().l6(), var9);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var44, IDisposable.class)) {
            ((IDisposable)var44).dispose();
         }
      }
   }

   public final void n5(k0t var1) {
      SortedList var2 = var1.z1();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         a9 var4 = (a9)var2.getByIndex(var3);
         if (var4.t2()) {
            this.n5(var4, false);
         }
      }
   }

   public final boolean u9() {
      this.a6.l6(t4.l6, l9.n5());
      if (this.y4 != null) {
         this.y4.e2().k5(t4.l6, l9.n5());
         this.h0();
      }

      IEnumerator var1 = this.u9.k5().iterator();

      try {
         while (var1.hasNext()) {
            f3 var2 = (f3)var1.next();
            this.l6(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            ((IDisposable)var1).dispose();
         }
      }

      IEnumerator var124 = this.k5.k5().iterator();

      try {
         while (var124.hasNext()) {
            j7 var3 = (j7)var124.next();
            this.l6(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var124, IDisposable.class)) {
            ((IDisposable)var124).dispose();
         }
      }

      IEnumerator var125 = this.a6.k5().iterator();

      try {
         while (var125.hasNext()) {
            j9e var4 = (j9e)var125.next();
            l9 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, l9.class);
            if (var5 != null) {
               this.l6(var5);
            } else {
               this.l6((u1s)var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var125, IDisposable.class)) {
            ((IDisposable)var125).dispose();
         }
      }

      IEnumerator var126 = this.u3.k5().iterator();

      try {
         while (var126.hasNext()) {
            v1 var127 = (v1)var126.next();
            if (var127.a0() == null) {
               this.k5(var127);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var126, IDisposable.class)) {
            ((IDisposable)var126).dispose();
         }
      }

      IEnumerator var128 = this.l6.k5().iterator();

      try {
         while (var128.hasNext()) {
            l2 var6 = (l2)var128.next();
            if (var6.t9() == null) {
               this.l6(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var128, IDisposable.class)) {
            ((IDisposable)var128).dispose();
         }
      }

      IEnumerator var129 = this.t2.k5().iterator();

      try {
         while (var129.hasNext()) {
            m2 var7 = (m2)var129.next();
            if (var7.c8() == null) {
               this.n5(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var129, IDisposable.class)) {
            ((IDisposable)var129).dispose();
         }
      }

      while (this.s7.size() > 0) {
         l9 var130 = (l9)this.s7.pop();
         this.u9(var130);
      }

      this.c8();
      IEnumerator var131 = this.a6.k5().iterator();

      try {
         while (var131.hasNext()) {
            j9e var8 = (j9e)var131.next();
            l9 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, l9.class);
            if (var9 != null) {
               this.k5(var9);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var131, IDisposable.class)) {
            ((IDisposable)var131).dispose();
         }
      }

      IEnumerator var132 = this.u3.k5().iterator();

      try {
         while (var132.hasNext()) {
            v1 var133 = (v1)var132.next();
            l9 var10 = com.aspose.slides.internal.v6g.k5.n5(var133.j5(), l9.class);
            if (var10 != null && com.aspose.slides.ms.System.Xml.k6.n5(var133.m1(), com.aspose.slides.ms.System.Xml.k6.n5)) {
               this.k5(var10);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var132, IDisposable.class)) {
            ((IDisposable)var132).dispose();
         }
      }

      IEnumerator var134 = this.u9.k5().iterator();

      try {
         while (var134.hasNext()) {
            f3 var135 = (f3)var134.next();
            f3 var11 = var135.c8();
            if (var11 != null) {
               this.n5(var135, var11);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var134, IDisposable.class)) {
            ((IDisposable)var134).dispose();
         }
      }

      IEnumerator var136 = this.k5.k5().iterator();

      try {
         while (var136.hasNext()) {
            j7 var137 = (j7)var136.next();
            j7 var12 = var137.s7();
            if (var12 != null) {
               this.n5(var137, var12);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var136, IDisposable.class)) {
            ((IDisposable)var136).dispose();
         }
      }

      return !this.a6();
   }

   private void n5(l2 var1) {
      if (var1.s7() != null) {
         this.n5(var1.s7());
      }

      var1.n5((h9)null);
   }

   private void n5(j7 var1) {
      this.n5(var1.l6());
      var1.c8().n5();
      var1.l6((k9)null);
      if (var1.s7() != null) {
         this.n5(var1.s7());
      }
   }

   private void n5(l9 var1) {
      if (!com.aspose.slides.ms.System.Xml.k6.n5(var1.r4(), t4.l6)) {
         if (var1.x8() != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.x8(), y9w.class)) {
               y9w var2 = (y9w)var1.x8();
               if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(), i0e.class)) {
                  i0e var3 = (i0e)var2.n5();
                  this.n5(var3.l6());
               } else {
                  f6z var5 = (f6z)var2.n5();
                  this.n5(var5.h0());
               }
            } else {
               p0 var4 = (p0)var1.x8();
               if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), s1.class)) {
                  s1 var6 = (s1)var4.l6();
                  this.n5(var6.l6());
                  this.n5(var6.u9());
               } else {
                  g9 var7 = (g9)var4.l6();
                  this.n5(var7.l6());
                  this.n5(var7.u9());
               }
            }
         } else {
            this.n5(var1.n3());
            this.n5(var1.y4());
         }

         var1.m3().n5();
         var1.m1().n5();
         var1.l6((k9)null);
         var1.l6(c1.n5);
         var1.n5((t6)null);
         var1.k5(false);
         if (var1.t1() != null) {
            this.n5(com.aspose.slides.internal.v6g.k5.n5(var1.t1(), l9.class));
         }
      }
   }

   private void n5(u1s var1) {
      if (var1 != j9e.k5(var1.o0())) {
         var1.n5((com.aspose.slides.internal.b8c.t6)null);
         if (var1.t1() != null) {
            this.n5(com.aspose.slides.internal.v6g.k5.n5(var1.t1(), u1s.class));
         }
      }
   }

   private void n5(v1 var1) {
      if (var1.k7() != null) {
         l9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.k7(), l9.class);
         if (var2 != null) {
            this.n5(var2);
         } else {
            this.n5((u1s)var1.k7());
         }
      }

      for (int var3 = 0; var3 < var1.m3().size(); var3++) {
         ((m2)var1.m3().n5(var3)).n5((y4)null);
      }

      var1.n5((t6)null);
      var1.k5(false);
   }

   private void n5(z4 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         l2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(var2), l2.class);
         if (var3 != null) {
            this.n5(var3);
         }
      }
   }

   private void n5(f3 var1) {
      this.n5(var1.l6());
      var1.n5((c1)null);
      if (var1.c8() != null) {
         this.n5(var1.c8());
      }
   }

   private void n5(c1 var1) {
      v1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, v1.class);
      if (var2 != null) {
         this.n5(var2);
      } else {
         g3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, g3.class);
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.n5().size(); var4++) {
               this.n5((c1)var3.n5().n5(var4));
            }
         }
      }
   }

   private void c8() {
      IEnumerator var1 = this.u3.k5().iterator();

      try {
         while (var1.hasNext()) {
            v1 var2 = (v1)var1.next();
            if (!var2.z3().k5()) {
               v1 var3 = com.aspose.slides.internal.v6g.k5.n5(this.u3.k5(var2.z3()), v1.class);
               if (var3 == null) {
                  this.n5("Reference to undeclared substitution group affiliation.", var2);
               } else {
                  if (!j9e.n5(var2.j5(), var3.j5(), var3.r4())) {
                     this.n5("'{0}' cannot be a member of substitution group with head element '{1}'.", var2.z8().toString(), var3.z8().toString(), var2);
                  }

                  f8y var4 = (f8y)this.c8.k5(var2.z3());
                  if (var4 == null) {
                     var4 = new f8y();
                     var4.n5(var2.z3());
                     this.c8.n5(var2.z3(), var4);
                  }

                  ArrayList var5 = var4.n5();
                  if (!var5.contains(var2)) {
                     var5.addItem(var2);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            ((IDisposable)var1).dispose();
         }
      }

      IEnumerator var14 = this.c8.k5().iterator();

      try {
         while (var14.hasNext()) {
            f8y var15 = (f8y)var14.next();
            this.n5(var15);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            ((IDisposable)var14).dispose();
         }
      }
   }

   private void n5(f8y var1) {
      if (var1.e5() && var1.n5().size() > 0) {
         this.n5("Circular substitution group affiliation.", (v1)var1.n5().get_Item(0));
      } else {
         v1 var2 = (v1)this.u3.k5(var1.l6());
         if (!var1.n5().contains(var2)) {
            var1.u9(true);

            try {
               if (var2.r4() == 255) {
                  this.n5("Cannot be nominated as the {substitution group affiliation} of any other declaration.", var2);
               }

               ArrayList var3 = null;

               for (int var4 = 0; var4 < var1.n5().size(); var4++) {
                  v1 var5 = (v1)var1.n5().get_Item(var4);
                  if ((var5.a0().n3() & 1) == 0) {
                     f8y var6 = (f8y)this.c8.k5(var5.z8());
                     if (var6 != null) {
                        this.n5(var6);

                        for (int var7 = 0; var7 < var6.n5().size(); var7++) {
                           if (var6.n5().get_Item(var7) != var5) {
                              if (var3 == null) {
                                 var3 = new ArrayList();
                              }

                              var3.addItem(var6.n5().get_Item(var7));
                           }
                        }
                     }
                  }
               }

               if (var3 != null) {
                  for (int var11 = 0; var11 < var3.size(); var11++) {
                     var1.n5().addItem(var3.get_Item(var11));
                  }
               }

               var1.n5().addItem(var2);
            } finally {
               var1.u9(false);
            }
         }
      }
   }

   private void n5(f3 var1, f3 var2) {
      if (var2.c8() != null) {
         this.n5(var2, var2.c8());
      }

      if (var1.t2() == 0) {
         if (var2.h0() == null) {
            var2.n5(this.n5(var2.l6(), true));
         }

         if (var1.h0() == null) {
            var1.n5(this.n5(var1.l6(), true));
         }

         this.a6(var1.h0());
         this.a6(var2.h0());
         this.n5(var1.h0(), var2.h0());
      }
   }

   private void n5(j7 var1, j7 var2) {
      if (var2.s7() != null) {
         this.n5(var2, var2.s7());
      }

      if (var1.x8() == 0) {
         this.l6(var2);
         this.l6(var1);
         this.l6(var2, var1);
      }
   }

   private void l6(f3 var1) {
      if (var1.e5()) {
         this.n5("Circular group reference.", var1);
         var1.n5(c1.n5);
      } else {
         var1.u9(true);
         if (var1.h0() == null) {
            var1.n5(this.n5(var1.l6(), true));
         }

         var1.u9(false);
      }
   }

   private void l6(u1s var1) {
      if (var1.e5()) {
         throw new XmlSchemaException("Circular type reference.", var1);
      }

      if (var1.u6() == null) {
         var1.u9(true);

         try {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), e5a.class)) {
               e5a var2 = (e5a)var1.n5();
               var1.n5(t4.n5());
               v5 var3;
               if (var2.n5().k5()) {
                  this.l6(var2.l6());
                  var2.l6(var2.l6());
                  var3 = var2.l6().b3();
               } else {
                  u1s var4 = this.n5(var2.n5());
                  if (var4 == null) {
                     throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", var2.n5().toString(), var2);
                  }

                  if ((var4.c4() & 8) != 0) {
                     this.n5("The base type is the final list.", var1);
                  }

                  var2.l6(var4);
                  var3 = var4.b3();
               }

               var1.n5(var3.n5(var1));
               var1.c8(8);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), r3q.class)) {
               r3q var11 = (r3q)var1.n5();
               v5 var13;
               if (var11.n5().k5()) {
                  this.l6(var11.l6());
                  var1.n5(var11.l6());
                  var13 = var11.l6().b3();
               } else if (var1.t1() != null && com.aspose.slides.ms.System.Xml.k6.n5(var11.n5(), var1.t1().r4())) {
                  this.l6((u1s)var1.t1());
                  var1.n5(var1.t1().y1());
                  var13 = var1.t1().b3();
               } else {
                  if (var11.n5().equals(t4.n5)) {
                     a9 var14 = t5.n5(var1);
                     if (!"http://www.w3.org/2001/XMLSchema".equals(var14.a6())) {
                        throw new XmlSchemaException("Restriction of 'anySimpleType' is not allowed.", var11.n5().toString(), var1);
                     }
                  }

                  u1s var15 = this.n5(var11.n5());
                  if (var15 == null) {
                     throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", var11.n5().toString(), var11);
                  }

                  if ((var15.c4() & 4) != 0) {
                     this.n5("The base type is final restriction.", var1);
                  }

                  var1.n5(var15);
                  var13 = var15.b3();
               }

               var1.n5(var13.n5(var11.u9(), this.n5(), var1));
               var1.c8(4);
            } else {
               u1s[] var12 = this.k5(var1);
               var1.n5(t4.n5());
               var1.n5(v5.l6(var12, var1));
               var1.c8(16);
            }
         } catch (XmlSchemaException var9) {
            if (var9.getSourceSchemaObject() == null) {
               var9.setSource(var1);
            }

            this.n5(var9);
            var1.n5(t4.n5().b3());
         } finally {
            t6 var6 = new t6();
            var6.n5(z1.l6);
            var6.n5(var1);
            var6.n5(var1.b3());
            var1.n5(var6);
            var1.u9(false);
         }
      }
   }

   private u1s[] k5(u1s var1) {
      ArrayList var2 = new ArrayList();
      d4n var3 = (d4n)var1.n5();
      com.aspose.slides.ms.System.Xml.k6[] var4 = var3.l6();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            u1s var6 = this.n5(var4[var5]);
            if (var6 == null) {
               throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", var4[var5].toString(), var3);
            }

            if (var6.b3().x8() == 2) {
               this.n5(var6, var2, var1);
            } else {
               var2.addItem(var6);
            }

            if ((var6.c4() & 16) != 0) {
               this.n5("The base type is the final union.", var1);
            }
         }
      }

      z4 var9 = var3.n5();
      if (var9 != null) {
         for (int var7 = 0; var7 < var9.size(); var7++) {
            u1s var8 = (u1s)var9.n5(var7);
            this.l6(var8);
            if (var8.b3().x8() == 2) {
               this.n5(var8, var2, var1);
            } else {
               var2.addItem(var8);
            }
         }
      }

      var3.n5(
         com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var2.toArray(com.aspose.slides.internal.v6g.k5.n5(u1s.class))), u1s[].class)
      );
      return var3.u9();
   }

   private void n5(u1s var1, ArrayList var2, u1s var3) {
      v5 var4 = var1.b3();
      if (var1.a0() != 4 || !var4.e2() && !var4.t9()) {
         h6 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.b3(), h6.class);
         var2.addRange(com.aspose.slides.ms.System.u3.n5((Object)(var5.m3())));
      } else {
         this.n5(
            "It is an error if a union type has a member with variety union and this member cannot be substituted with its own members. This may be due to the fact that the union member is a restriction of a union with facets.",
            var3
         );
      }
   }

   private void l6(l9 var1) {
      if (var1.u6() == null) {
         if (var1.e5()) {
            this.n5("Circular type reference.", var1);
         } else {
            var1.u9(true);

            try {
               if (var1.x8() != null) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var1.x8(), y9w.class)) {
                     y9w var2 = (y9w)var1.x8();
                     var1.t2(0);
                     if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(), i0e.class)) {
                        this.n5(var1, (i0e)var2.n5());
                     } else {
                        this.n5(var1, (f6z)var2.n5());
                     }
                  } else {
                     p0 var13 = (p0)var1.x8();
                     if (com.aspose.slides.internal.v6g.k5.l6(var13.l6(), s1.class)) {
                        this.n5(var1, var13, (s1)var13.l6());
                     } else {
                        this.n5(var1, var13, (g9)var13.l6());
                     }
                  }
               } else {
                  var1.n5(l9.n5());
                  this.n5(l9.n5(), var1, var1.y4(), var1.e2(), 4);
                  var1.c8(4);
                  var1.l6(this.l6(var1.n3()));
                  var1.t2(this.n5(var1, null, var1.q0()));
               }

               if (var1.u3(true)) {
                  this.n5("Two distinct members of the attribute uses must not have type definitions which are both xs:ID or are derived from xs:ID.", var1);
               }

               t6 var14 = new t6();
               var14.n5(this.a6(var1));
               var14.n5(var1);
               var14.u3(var1.c8());
               var14.n5(var1.b3());
               var14.n5(var1.z3());
               var14.n5(var1.k7());
               IEnumerator var3 = var1.m1().k5().iterator();

               try {
                  while (var3.hasNext()) {
                     l2 var4 = (l2)var3.next();
                     if (var4.x8() == 2) {
                        if (!var14.m3().containsKey(var4.n3())) {
                           var14.m3().addItem(var4.n3(), var4.n3());
                        }
                     } else if (!var14.k7().containsKey(var4.n3())
                        && var4.t9() != null
                        && com.aspose.slides.ms.System.Xml.k6.l6(var4.t9().z8(), com.aspose.slides.ms.System.Xml.k6.n5)
                        && var4.t9() != h9.n5) {
                        var14.n5(var4.t9());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                     ((IDisposable)var3).dispose();
                  }
               }

               var1.n5(var14);
            } finally {
               var1.u9(false);
            }
         }
      }
   }

   private void n5(l9 var1, i0e var2) {
      l9 var3 = null;
      if (var1.t1() != null && com.aspose.slides.ms.System.Xml.k6.n5(var2.n5(), var1.t1().r4())) {
         var3 = (l9)var1.t1();
         this.l6(var3);
         var1.n5(var3);
         var1.n5(var3.b3());
      } else {
         j9e var4 = this.k5(var2.n5());
         if (var4 == null) {
            this.n5("Type '{0}' is not declared.", var2.n5().toString(), var2);
         } else {
            var1.n5(var4);
            var1.n5(var4.b3());
         }

         var3 = com.aspose.slides.internal.v6g.k5.n5(var4, l9.class);
      }

      if (var3 != null) {
         if ((var3.c4() & 2) != 0) {
            this.n5("The base type is the final extension.", var1);
         }

         if (var3.t9() != 0) {
            this.n5("The content type of the base type must be a simple type definition or it must be mixed, and simpleType child must be present.", var1);
         }
      }

      var1.c8(2);
      this.n5(var3, var1, var2.l6(), var2.u9(), 2);
   }

   private void n5(l9 var1, f6z var2) {
      l9 var3 = null;
      v5 var4 = null;
      if (var1.t1() != null && com.aspose.slides.ms.System.Xml.k6.n5(var2.n5(), var1.t1().r4())) {
         var3 = (l9)var1.t1();
         this.l6(var3);
         var4 = var3.b3();
      } else {
         var3 = this.l6(var2.n5());
         if (var3 == null) {
            this.n5("Undefined complexType '{0}' is used as a base for complex type restriction.", var2.n5().toString(), var2);
            return;
         }

         if (var3.t9() == 0) {
            if (var2.l6() == null) {
               var4 = var3.b3();
            } else {
               this.l6(var2.l6());
               if (!j9e.n5(var2.l6().b3(), var3.b3(), 256)) {
                  this.n5("The data type of the simple content is not a valid restriction of the base complex type.", var2);
               }

               var4 = var2.l6().b3();
            }
         } else if (var3.t9() != 3 || !var3.u6().z1().n5()) {
            this.n5("The content type of the base type must be a simple type definition or it must be mixed, and simpleType child must be present.", var1);
         } else if (var2.l6() != null) {
            this.l6(var2.l6());
            var1.n5(var2.l6());
            var4 = var2.l6().b3();
         } else {
            this.n5("Simple content restriction must have a simple type child if the content type of the base type is not a simple type definition.", var2);
         }
      }

      if (var3 != null && var3.u6() != null && (var3.c4() & 4) != 0) {
         this.n5("The base type is final restriction.", var1);
      }

      if (var3 != null) {
         var1.n5(var3);
      }

      if (var4 != null) {
         try {
            var1.n5(var4.n5(var2.u9(), this.n5(), var1));
         } catch (XmlSchemaException var6) {
            if (var6.getSourceSchemaObject() == null) {
               var6.setSource(var1);
            }

            this.n5(var6);
            var1.n5(t4.n5().b3());
         }
      }

      var1.c8(4);
      this.n5(var3, var1, var2.h0(), var2.c8(), 4);
   }

   private void n5(l9 var1, p0 var2, s1 var3) {
      l9 var4 = null;
      if (var1.t1() != null && com.aspose.slides.ms.System.Xml.k6.n5(var3.n5(), var1.t1().r4())) {
         var4 = (l9)var1.t1();
         this.l6(var4);
      } else {
         var4 = this.l6(var3.n5());
         if (var4 == null) {
            this.n5("Undefined complexType '{0}' is used as a base for complex type extension.", var3.n5().toString(), var3);
            return;
         }
      }

      if ((var4.c4() & 2) != 0) {
         this.n5("The base type is the final extension.", var1);
      }

      this.n5(var4, var1, var3.u9(), var3.h0(), 2);
      c1 var5 = var4.q0();
      c1 var6 = this.n5(var3.l6(), true);
      if (var5 != c1.n5) {
         if (var6 != c1.n5) {
            f1s var7 = new f1s();
            var7.n5().n5(var5);
            var7.n5().n5(var6);
            var1.l6(this.l6(var7));
         } else {
            var1.l6(var5);
         }
      } else {
         var1.l6(var6);
      }

      int var9 = this.n5(var1, var2, var6);
      if (var9 == 1) {
         var9 = var4.t9();
         if (var9 == 0) {
            var1.n5(var4.b3());
         }
      }

      var1.t2(var9);
      if (var4.t9() != 1 && var1.t9() != var4.t9()) {
         this.n5("The derived type and the base type must have the same content type.", var1);
      } else {
         var1.n5(var4);
         var1.c8(2);
      }
   }

   private void n5(l9 var1, p0 var2, g9 var3) {
      l9 var4 = null;
      if (var1.t1() != null && com.aspose.slides.ms.System.Xml.k6.n5(var3.n5(), var1.t1().r4())) {
         var4 = (l9)var1.t1();
         this.l6(var4);
      } else {
         var4 = this.l6(var3.n5());
         if (var4 == null) {
            this.n5("Undefined complexType '{0}' is used as a base for complex type restriction.", var3.n5().toString(), var3);
            return;
         }
      }

      var1.n5(var4);
      if ((var4.c4() & 4) != 0) {
         this.n5("The base type is final restriction.", var1);
      }

      this.n5(var4, var1, var3.u9(), var3.h0(), 4);
      var1.l6(this.l6(var3.l6()));
      int var5 = this.n5(var1, var2, var1.q0());
      var1.t2(var5);
      switch (var5) {
         case 1:
            if (var4.u6() != null && !var4.u6().z1().n5()) {
               this.n5(
                  "Invalid content type derivation by restriction. {0}",
                  com.aspose.slides.ms.System.Xml.v3.n5(
                     "If the derived content type is Empty, then the base content type should also be Empty or Mixed with Emptiable particle according to rule 5.3 of Schema Component Constraint: Derivation Valid (Restriction, Complex)."
                  ),
                  var1
               );
            }
            break;
         case 3:
            if (var4.t9() != 3) {
               this.n5(
                  "Invalid content type derivation by restriction. {0}",
                  com.aspose.slides.ms.System.Xml.v3.n5(
                     "If the derived content type is Mixed, then the base content type should also be Mixed according to rule 5.4 of Schema Component Constraint: Derivation Valid (Restriction, Complex)."
                  ),
                  var1
               );
            }
      }

      var1.c8(4);
   }

   private void k5(l9 var1) {
      l9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.y1(), l9.class);
      this.n5 = null;
      if (var2 != null && var2 != l9.n5() && var1.a0() == 4) {
         c1 var9 = this.k5(var1.q0());
         c1 var10 = this.k5(var2.q0());
         if (!this.l6(var9, var10)) {
            if (this.n5 != null) {
               this.n5("Invalid particle derivation by restriction - '{0}'.", this.n5, var1);
            } else {
               this.n5("Invalid particle derivation by restriction.", var1);
            }
         }
      } else if (var2 == l9.n5()) {
         IEnumerator var3 = var1.m3().k5().iterator();

         try {
            while (var3.hasNext()) {
               v1 var4 = (v1)var3.next();
               if (!var4.y1()) {
                  l9 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.j5(), l9.class);
                  if (var5 != null
                     && com.aspose.slides.ms.System.Xml.k6.n5(var4.m1(), com.aspose.slides.ms.System.Xml.k6.n5)
                     && com.aspose.slides.ms.System.Xml.k6.n5(var4.q0(), com.aspose.slides.ms.System.Xml.k6.n5)) {
                     var4.k5(true);
                     this.k5(var5);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }
   }

   private void n5(c1 var1, c1 var2) {
      this.n5 = null;
      var1 = this.k5(var1);
      var2 = this.k5(var2);
      if (!this.l6(var1, var2)) {
         if (this.n5 != null) {
            this.n5("Invalid particle derivation by restriction - '{0}'.", this.n5, var1);
         } else {
            this.n5("Invalid particle derivation by restriction.", var1);
         }
      }
   }

   private c1 l6(c1 var1) {
      c1 var2 = this.n5(var1, true);
      d4 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, d4.class);
      if (var3 != null && var3.n5().size() == 0) {
         if (com.aspose.slides.ms.System.c4.h0(var3.z7(), com.aspose.slides.ms.System.c4.a6)) {
            this.n5("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", var3, 1);
         }

         return c1.n5;
      } else {
         return var2;
      }
   }

   private c1 n5(c1 var1, boolean var2) {
      if (var1 == null || var1.l6()) {
         return c1.n5;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, e1.class)) {
         return this.n5((e1)var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, u0.class)) {
         return this.n5((u0)var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, d4.class)) {
         return this.n5((d4)var1, var2);
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1, f1s.class) ? this.n5((f1s)var1, var2) : var1;
      }
   }

   private c1 l6(v1 var1) {
      if (!var1.q0().k5() && (var1.a0().n3() & 1) == 0) {
         f8y var2 = (f8y)this.c8.k5(var1.z8());
         if (var2 == null) {
            return var1;
         }

         d4 var3 = new d4();

         for (int var4 = 0; var4 < var2.n5().size(); var4++) {
            var3.n5().n5((v1)var2.n5().get_Item(var4));
         }

         var3.n5(var1.z7().l6());
         var3.l6(var1.v4().l6());
         this.n5(var3, var1, false);
         return var3;
      } else {
         return var1;
      }
   }

   private c1 n5(e1 var1, boolean var2) {
      f3 var3;
      if (var1.u9() != null) {
         var3 = var1.u9();
      } else {
         var3 = (f3)this.u9.k5(var1.n5());
      }

      if (var3 == null) {
         this.n5("Reference to undeclared model group '{0}'.", var1.n5().toString(), var1);
         return c1.n5;
      }

      if (var3.h0() == null) {
         this.l6(var3);
      }

      if (var3.h0() == c1.n5) {
         return c1.n5;
      }

      g3 var4 = (g3)var3.h0();
      if (com.aspose.slides.internal.v6g.k5.l6(var4, u0.class)) {
         if (!var2) {
            this.n5("The group ref to 'all' is not the root particle, or it is being used as an extension.", "", var1);
            return c1.n5;
         }

         if (com.aspose.slides.ms.System.c4.t2(var1.z7(), com.aspose.slides.ms.System.c4.u3)
            || com.aspose.slides.ms.System.c4.h0(var1.v4(), com.aspose.slides.ms.System.c4.u3)) {
            this.n5("The group ref to 'all' must have {min occurs}= 0 or 1 and {max occurs}=1.", var1);
            return c1.n5;
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var4, d4.class) && var4.n5().size() == 0) {
         if (com.aspose.slides.ms.System.c4.h0(var1.z7(), com.aspose.slides.ms.System.c4.a6)) {
            this.n5("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", var1, 1);
         }

         return c1.n5;
      }

      g3 var5 = com.aspose.slides.internal.v6g.k5.l6(var4, f1s.class)
         ? new f1s()
         : (com.aspose.slides.internal.v6g.k5.l6(var4, d4.class) ? new d4() : new u0());
      var5.n5(var1.z7().l6());
      var5.l6(var1.v4().l6());
      this.n5(var5, var1, true);

      for (int var6 = 0; var6 < var4.n5().size(); var6++) {
         var5.n5().n5(var4.n5().n5(var6));
      }

      var1.n5(var5);
      return var5;
   }

   private c1 n5(u0 var1, boolean var2) {
      if (var1.n5().size() > 0) {
         u0 var3 = new u0();
         var3.n5(var1.z7().l6());
         var3.l6(var1.v4().l6());
         this.n5(var3, var1, true);

         for (int var4 = 0; var4 < var1.n5().size(); var4++) {
            c1 var5 = this.n5((v1)var1.n5().n5(var4), false);
            if (var5 != c1.n5) {
               var3.n5().n5(var5);
            }
         }

         var1 = var3;
      }

      if (var1.n5().size() == 0) {
         return c1.n5;
      } else if (!var2) {
         this.n5("'all' is not the only particle in a group, or is being used as an extension.", var1);
         return c1.n5;
      } else {
         return var1;
      }
   }

   private c1 n5(d4 var1, boolean var2) {
      d4 var3 = var1;
      if (var1.n5().size() > 0) {
         d4 var4 = new d4();
         var4.n5(var1.z7().l6());
         var4.l6(var1.v4().l6());
         this.n5(var4, var1, true);

         for (int var5 = 0; var5 < var1.n5().size(); var5++) {
            c1 var6 = this.n5((c1)var1.n5().n5(var5), false);
            if (var6 != c1.n5) {
               if (com.aspose.slides.ms.System.c4.c8(var6.z7(), com.aspose.slides.ms.System.c4.u3)
                  && com.aspose.slides.ms.System.c4.c8(var6.v4(), com.aspose.slides.ms.System.c4.u3)
                  && com.aspose.slides.internal.v6g.k5.l6(var6, d4.class)) {
                  d4 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, d4.class);

                  for (int var8 = 0; var8 < var7.n5().size(); var8++) {
                     var4.n5().n5(var7.n5().n5(var8));
                  }
               } else {
                  var4.n5().n5(var6);
               }
            }
         }

         var1 = var4;
      }

      if (!var2 && var1.n5().size() == 0) {
         if (com.aspose.slides.ms.System.c4.h0(var1.z7(), com.aspose.slides.ms.System.c4.a6)) {
            this.n5("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", var3, 1);
         }

         return c1.n5;
      } else {
         return !var2
               && var1.n5().size() == 1
               && com.aspose.slides.ms.System.c4.c8(var1.z7(), com.aspose.slides.ms.System.c4.u3)
               && com.aspose.slides.ms.System.c4.c8(var1.v4(), com.aspose.slides.ms.System.c4.u3)
            ? (c1)var1.n5().n5(0)
            : var1;
      }
   }

   private c1 n5(f1s var1, boolean var2) {
      if (var1.n5().size() > 0) {
         f1s var3 = new f1s();
         var3.n5(var1.z7().l6());
         var3.l6(var1.v4().l6());
         this.n5(var3, var1, true);

         for (int var4 = 0; var4 < var1.n5().size(); var4++) {
            c1 var5 = this.n5((c1)var1.n5().n5(var4), false);
            if (var5 != c1.n5) {
               f1s var6 = com.aspose.slides.internal.v6g.k5.n5(var5, f1s.class);
               if (com.aspose.slides.ms.System.c4.c8(var5.z7(), com.aspose.slides.ms.System.c4.u3)
                  && com.aspose.slides.ms.System.c4.c8(var5.v4(), com.aspose.slides.ms.System.c4.u3)
                  && var6 != null) {
                  for (int var7 = 0; var7 < var6.n5().size(); var7++) {
                     var3.n5().n5(var6.n5().n5(var7));
                  }
               } else {
                  var3.n5().n5(var5);
               }
            }
         }

         var1 = var3;
      }

      if (var1.n5().size() == 0) {
         return c1.n5;
      } else {
         return !var2
               && var1.n5().size() == 1
               && com.aspose.slides.ms.System.c4.c8(var1.z7(), com.aspose.slides.ms.System.c4.u3)
               && com.aspose.slides.ms.System.c4.c8(var1.v4(), com.aspose.slides.ms.System.c4.u3)
            ? (c1)var1.n5().n5(0)
            : var1;
      }
   }

   private c1 k5(c1 var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.ms.System.c4 var2 = com.aspose.slides.ms.System.c4.u3.l6();
      f1s var3;
      if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, f1s.class)) != null) {
         z4 var4 = var3.n5();
         int var5 = var4.size();
         if (var5 == 1 && com.aspose.slides.ms.System.c4.c8(var3.z7(), var2) && com.aspose.slides.ms.System.c4.c8(var3.v4(), var2)) {
            return (c1)var4.n5(0);
         }
      } else {
         d4 var6;
         if ((var6 = com.aspose.slides.internal.v6g.k5.n5(var1, d4.class)) != null) {
            z4 var8 = var6.n5();
            int var10 = var8.size();
            if (var10 == 1) {
               if (com.aspose.slides.ms.System.c4.c8(var6.z7(), var2) && com.aspose.slides.ms.System.c4.c8(var6.v4(), var2)) {
                  return (c1)var8.n5(0);
               }
            } else if (var10 == 0) {
               return c1.n5;
            }
         } else {
            u0 var7;
            if ((var7 = com.aspose.slides.internal.v6g.k5.n5(var1, u0.class)) != null) {
               z4 var9 = var7.n5();
               int var11 = var9.size();
               if (var11 == 1 && com.aspose.slides.ms.System.c4.c8(var7.z7(), var2) && com.aspose.slides.ms.System.c4.c8(var7.v4(), var2)) {
                  return (c1)var9.n5(0);
               }
            }
         }
      }

      return var1;
   }

   private boolean l6(c1 var1, c1 var2) {
      if (var1 == var2) {
         return true;
      }

      if (var1 == null || var1 == c1.n5) {
         return this.u3(var2);
      }

      if (var2 != null && var2 != c1.n5) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
            v1 var3 = (v1)var1;
            var1 = this.l6(var3);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, v1.class)) {
            v1 var6 = (v1)var2;
            c1 var7 = this.l6(var6);
            if (com.aspose.slides.internal.v6g.k5.l6(var7, d4.class)) {
               return this.l6(var1, var7);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
               return this.n5((v1)var1, var6);
            }

            this.n5 = com.aspose.slides.ms.System.Xml.v3.n5("Only 'element' is valid as derived particle when the base particle is 'element'.");
            return false;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, f7.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
               return this.n5((v1)var1, (f7)var2);
            } else {
               return com.aspose.slides.internal.v6g.k5.l6(var1, f7.class) ? this.n5((f7)var1, (f7)var2) : this.n5((g3)var1, (f7)var2);
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, u0.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
               return this.n5((v1)var1, (g3)var2);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1, u0.class)) {
               if (this.n5((g3)var1, (g3)var2, true)) {
                  return true;
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f1s.class)) {
               if (this.n5((f1s)var1, (u0)var2)) {
                  return true;
               }

               this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
                  "The derived sequence particle at ({0}, {1}) is not a valid restriction of the base all particle at ({2}, {3}) according to Sequence:All -- RecurseUnordered.",
                  com.aspose.slides.ms.System.a3.n5(var1.d5(), com.aspose.slides.internal.x7n.s7.x8()),
                  com.aspose.slides.ms.System.a3.n5(var1.s3(), com.aspose.slides.internal.x7n.s7.x8()),
                  com.aspose.slides.ms.System.a3.n5(var2.d5(), com.aspose.slides.internal.x7n.s7.x8()),
                  com.aspose.slides.ms.System.a3.n5(var2.s3(), com.aspose.slides.internal.x7n.s7.x8())
               );
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1, d4.class) || com.aspose.slides.internal.v6g.k5.l6(var1, f7.class)) {
               this.n5 = com.aspose.slides.ms.System.Xml.v3.n5("'Choice' or 'any' is forbidden as derived particle when the base particle is 'all'.");
            }

            return false;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, d4.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
               return this.n5((v1)var1, (g3)var2);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1, d4.class)) {
               d4 var5 = com.aspose.slides.internal.v6g.k5.n5(var2, d4.class);
               d4 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, d4.class);
               if (var5.f2() == null || var4.f2() == null) {
                  return this.n5(var4, var5);
               }

               if (this.n5(var4, var5, false)) {
                  return true;
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f1s.class)) {
               if (this.n5((f1s)var1, (d4)var2)) {
                  return true;
               }

               this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
                  "The derived sequence particle at ({0}, {1}) is not a valid restriction of the base choice particle at ({2}, {3}) according to Sequence:Choice -- MapAndSum.",
                  com.aspose.slides.ms.System.a3.n5(var1.d5(), com.aspose.slides.internal.x7n.s7.x8()),
                  com.aspose.slides.ms.System.a3.n5(var1.s3(), com.aspose.slides.internal.x7n.s7.x8()),
                  com.aspose.slides.ms.System.a3.n5(var2.d5(), com.aspose.slides.internal.x7n.s7.x8()),
                  com.aspose.slides.ms.System.a3.n5(var2.s3(), com.aspose.slides.internal.x7n.s7.x8())
               );
            } else {
               this.n5 = com.aspose.slides.ms.System.Xml.v3.n5("'All' or 'any' is forbidden as derived particle when the base particle is 'choice'.");
            }

            return false;
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var2, f1s.class)) {
               return false;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
               return this.n5((v1)var1, (g3)var2);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1, f1s.class) || com.aspose.slides.internal.v6g.k5.l6(var1, u0.class) && ((g3)var1).n5().size() == 1) {
               if (this.n5((g3)var1, (g3)var2, true)) {
                  return true;
               }
            } else {
               this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
                  "'All', 'any', and 'choice' are forbidden as derived particles when the base particle is 'sequence'."
               );
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean n5(v1 var1, v1 var2) {
      int var3 = var2.a0().n3() == 255 ? 7 : var2.a0().n3();
      int var4 = var1.a0().n3() == 255 ? 7 : var1.a0().n3();
      if (com.aspose.slides.ms.System.Xml.k6.n5(var1.z8(), var2.z8())
         && (var2.y4() || !var1.y4())
         && this.k5(var1, var2)
         && (var2.s7() == null || this.n5(var2.a0(), var1.a0()))
         && (var4 | var3) == var4
         && var1.j5() != null
         && var2.j5() != null
         && j9e.n5(var1.j5(), var2.j5(), -29)) {
         return true;
      }

      this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
         "Derived element '{0}' is not a valid restriction of base element '{1}' according to Elt:Elt -- NameAndTypeOK.", var1.z8(), var2.z8()
      );
      return false;
   }

   private boolean n5(v1 var1, f7 var2) {
      if (!var2.n5(var1.z8())) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The namespace of element '{0}'is not valid with respect to the wildcard's namespace constraint in the base, Elt:Any -- NSCompat Rule 1.",
            var1.z8().toString()
         );
         return false;
      } else if (!this.k5(var1, var2)) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The occurrence range of element '{0}'is not a valid restriction of the wildcard's occurrence range in the base, Elt:Any -- NSCompat Rule2.",
            var1.z8().toString()
         );
         return false;
      } else {
         return true;
      }
   }

   private boolean n5(f7 var1, f7 var2) {
      if (!this.k5(var1, var2)) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived wildcard's occurrence range is not a valid restriction of the base wildcard's occurrence range, Any:Any -- NSSubset Rule 1."
         );
         return false;
      } else if (!i4.n5(var1.u9(), var2.u9())) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived wildcard's namespace constraint must be an intensional subset of the base wildcard's namespace constraint, Any:Any -- NSSubset Rule2."
         );
         return false;
      } else if (var1.c8() < var2.c8()) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived wildcard's 'processContents' must be identical to or stronger than the base wildcard's 'processContents', where 'strict' is stronger than 'lax' and 'lax' is stronger than 'skip', Any:Any -- NSSubset Rule 3."
         );
         return false;
      } else {
         return true;
      }
   }

   private boolean n5(g3 var1, f7 var2) {
      com.aspose.slides.ms.System.c4 var3 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4 var4 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4[] var5 = new com.aspose.slides.ms.System.c4[]{var3};
      com.aspose.slides.ms.System.c4[] var6 = new com.aspose.slides.ms.System.c4[]{var4};
      this.n5(var1, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      if (!this.n5(var3.l6(), var4.l6(), var2.z7().l6(), var2.v4().l6())) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived particle's occurrence range at ({0}, {1}) is not a valid restriction of the base wildcard's occurrence range at ({2}, {3}), NSRecurseCheckCardinality Rule 2.",
            com.aspose.slides.ms.System.a3.n5(var1.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var1.s3(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.s3(), com.aspose.slides.internal.x7n.s7.x8())
         );
         return false;
      }

      String var7 = var2.b3();
      var2.n5(com.aspose.slides.ms.System.c4.a6.l6());

      for (int var8 = 0; var8 < var1.n5().size(); var8++) {
         if (!this.l6((c1)var1.n5().n5(var8), var2)) {
            this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
               "Every member of the derived group particle must be a valid restriction of the base wildcard, NSRecurseCheckCardinality Rule 1."
            );
            var2.c8(var7);
            return false;
         }
      }

      var2.c8(var7);
      return true;
   }

   private boolean n5(v1 var1, g3 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, f1s.class)) {
         f1s var3 = new f1s();
         var3.n5(com.aspose.slides.internal.v6g.k5.s7(1, 9).l6());
         var3.l6(com.aspose.slides.internal.v6g.k5.s7(1, 9).l6());
         var3.n5().n5(var1);
         if (this.n5(var3, var2, true)) {
            return true;
         }

         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived element {0} at ({1}, {2}) is not a valid restriction of the base sequence particle at ({3}, {4}) according to Elt:All/Choice/Sequence -- RecurseAsIfGroup.",
            var1.z8().toString(),
            com.aspose.slides.ms.System.a3.n5(var1.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var1.s3(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.s3(), com.aspose.slides.internal.x7n.s7.x8())
         );
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, d4.class)) {
         d4 var4 = new d4();
         var4.n5(com.aspose.slides.internal.v6g.k5.s7(1, 9).l6());
         var4.l6(com.aspose.slides.internal.v6g.k5.s7(1, 9).l6());
         var4.n5().n5(var1);
         if (this.n5(var4, var2, false)) {
            return true;
         }

         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived element {0} at ({1}, {2}) is not a valid restriction of the base choice particle at ({3}, {4}) according to Elt:All/Choice/Sequence -- RecurseAsIfGroup.",
            var1.z8().toString(),
            com.aspose.slides.ms.System.a3.n5(var1.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var1.s3(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.s3(), com.aspose.slides.internal.x7n.s7.x8())
         );
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, u0.class)) {
         u0 var5 = new u0();
         var5.n5(com.aspose.slides.internal.v6g.k5.s7(1, 9).l6());
         var5.l6(com.aspose.slides.internal.v6g.k5.s7(1, 9).l6());
         var5.n5().n5(var1);
         if (this.n5(var5, var2, true)) {
            return true;
         }

         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived element {0} at ({1}, {2}) is not a valid restriction of the base all particle at ({3}, {4}) according to Elt:All/Choice/Sequence -- RecurseAsIfGroup.",
            var1.z8().toString(),
            com.aspose.slides.ms.System.a3.n5(var1.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var1.s3(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.d5(), com.aspose.slides.internal.x7n.s7.x8()),
            com.aspose.slides.ms.System.a3.n5(var2.s3(), com.aspose.slides.internal.x7n.s7.x8())
         );
      }

      return false;
   }

   private boolean n5(d4 var1, d4 var2) {
      if (!this.k5(var1, var2)) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived particle's range is not a valid restriction of the base particle's range according to All:All,Sequence:Sequence -- Recurse Rule 1 or Choice:Choice -- RecurseLax."
         );
         return false;
      }

      for (int var3 = 0; var3 < var1.n5().size(); var3++) {
         if (this.n5((c1)var1.n5().n5(var3), var2.n5()) < 0) {
            return false;
         }
      }

      return true;
   }

   private boolean n5(g3 var1, g3 var2, boolean var3) {
      if (!this.k5(var1, var2)) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived particle's range is not a valid restriction of the base particle's range according to All:All,Sequence:Sequence -- Recurse Rule 1 or Choice:Choice -- RecurseLax."
         );
         return false;
      }

      if (var1.n5().size() > var2.n5().size()) {
         this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The derived particle cannot have more members than the base particle - All:All,Sequence:Sequence -- Recurse Rule 2 / Choice:Choice -- RecurseLax."
         );
         return false;
      }

      int var4 = 0;

      for (int var5 = 0; var5 < var2.n5().size(); var5++) {
         c1 var6 = (c1)var2.n5().n5(var5);
         if (var4 < var1.n5().size() && this.l6((c1)var1.n5().n5(var4), var6)) {
            var4++;
         } else if (var3 && !this.u3(var6)) {
            if (this.n5 == null) {
               this.n5 = com.aspose.slides.ms.System.Xml.v3.n5(
                  "All particles in the {particles} of the base particle which are not mapped to by any particle in the {particles} of the derived particle should be emptiable - All:All,Sequence:Sequence -- Recurse Rule 2 / Choice:Choice -- RecurseLax."
               );
            }

            return false;
         }
      }

      return var4 >= var1.n5().size();
   }

   private boolean n5(f1s var1, u0 var2) {
      if (this.k5(var1, var2) && var1.n5().size() <= var2.n5().size()) {
         s7 var3 = new s7(var2.n5().size());

         for (int var4 = 0; var4 < var1.n5().size(); var4++) {
            int var5 = this.n5((c1)var1.n5().n5(var4), var2.n5());
            if (var5 < 0) {
               return false;
            }

            if (var3.n5(var5)) {
               return false;
            }

            var3.l6(var5);
         }

         for (int var6 = 0; var6 < var2.n5().size(); var6++) {
            if (!var3.n5(var6) && !this.u3((c1)var2.n5().n5(var6))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean n5(f1s var1, d4 var2) {
      com.aspose.slides.ms.System.c4 var3 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4 var4 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4.a6(var1.z7(), com.aspose.slides.internal.v6g.k5.s7(var1.n5().size(), 9)).k7(var3);
      if (com.aspose.slides.ms.System.c4.c8(var1.v4(), com.aspose.slides.ms.System.c4.l6)) {
         com.aspose.slides.ms.System.c4.l6.k7(var4);
      } else {
         com.aspose.slides.ms.System.c4.a6(var1.v4(), com.aspose.slides.internal.v6g.k5.s7(var1.n5().size(), 9)).k7(var4);
      }

      if (this.n5(var3.l6(), var4.l6(), var2.z7().l6(), var2.v4().l6()) && var1.n5().size() <= var2.n5().size()) {
         for (int var5 = 0; var5 < var1.n5().size(); var5++) {
            if (this.n5((c1)var1.n5().n5(var5), var2.n5()) < 0) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean k5(c1 var1, c1 var2) {
      return this.n5(var1.z7().l6(), var1.v4().l6(), var2.z7().l6(), var2.v4().l6());
   }

   private boolean n5(
      com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.c4 var2, com.aspose.slides.ms.System.c4 var3, com.aspose.slides.ms.System.c4 var4
   ) {
      return com.aspose.slides.ms.System.c4.n3(var3, var1) && com.aspose.slides.ms.System.c4.n3(var2, var4);
   }

   private int n5(c1 var1, z4 var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         if (this.l6(var1, (c1)var2.n5(var3))) {
            return var3;
         }
      }

      return -1;
   }

   private boolean u3(c1 var1) {
      com.aspose.slides.ms.System.c4 var2 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4 var3 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4[] var4 = new com.aspose.slides.ms.System.c4[]{var2};
      com.aspose.slides.ms.System.c4[] var5 = new com.aspose.slides.ms.System.c4[]{var3};
      this.n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      return com.aspose.slides.ms.System.c4.c8(var2, com.aspose.slides.ms.System.c4.a6);
   }

   private void n5(c1 var1, com.aspose.slides.ms.System.c4[] var2, com.aspose.slides.ms.System.c4[] var3) {
      d4 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, d4.class);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class) || com.aspose.slides.internal.v6g.k5.l6(var1, f7.class)) {
         var1.z7().k7(var2[0]);
         var1.v4().k7(var3[0]);
      } else if (var4 != null) {
         if (var4.n5().size() == 0) {
            com.aspose.slides.ms.System.c4 var5 = com.aspose.slides.ms.System.c4.a6.l6();
            var5.k7(var3[0]);
            var5.k7(var2[0]);
         } else {
            com.aspose.slides.ms.System.c4.l6.k7(var2[0]);
            com.aspose.slides.ms.System.c4.a6.k7(var3[0]);

            for (int var11 = 0; var11 < var4.n5().size(); var11++) {
               com.aspose.slides.ms.System.c4 var6 = new com.aspose.slides.ms.System.c4();
               com.aspose.slides.ms.System.c4 var7 = new com.aspose.slides.ms.System.c4();
               com.aspose.slides.ms.System.c4[] var8 = new com.aspose.slides.ms.System.c4[]{var6};
               com.aspose.slides.ms.System.c4[] var9 = new com.aspose.slides.ms.System.c4[]{var7};
               this.n5((c1)var4.n5().n5(var11), var8, var9);
               var6 = var8[0];
               var7 = var9[0];
               if (com.aspose.slides.ms.System.c4.x8(var6, var2[0])) {
                  var6.k7(var2[0]);
               }

               if (com.aspose.slides.ms.System.c4.t2(var7, var3[0])) {
                  var7.k7(var3[0]);
               }
            }

            com.aspose.slides.ms.System.c4.a6(var2[0], var1.z7()).k7(var2[0]);
            if (com.aspose.slides.ms.System.c4.h0(var3[0], com.aspose.slides.ms.System.c4.l6)) {
               if (com.aspose.slides.ms.System.c4.c8(var1.v4(), com.aspose.slides.ms.System.c4.l6)) {
                  com.aspose.slides.ms.System.c4.l6.k7(var3[0]);
               } else {
                  com.aspose.slides.ms.System.c4.a6(var3[0], var1.v4()).k7(var3[0]);
               }
            }
         }
      } else {
         z4 var12 = ((g3)var1).n5();
         if (var12.size() == 0) {
            com.aspose.slides.ms.System.c4 var14 = com.aspose.slides.ms.System.c4.a6.l6();
            var14.k7(var3[0]);
            var14.k7(var2[0]);
         } else {
            com.aspose.slides.internal.v6g.k5.s7(0, 9).k7(var2[0]);
            com.aspose.slides.internal.v6g.k5.s7(0, 9).k7(var3[0]);

            for (int var15 = 0; var15 < var12.size(); var15++) {
               com.aspose.slides.ms.System.c4 var17 = new com.aspose.slides.ms.System.c4();
               com.aspose.slides.ms.System.c4 var19 = new com.aspose.slides.ms.System.c4();
               com.aspose.slides.ms.System.c4[] var21 = new com.aspose.slides.ms.System.c4[]{var17};
               com.aspose.slides.ms.System.c4[] var10 = new com.aspose.slides.ms.System.c4[]{var19};
               this.n5((c1)var12.n5(var15), var21, var10);
               var17 = var21[0];
               var19 = var10[0];
               com.aspose.slides.ms.System.c4.k5(var2[0], var17).k7(var2[0]);
               if (com.aspose.slides.ms.System.c4.h0(var3[0], com.aspose.slides.ms.System.c4.l6)) {
                  if (com.aspose.slides.ms.System.c4.c8(var19, com.aspose.slides.ms.System.c4.l6)) {
                     com.aspose.slides.ms.System.c4.l6.k7(var3[0]);
                  } else {
                     com.aspose.slides.ms.System.c4.k5(var3[0], var19).k7(var3[0]);
                  }
               }
            }

            com.aspose.slides.ms.System.c4.a6(var2[0], var1.z7()).k7(var2[0]);
            if (com.aspose.slides.ms.System.c4.h0(var3[0], com.aspose.slides.ms.System.c4.l6)) {
               if (com.aspose.slides.ms.System.c4.c8(var1.v4(), com.aspose.slides.ms.System.c4.l6)) {
                  com.aspose.slides.ms.System.c4.l6.k7(var3[0]);
               } else {
                  com.aspose.slides.ms.System.c4.a6(var3[0], var1.v4()).k7(var3[0]);
               }
            }
         }
      }
   }

   private void u3(l9 var1) {
      this.s7.push(var1);
   }

   private int n5(l9 var1, p0 var2, c1 var3) {
      if ((var2 == null || !var2.n5()) && (var2 != null || !var1.s7())) {
         return var3 != null && !var3.l6() ? 2 : 1;
      } else {
         return 3;
      }
   }

   private void l6(j7 var1) {
      if (var1.e5()) {
         this.n5("Circular attribute group reference.", var1);
      } else if (var1.c8().l6() <= 0) {
         var1.u9(true);
         k9 var2 = var1.u9();

         try {
            for (int var3 = 0; var3 < var1.l6().size(); var3++) {
               l2 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(var3), l2.class);
               if (var4 != null) {
                  if (var4.x8() != 2) {
                     this.l6(var4);
                     if (var1.c8().k5(var4.n3()) == null) {
                        var1.c8().n5(var4.n3(), var4);
                     } else {
                        this.n5("The attribute '{0}' already exists.", var4.n3().toString(), var4);
                     }
                  }
               } else {
                  k0 var5 = (k0)var1.l6().n5(var3);
                  j7 var6;
                  if (var1.s7() != null && com.aspose.slides.ms.System.Xml.k6.n5(var5.n5(), var1.s7().h0())) {
                     var6 = var1.s7();
                  } else {
                     var6 = (j7)this.k5.k5(var5.n5());
                  }

                  if (var6 != null) {
                     this.l6(var6);
                     IEnumerator var7 = var6.c8().k5().iterator();

                     try {
                        while (var7.hasNext()) {
                           l2 var8 = (l2)var7.next();
                           if (var1.c8().k5(var8.n3()) == null) {
                              var1.c8().n5(var8.n3(), var8);
                           } else {
                              this.n5("The attribute '{0}' already exists.", var8.n3().toString(), var8);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                           ((IDisposable)var7).dispose();
                        }
                     }

                     var2 = this.l6(var2, var6.t2());
                  } else {
                     this.n5("Reference to undeclared attribute group '{0}'.", var5.n5().toString(), var5);
                  }
               }
            }

            var1.l6(var2);
         } finally {
            var1.u9(false);
         }
      }
   }

   private void n5(l9 var1, l9 var2, z4 var3, k9 var4, int var5) {
      k9 var6 = var1 != null ? var1.k7() : null;

      for (int var7 = 0; var7 < var3.size(); var7++) {
         l2 var8 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(var7), l2.class);
         if (var8 != null) {
            if (var8.x8() != 2) {
               this.l6(var8);
            }

            if (var8.x8() != 2 || var8.x8() == 2 && var5 == 4 && var1 != l9.n5()) {
               if (var2.m1().k5(var8.n3()) == null) {
                  var2.m1().n5(var8.n3(), var8);
               } else {
                  this.n5("The attribute '{0}' already exists.", var8.n3().toString(), var8);
               }
            } else {
               this.n5(
                  "The '{0}' attribute is ignored, because the value of 'prohibited' for attribute use only prevents inheritance of an identically named attribute from the base type definition.",
                  var8.n3().toString(),
                  var8,
                  1
               );
            }
         } else {
            k0 var9 = (k0)var3.n5(var7);
            j7 var10 = (j7)this.k5.k5(var9.n5());
            if (var10 == null) {
               this.n5("Reference to undeclared attribute group '{0}'.", var9.n5().toString(), var9);
            } else {
               this.l6(var10);
               IEnumerator var11 = var10.c8().k5().iterator();

               try {
                  while (var11.hasNext()) {
                     l2 var12 = (l2)var11.next();
                     if (var12.x8() != 2 || var12.x8() == 2 && var5 == 4 && var1 != l9.n5()) {
                        if (var2.m1().k5(var12.n3()) == null) {
                           var2.m1().n5(var12.n3(), var12);
                        } else {
                           this.n5("The attribute '{0}' already exists.", var12.n3().toString(), var9);
                        }
                     } else {
                        this.n5(
                           "The '{0}' attribute is ignored, because the value of 'prohibited' for attribute use only prevents inheritance of an identically named attribute from the base type definition.",
                           var12.n3().toString(),
                           var12,
                           1
                        );
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                     ((IDisposable)var11).dispose();
                  }
               }

               var4 = this.l6(var4, var10.t2());
            }
         }
      }

      if (var1 != null) {
         if (var5 == 2) {
            var2.l6(this.n5(var4, var6));
            IEnumerator var37 = var1.m1().k5().iterator();

            try {
               while (var37.hasNext()) {
                  l2 var39 = (l2)var37.next();
                  l2 var42 = (l2)var2.m1().k5(var39.n3());
                  if (var42 == null) {
                     var2.m1().n5(var39.n3(), var39);
                  } else if (var39.x8() != 2 && var42.y4() != var39.y4()) {
                     this.n5("Invalid attribute extension.", var42);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                  ((IDisposable)var37).dispose();
               }
            }
         } else {
            if (var4 == null || var6 != null && k9.n5(var4, var6) && this.n5(var1, var4, var6)) {
               var2.l6(var4);
            } else {
               this.n5("The base any attribute must be a superset of the derived 'anyAttribute'.", var2);
            }

            IEnumerator var38 = var1.m1().k5().iterator();

            try {
               while (var38.hasNext()) {
                  l2 var40 = (l2)var38.next();
                  l2 var43 = (l2)var2.m1().k5(var40.n3());
                  if (var43 == null) {
                     var2.m1().n5(var40.n3(), var40);
                  } else if (var40.x8() == 2 && var43.x8() != 2) {
                     this.n5("Invalid attribute restriction. Attribute restriction is prohibited in base type.", var43);
                  } else if (var40.x8() == 3 && var43.x8() != 3) {
                     this.n5("Derived attribute's use has to be required if base attribute's use is required.", var43);
                  } else if (var43.x8() != 2) {
                     if (var40.y4() == null || var43.y4() == null || !j9e.n5(var43.y4(), var40.y4(), 0)) {
                        this.n5("Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.", var43);
                     } else if (!this.n5(var40.t9(), var43.t9())) {
                        this.n5("Invalid attribute restriction. Derived attribute's fixed value must be the same as the base attribute's fixed value.", var43);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var38, IDisposable.class)) {
                  ((IDisposable)var38).dispose();
               }
            }

            IEnumerator var41 = var2.m1().k5().iterator();

            try {
               while (var41.hasNext()) {
                  l2 var44 = (l2)var41.next();
                  l2 var45 = (l2)var1.m1().k5(var44.n3());
                  if (var45 == null && (var6 == null || !var6.n5(var44.n3()))) {
                     this.n5(
                        "The {base type definition} must have an {attribute wildcard} and the {target namespace} of the R's {attribute declaration} must be valid with respect to that wildcard.",
                        var44
                     );
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
                  ((IDisposable)var41).dispose();
               }
            }
         }
      } else {
         var2.l6(var4);
      }
   }

   private void l6(j7 var1, j7 var2) {
      k9 var3 = var1.t2();
      k9 var4 = var2.t2();
      if (var4 != null && (var3 == null || !k9.n5(var4, var3) || !this.n5(null, var4, var3))) {
         this.n5("The base any attribute must be a superset of the derived 'anyAttribute'.", var2);
      }

      IEnumerator var5 = var1.c8().k5().iterator();

      try {
         while (var5.hasNext()) {
            l2 var6 = (l2)var5.next();
            l2 var7 = (l2)var2.c8().k5(var6.n3());
            if (var7 != null) {
               if (var6.x8() == 2 && var7.x8() != 2) {
                  this.n5("Invalid attribute restriction. Attribute restriction is prohibited in base type.", var7);
               } else if (var6.x8() == 3 && var7.x8() != 3) {
                  this.n5("Derived attribute's use has to be required if base attribute's use is required.", var7);
               } else if (var7.x8() != 2) {
                  if (var6.y4() == null || var7.y4() == null || !j9e.n5(var7.y4(), var6.y4(), 0)) {
                     this.n5("Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.", var7);
                  } else if (!this.n5(var6.t9(), var7.t9())) {
                     this.n5("Invalid attribute restriction. Derived attribute's fixed value must be the same as the base attribute's fixed value.", var7);
                  }
               }
            } else if (var6.x8() == 3) {
               this.n5(
                  "The base attribute '{0}' whose use = 'required' does not have a corresponding derived attribute while redefining attribute group '{1}'.",
                  var6.n3().toString(),
                  var1.h0().toString(),
                  var2
               );
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      IEnumerator var16 = var2.c8().k5().iterator();

      try {
         while (var16.hasNext()) {
            l2 var17 = (l2)var16.next();
            l2 var8 = (l2)var1.c8().k5(var17.n3());
            if (var8 == null && (var3 == null || !var3.n5(var17.n3()))) {
               this.n5(
                  "The {base type definition} must have an {attribute wildcard} and the {target namespace} of the R's {attribute declaration} must be valid with respect to that wildcard.",
                  var17
               );
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            ((IDisposable)var16).dispose();
         }
      }
   }

   private boolean n5(l9 var1, k9 var2, k9 var3) {
      return var1 == l9.n5() ? true : var2.u9() >= var3.u9();
   }

   private k9 n5(k9 var1, k9 var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      k9 var3 = k9.l6(var1, var2, false);
      if (var3 == null) {
         this.n5("The 'anyAttribute' is not expressible.", var1);
      }

      return var3;
   }

   private k9 l6(k9 var1, k9 var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      k9 var3 = k9.n5(var1, var2, false);
      if (var3 == null) {
         this.n5("The 'anyAttribute' is not expressible.", var1);
      }

      return var3;
   }

   private void l6(l2 var1) {
      if (var1.e5()) {
         this.n5("Circular attribute reference.", var1);
      } else if (var1.t9() == null) {
         var1.u9(true);
         h9 var2 = null;

         try {
            if (var1.c8().k5()) {
               var2 = new h9(var1.n3());
               if (var1.s7() != null) {
                  this.l6(var1.s7());
                  var1.l6(var1.s7());
                  var2.n5(var1.s7());
                  var2.n5(var1.s7().b3());
               } else if (!var1.t2().k5()) {
                  u1s var12 = this.n5(var1.t2());
                  if (var12 == null) {
                     throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", var1.t2().toString(), var1);
                  }

                  var1.l6(var12);
                  var2.n5(var12.b3());
                  var2.n5(var12);
               } else {
                  var2.n5(t4.n5());
                  var2.n5(t4.n5().b3());
                  var1.l6(t4.n5());
               }

               if (var2.a0() != null) {
                  var2.a0().n5(this.h0, var1);
               }

               this.n5(var1, var2);
            } else {
               l2 var3 = (l2)this.l6.k5(var1.c8());
               if (var3 == null) {
                  throw new XmlSchemaException("The '{0}' attribute is not declared.", var1.c8().toString(), var1);
               }

               this.l6(var3);
               if (var3.t9() == null) {
                  throw new XmlSchemaException("Reference to invalid attribute '{0}'.", var1.c8().toString(), var1);
               }

               var2 = var3.t9().k7();
               v5 var4 = var2.a0();
               if (var4 != null) {
                  if (var3.l6() == null && var3.n5() == null) {
                     this.n5(var1, var2);
                  } else if (var3.l6() != null) {
                     if (var1.n5() != null) {
                        throw new XmlSchemaException(
                           "The default value constraint cannot be present on the '{0}' attribute reference if the fixed value constraint is present on the declaration.",
                           var1.c8().toString(),
                           var1
                        );
                     }

                     if (var1.l6() != null) {
                        Object var5 = var4.n5(var1.l6(), this.n5(), new e0(var1), true);
                        if (!var4.n5(var2.s3(), var5)) {
                           throw new XmlSchemaException(
                              "The fixed value constraint on the '{0}' attribute reference must match the fixed value constraint on the declaration.",
                              var1.c8().toString(),
                              var1
                           );
                        }
                     }
                  }
               }

               var1.l6(var3.y4());
            }

            var2.n5(var1);
            var1.n5(var2);
         } catch (XmlSchemaException var9) {
            if (var9.getSourceSchemaObject() == null) {
               var9.setSource(var1);
            }

            this.n5(var9);
            var1.n5(h9.n5);
         } finally {
            var1.u9(false);
         }
      }
   }

   private void n5(l2 var1, h9 var2) {
      if (var1.n5() == null && var1.l6() == null) {
         switch (var1.x8()) {
            case 0:
            case 1:
               var2.h0(2);
            case 2:
            default:
               break;
            case 3:
               var2.h0(1);
         }
      } else {
         if (var1.n5() != null) {
            var2.h0(0);
            String var3 = var1.n5();
            var2.n5(var3);
            var2.u3(var3);
         } else {
            if (var1.x8() == 3) {
               var2.h0(4);
            } else {
               var2.h0(3);
            }

            String var4 = var1.l6();
            var2.n5(var4);
            var2.u3(var4);
         }

         if (var2.a0() != null) {
            if (var2.a0().n3() == 37) {
               this.n5("An attribute or element of type xs:ID or derived from xs:ID, should not have a value constraint.", var1);
            } else {
               var2.n5(var2.a0().n5(var2.d5(), this.n5(), new e0(var1), true));
            }
         }
      }
   }

   private void n5(m2 var1) {
      if (var1.e5()) {
         var1.n5(com.aspose.slides.internal.b8c.y4.k5);
         this.n5("Circular identity constraint reference.", var1);
      } else if (var1.c8() == null) {
         var1.u9(true);
         y4 var2 = null;

         try {
            e0 var3 = new e0(var1);
            var2 = new y4(var1, var3);
            if (com.aspose.slides.internal.v6g.k5.l6(var1, g5.class)) {
               m2 var4 = (m2)this.t2.k5(((g5)var1).t2());
               if (var4 == null) {
                  throw new XmlSchemaException("The '{0}' identity constraint is not declared.", ((g5)var1).t2().toString(), var1);
               }

               this.n5(var4);
               if (var4.c8() == null) {
                  throw new XmlSchemaException("Reference to an invalid identity constraint, '{0}'.", ((g5)var1).t2().toString(), var1);
               }

               if (var4.u9().size() != var1.u9().size()) {
                  throw new XmlSchemaException("Keyref '{0}' has different cardinality as the referred key or unique element.", var1.h0().toString(), var1);
               }

               if (var4.c8().n5() == 2) {
                  throw new XmlSchemaException("The '{0}' Keyref can refer to key or unique only.", var1.h0().toString(), var1);
               }
            }

            var1.n5(var2);
         } catch (XmlSchemaException var8) {
            if (var8.getSourceSchemaObject() == null) {
               var8.setSource(var1);
            }

            this.n5(var8);
            var1.n5(com.aspose.slides.internal.b8c.y4.k5);
         } finally {
            var1.u9(false);
         }
      }
   }

   private void k5(v1 var1) {
      if (var1.e5()) {
         this.n5("Circular element reference.", var1);
      } else if (var1.a0() == null) {
         var1.u9(true);
         t6 var2 = null;

         try {
            try {
               if (!var1.q0().k5()) {
                  v1 var3 = (v1)this.u3.k5(var1.q0());
                  if (var3 == null) {
                     throw new XmlSchemaException("The '{0}' element is not declared.", var1.q0().toString(), var1);
                  }

                  this.k5(var3);
                  if (var3.a0() == null) {
                     throw new XmlSchemaException("Reference to invalid element '{0}'.", var1.q0().toString(), var1);
                  }

                  var1.l6(var3.j5());
                  var2 = var3.a0().t2();
               } else {
                  if (var1.k7() != null) {
                     var1.l6(var1.k7());
                  } else if (!var1.m1().k5()) {
                     var1.l6(this.k5(var1.m1()));
                     if (var1.j5() == null) {
                        throw new XmlSchemaException("Type '{0}' is not declared.", var1.m1().toString(), var1);
                     }
                  } else if (!var1.z3().k5()) {
                     v1 var13 = (v1)this.u3.k5(var1.z3());
                     if (var13 == null) {
                        throw new XmlSchemaException("Substitution group refers to '{0}', an undeclared element.", var1.z3().l6(), var1);
                     }

                     if (var13.e5()) {
                        return;
                     }

                     this.k5(var13);
                     if (var13.a0() == null) {
                        var1.l6(l9.n5());
                        var2 = l9.n5().u6().t2();
                     } else {
                        var1.l6(var13.j5());
                        var2 = var13.a0().t2();
                     }
                  } else {
                     var1.l6(l9.n5());
                     var2 = l9.n5().u6().t2();
                  }

                  if (var2 == null) {
                     if (com.aspose.slides.internal.v6g.k5.l6(var1.j5(), l9.class)) {
                        l9 var14 = (l9)var1.j5();
                        this.l6(var14);
                        if (var14.u6() != null) {
                           var2 = var14.u6().t2();
                        }
                     } else if (com.aspose.slides.internal.v6g.k5.l6(var1.j5(), u1s.class)) {
                        u1s var15 = (u1s)var1.j5();
                        this.l6(var15);
                        if (var15.u6() != null) {
                           var2 = var15.u6().t2();
                        }
                     }
                  }

                  var2.n5(var1.z8());
                  var2.u3(var1.n5());
                  l9 var16 = com.aspose.slides.internal.v6g.k5.n5(var1.j5(), l9.class);
                  if (var16 != null) {
                     var2.u3(var2.s7() | var16.c8());
                  }

                  var2.a6(var1.y4());
                  var2.n5(var2.n3() | var1.w1());
               }

               if (var2.a0() != null) {
                  var2.a0().n5(this.h0, var1);
               }

               if ((var1.h0() != null || var1.s7() != null) && var2.z1() != null) {
                  if (var2.z1().l6() != 0 && (var2.z1().l6() != 3 || !var2.z1().n5())) {
                     throw new XmlSchemaException("Element's type does not allow fixed or default value constraint.", var1);
                  }

                  if (var1.h0() != null) {
                     var2.h0(0);
                     var2.u3(var1.h0());
                  } else {
                     var2.h0(3);
                     var2.u3(var1.s7());
                  }

                  if (var2.a0() != null) {
                     if (var2.a0().n3() == 37) {
                        this.n5("An attribute or element of type xs:ID or derived from xs:ID, should not have a value constraint.", var1);
                     } else {
                        var2.n5(var2.a0().n5(var2.d5(), this.n5(), new e0(var1), true));
                     }
                  } else {
                     var2.n5(t4.n5().b3().n5(var2.d5(), this.n5(), new e0(var1)));
                  }
               }

               if (var1.c4()) {
                  z4 var17 = var1.m3();
                  y4[] var4 = new y4[var17.size()];
                  int var5 = 0;

                  for (int var6 = 0; var6 < var17.size(); var6++) {
                     m2 var7 = (m2)var17.n5(var6);
                     this.n5(var7);
                     var4[var5++] = var7.c8();
                  }

                  var2.n5(var4);
               }

               var2.n5(var1);
               var1.n5(var2);
            } catch (XmlSchemaException var11) {
               if (var11.getSourceSchemaObject() == null) {
                  var11.setSource(var1);
               }

               this.n5(var11);
               var1.n5(t6.n5);
            }
         } finally {
            var1.u9(false);
         }
      }
   }

   private z1 a6(l9 var1) {
      if (var1.t9() == 1) {
         return z1.n5;
      }

      if (var1.t9() == 0) {
         return z1.l6;
      }

      c1 var2 = var1.q0();
      if (var2 != null && var2 != c1.n5) {
         this.u3(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var2, u0.class)) {
            u0 var9 = (u0)var2;
            l6 var4 = new l6(var1.t9(), var9.n5().size(), com.aspose.slides.ms.System.c4.c8(var9.z7(), com.aspose.slides.ms.System.c4.a6));

            for (int var5 = 0; var5 < var9.n5().size(); var5++) {
               v1 var6 = (v1)var9.n5().n5(var5);
               if (!var4.n5(var6.z8(), var6, com.aspose.slides.ms.System.c4.c8(var6.z7(), com.aspose.slides.ms.System.c4.a6))) {
                  this.n5("The '{0}' element already exists in the content model.", var6.z8().toString(), var6);
               }
            }

            return var4;
         } else {
            l5 var3 = new l5(var1.t9(), this.u3().n5());

            try {
               var3.a6();
               var1.k5(this.n5(var3, var2));
               return var3.l6(true);
            } catch (UpaException var7) {
               if (com.aspose.slides.internal.v6g.k5.l6(var7.getParticle1(), v1.class)) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var7.getParticle2(), v1.class)) {
                     this.n5(
                        "Multiple definition of element '{0}' causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.",
                        ((v1)var7.getParticle1()).z8().toString(),
                        (v1)var7.getParticle2()
                     );
                  } else {
                     this.n5(
                        "Wildcard '{0}' allows element '{1}', and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.",
                        ((f7)var7.getParticle2()).h0(),
                        ((v1)var7.getParticle1()).z8().toString(),
                        (f7)var7.getParticle2()
                     );
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var7.getParticle2(), v1.class)) {
                  this.n5(
                     "Wildcard '{0}' allows element '{1}', and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.",
                     ((f7)var7.getParticle1()).h0(),
                     ((v1)var7.getParticle2()).z8().toString(),
                     (v1)var7.getParticle2()
                  );
               } else {
                  this.n5(
                     "Wildcards '{0}' and '{1}' have not empty intersection, and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.",
                     ((f7)var7.getParticle1()).h0(),
                     ((f7)var7.getParticle2()).h0(),
                     (f7)var7.getParticle2()
                  );
               }

               return l9.h0();
            } catch (UnsupportedOperationException var8) {
               this.n5(
                  "Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately.",
                  var1,
                  1
               );
               return l9.h0();
            }
         }
      } else {
         return var1.t9() == 2 ? z1.n5 : z1.k5;
      }
   }

   private boolean n5(l5 var1, c1 var2) {
      boolean var3 = false;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, v1.class)) {
         v1 var4 = (v1)var2;
         var1.n5(var4.z8(), var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, f7.class)) {
         var3 = true;
         f7 var8 = (f7)var2;
         var1.n5(var8.u9(), var8);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, g3.class)) {
         z4 var9 = ((g3)var2).n5();
         boolean var5 = com.aspose.slides.internal.v6g.k5.l6(var2, d4.class);
         var1.u9();
         boolean var6 = true;

         for (int var7 = 0; var7 < var9.size(); var7++) {
            if (var6) {
               var6 = false;
            } else if (var5) {
               var1.c8();
            } else {
               var1.t2();
            }

            var3 = this.n5(var1, (c1)var9.n5(var7));
         }

         var1.h0();
      }

      if (!com.aspose.slides.ms.System.c4.c8(var2.z7(), com.aspose.slides.ms.System.c4.u3)
         || !com.aspose.slides.ms.System.c4.c8(var2.v4(), com.aspose.slides.ms.System.c4.u3)) {
         if (com.aspose.slides.ms.System.c4.c8(var2.z7(), com.aspose.slides.ms.System.c4.a6)
            && com.aspose.slides.ms.System.c4.c8(var2.v4(), com.aspose.slides.ms.System.c4.u3)) {
            var1.n3();
         } else if (com.aspose.slides.ms.System.c4.c8(var2.z7(), com.aspose.slides.ms.System.c4.a6)
            && com.aspose.slides.ms.System.c4.c8(var2.v4(), com.aspose.slides.ms.System.c4.l6)) {
            var1.s7();
         } else if (com.aspose.slides.ms.System.c4.c8(var2.z7(), com.aspose.slides.ms.System.c4.u3)
            && com.aspose.slides.ms.System.c4.c8(var2.v4(), com.aspose.slides.ms.System.c4.l6)) {
            var1.x8();
         } else {
            var1.n5(var2.z7().l6(), var2.v4().l6());
         }
      }

      return var3;
   }

   private void n5(l9 var1, c1 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, v1.class)) {
         v1 var3 = (v1)var2;
         this.k5(var3);
         if (var1.m3().k5(var3.z8()) == null) {
            var1.m3().n5(var3.z8(), var3);
         } else {
            v1 var4 = (v1)var1.m3().k5(var3.z8());
            if (var4.j5() != var3.j5()) {
               this.n5("Elements with the same name and in the same scope must have the same type.", var2);
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, g3.class)) {
         z4 var5 = ((g3)var2).n5();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.n5(var1, (c1)var5.n5(var6));
         }
      }
   }

   private void a6(c1 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)) {
         v1 var2 = (v1)var1;
         this.k5(var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, g3.class)) {
         z4 var4 = ((g3)var1).n5();

         for (int var3 = 0; var3 < var4.size(); var3++) {
            this.a6((c1)var4.n5(var3));
         }
      }
   }

   private void u9(l9 var1) {
      if (var1.e5()) {
         this.n5("Circular type reference.", var1);
      } else {
         var1.u9(true);

         try {
            if (var1.q0() != c1.n5) {
               this.n5(var1, var1.q0());
            }
         } finally {
            var1.u9(false);
         }
      }
   }

   private u1s n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      u1s var2 = com.aspose.slides.internal.v6g.k5.n5(this.a6.k5(var1), u1s.class);
      if (var2 != null) {
         this.l6(var2);
      } else {
         var2 = t4.n5(var1);
      }

      return var2;
   }

   private l9 l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      l9 var2 = com.aspose.slides.internal.v6g.k5.n5(this.a6.k5(var1), l9.class);
      if (var2 != null) {
         this.l6(var2);
      }

      return var2;
   }

   private j9e k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      j9e var2 = (j9e)this.a6.k5(var1);
      if (var2 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, l9.class)) {
            this.l6((l9)var2);
         } else {
            this.l6((u1s)var2);
         }

         return var2;
      } else {
         return t4.n5(var1);
      }
   }

   private void n5(d8 var1, d8 var2, boolean var3) {
      var1.h0(var2.p8());
      var1.h0(var2.s3());
      var1.u9(var2.d5());
      var1.n5(var2.a6());
      if (var3) {
         var1.n5(var2.f2());
      }
   }

   private boolean n5(h1 var1, h1 var2) {
      if (var1.r4() == 3 || var1.r4() == 4) {
         Object var3 = var1.s3();
         Object var4 = var2.s3();
         if (var2.r4() != 3 && var2.r4() != 4) {
            return false;
         }

         v5 var5 = var1.a0();
         v5 var6 = var2.a0();
         if (var5.x8() == 2) {
            if (var6.x8() == 2) {
               if (!var6.n5(var3, var4)) {
                  return false;
               }
            } else {
               e4j var7 = com.aspose.slides.internal.v6g.k5.n5(var1.s3(), e4j.class);
               v5 var8 = var7.n5().b3();
               if (!var8.l6(var6) || !var6.n5(var7.l6(), var4)) {
                  return false;
               }
            }
         } else if (!var6.n5(var3, var4)) {
            return false;
         }
      }

      return true;
   }
}
