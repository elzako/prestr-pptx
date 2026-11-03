package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.concurrent.atomic.AtomicReference;

public class k0t {
   private com.aspose.slides.ms.System.Xml.z9 u9;
   private o2 h0;
   private SortedList c8;
   private b4 t2;
   private b4 s7;
   private boolean x8 = false;
   private Hashtable n3;
   private Hashtable y4;
   private Hashtable e2;
   private boolean t9;
   private x0 z1;
   private com.aspose.slides.ms.System.Xml.w4 t4;
   private a9 q0;
   private x2 z3;
   public d0 n5;
   public d0 l6;
   public d0 k5;
   public d0 u3;
   private d0 m1;
   private AtomicReference<Object> k7 = new AtomicReference<>();
   private b4 m3;
   public final com.aspose.slides.internal.v6g.n5<b4> a6 = new p5k(this);

   public final Object n5() {
      if (this.k7.get() == null) {
         Object var1 = new Object();
         this.k7.set(var1);
      }

      return this.k7.get();
   }

   public k0t() {
      this(new com.aspose.slides.ms.System.Xml.j9());
   }

   public k0t(com.aspose.slides.ms.System.Xml.z9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("nameTable");
      }

      this.u9 = var1;
      this.c8 = new SortedList();
      this.n3 = new Hashtable();
      this.y4 = new Hashtable();
      this.e2 = new Hashtable();
      this.t2 = new e6r(this);
      this.s7 = this.t2;
      this.t4 = new com.aspose.slides.ms.System.Xml.w4();
      if (this.t4.k5() == null) {
         this.t4.n5(new com.aspose.slides.ms.System.Xml.k1());
         this.t4.n5(false);
      }

      this.t4.n5(var1);
      this.t4.u3(0);
      this.z3 = new x2();
      this.z1 = new x0();
      this.t9 = true;
   }

   public final boolean l6() {
      return this.x8;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.t4.n5(var1);
   }

   public final x2 k5() {
      return this.z3;
   }

   public final void n5(x2 var1) {
      this.z3 = var1;
   }

   public final int u3() {
      return this.c8.size();
   }

   public final d0 a6() {
      if (this.n5 == null) {
         this.n5 = new d0();
      }

      return this.n5;
   }

   public final d0 u9() {
      if (this.l6 == null) {
         this.l6 = new d0();
      }

      return this.l6;
   }

   public final d0 h0() {
      if (this.k5 == null) {
         this.k5 = new d0();
      }

      return this.k5;
   }

   public final d0 c8() {
      if (this.u3 == null) {
         this.u3 = new d0();
      }

      return this.u3;
   }

   public final Hashtable t2() {
      return this.n3;
   }

   public final d0 s7() {
      if (this.m1 == null) {
         this.m1 = new d0();
      }

      return this.m1;
   }

   public final void n5(k0t var1) {
      if (var1 == null) {
         throw new ArgumentNullException("schemas");
      }

      if (this != var1) {
         synchronized (this.n5()) {
            synchronized (var1.n5()) {
               if (var1.l6()) {
                  this.l6(var1);
               } else {
                  boolean var4 = false;
                  String var5 = null;
                  IEnumerator var6 = var1.z1().getValues().iterator();

                  try {
                     while (var6.hasNext()) {
                        a9 var7 = (a9)var6.next();
                        var5 = var7.a6();
                        if (var5 == null) {
                           var5 = com.aspose.slides.ms.System.d1.n5;
                        }

                        if (!this.c8.containsKey(var7.k7()) && this.n5(var7.m1(), var5, (DictionaryEntry[])null) == null) {
                           a9 var8 = this.n5(var7.a6(), var7);
                           if (var8 == null) {
                              var4 = true;
                              break;
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        ((IDisposable)var6).dispose();
                     }
                  }

                  if (var4) {
                     IEnumerator var26 = var1.z1().getValues().iterator();

                     try {
                        while (var26.hasNext()) {
                           a9 var9 = (a9)var26.next();
                           this.c8.removeItem(var9.k7());
                           this.n3.removeItem(var9.m1());
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
                           ((IDisposable)var26).dispose();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final a9 n5(a9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Schema");
      }

      synchronized (this.n5()) {
         return this.c8.containsKey(var1.k7()) ? var1 : this.n5(var1.a6(), var1);
      }
   }

   public final boolean l6(a9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("schemaToRemove");
      }

      if (!this.c8.containsKey(var1.k7())) {
         return false;
      }

      synchronized (this.n5()) {
         if (!this.c8.containsKey(var1.k7())) {
            return false;
         }

         Hashtable var3 = new Hashtable();
         var3.addItem(this.k5(var1), var1);

         for (int var4 = 0; var4 < var1.a0().size(); var4++) {
            String var5 = (String)var1.a0().get_Item(var4);
            if (var3.get_Item(var5) == null) {
               var3.addItem(var5, var5);
            }
         }

         ArrayList var17 = new ArrayList();

         for (int var6 = 0; var6 < this.c8.size(); var6++) {
            a9 var7 = (a9)this.c8.getByIndex(var6);
            if (var7 != var1 && !var1.y1().contains(var7)) {
               var17.addItem(var7);
            }
         }

         a9 var20 = null;

         for (int var18 = 0; var18 < var17.size(); var18++) {
            var20 = (a9)var17.get_Item(var18);
            if (var20.a0().size() > 0) {
               IEnumerator var8 = var3.getKeys().iterator();

               try {
                  while (var8.hasNext()) {
                     String var9 = (String)var8.next();
                     if (var20.a0().contains(var9)) {
                        this.n5(
                           new XmlSchemaException(
                              "The Schema could not be removed because other schemas in the set have dependencies on this Schema or its imports.",
                              com.aspose.slides.ms.System.d1.n5
                           ),
                           1
                        );
                        return false;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     ((IDisposable)var8).dispose();
                  }
               }
            }
         }

         this.n5(var1, true);

         for (int var19 = 0; var19 < var1.y1().size(); var19++) {
            a9 var22 = (a9)var1.y1().get_Item(var19);
            this.n5(var22, true);
         }

         return true;
      }
   }

   public final void x8() {
      if (!this.x8) {
         if (this.c8.size() == 0) {
            this.t4();
            this.z1 = new x0();
            this.x8 = true;
            this.t9 = false;
         } else {
            synchronized (this.n5()) {
               if (!this.x8) {
                  e2 var2 = new e2(this.u9, this.s7, this.q0, this.z3);
                  x0 var3 = new x0();
                  int var4 = 0;
                  if (!this.t9) {
                     var2.n5(this);
                  }

                  try {
                     a9 var5 = t5.h0();

                     for (var4 = 0; var4 < this.c8.size(); var4++) {
                        a9 var6 = (a9)this.c8.getByIndex(var4);
                        com.aspose.slides.internal.r5t.u3.n5(var6);
                        if (!var6.s7()) {
                           this.n5(
                              new XmlSchemaException(
                                 "All schemas in the set should be successfully preprocessed prior to compilation.", com.aspose.slides.ms.System.d1.n5
                              ),
                              0
                           );
                           this.x8 = false;
                           return;
                        }

                        if (var6.t2()) {
                           if (!this.t9) {
                              continue;
                           }

                           if (var6 == var5) {
                              var2.n5(var6, false);
                              continue;
                           }
                        }

                        var2.n5(var6, true);
                     }

                     this.x8 = var2.n5(this, var3);
                     if (this.x8) {
                        if (!this.t9) {
                           var3.n5(this.z1, this.s7);
                        }

                        this.t9 = false;
                        this.z1 = var3;
                     }
                  } finally {
                     if (var4 == this.c8.size()) {
                        var4--;
                     }

                     int var10 = var4;

                     while (true) {
                        if (var10 < 0) {
                           ;
                        } else {
                           a9 var11 = (a9)this.c8.getByIndex(var10);
                           if (var11 == t5.h0()) {
                              com.aspose.slides.internal.r5t.u3.l6(var11);
                           } else {
                              var11.n5(this.x8);
                              com.aspose.slides.internal.r5t.u3.l6(var11);
                           }

                           var10--;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final ICollection n5(String var1) {
      ArrayList var2 = new ArrayList();
      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      for (int var3 = 0; var3 < this.c8.size(); var3++) {
         a9 var4 = (a9)this.c8.getByIndex(var3);
         if (com.aspose.slides.ms.System.d1.a6(this.k5(var4), var1)) {
            var2.addItem(var4);
         }
      }

      return var2;
   }

   private a9 n5(String var1, a9 var2) {
      if (var2 != null && var2.w1() == 0) {
         a9[] var3 = new a9[]{var2};
         boolean var4 = this.n5(var3, var1);
         var2 = var3[0];
         if (var4) {
            this.u3(var2);
            this.x8 = false;
            return var2;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public final void n5(String var1, com.aspose.slides.ms.System.Xml.c7 var2, Hashtable var3) {
      if (var2 == null) {
         throw new ArgumentNullException("reader");
      }

      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      if (var3.get_Item(var1) != null) {
         if (this.n5(new com.aspose.slides.ms.System.r8(var2.q0(), 0), var1, (DictionaryEntry[])null) == null) {
            throw new XmlSchemaException(
               "An element or attribute information item has already been validated from the '{0}' namespace. It is an error if 'xsi:schemaLocation', 'xsi:noNamespaceSchemaLocation', or an inline Schema occurs for that namespace.",
               var1
            );
         }
      } else {
         a9 var4 = null;
         a9[] var5 = new a9[]{var4};
         boolean var6 = this.n5(new com.aspose.slides.ms.System.r8(var2.q0(), 0), var1, var5);
         var4 = var5[0];
         if (!var6) {
            var4 = this.n5(var1, var2);
            DictionaryEntry[] var7 = (DictionaryEntry[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(DictionaryEntry.class), this.n3.size())
            );
            this.n3.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0);
            this.n5(var1, var4);
            if (var4.y1().size() > 0) {
               for (int var8 = 0; var8 < var4.y1().size(); var8++) {
                  a9 var9 = (a9)var4.y1().get_Item(var8);
                  String var10 = var9.a6();
                  if (var10 == null) {
                     var10 = com.aspose.slides.ms.System.d1.n5;
                  }

                  if (var3.get_Item(var10) != null && this.n5(var9.m1(), var10, var7) == null) {
                     this.l6(var4);
                     throw new XmlSchemaException(
                        "An element or attribute information item has already been validated from the '{0}' namespace. It is an error if 'xsi:schemaLocation', 'xsi:noNamespaceSchemaLocation', or an inline Schema occurs for that namespace.",
                        var10
                     );
                  }
               }
            }
         }
      }
   }

   public final a9 n5(com.aspose.slides.ms.System.r8 var1, String var2, DictionaryEntry[] var3) {
      if (var1 != null && var1.m1().length() != 0) {
         a9 var4 = null;
         if (var3 == null) {
            var4 = (a9)this.n3.get_Item(var1);
         } else {
            for (int var5 = 0; var5 < var3.length; var5++) {
               if (var1.equals(var3[var5].getKey())) {
                  var4 = (a9)var3[var5].getValue();
                  break;
               }
            }
         }

         if (var4 != null) {
            String var7 = var4.a6() == null ? com.aspose.slides.ms.System.d1.n5 : var4.a6();
            if (com.aspose.slides.ms.System.d1.a6(var7, var2)) {
               return var4;
            }

            if (com.aspose.slides.ms.System.d1.a6(var7, com.aspose.slides.ms.System.d1.n5)) {
               x8 var6 = new x8(var2, var4);
               var4 = (a9)this.y4.get_Item(var6);
            } else {
               var4 = null;
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private void u3(a9 var1) {
      this.c8.addItem(var1.k7(), var1);
      String var2 = this.k5(var1);
      if (this.e2.get_Item(var2) == null) {
         this.e2.addItem(var2, var2);
      }

      if (this.q0 == null && "http://www.w3.org/2001/XMLSchema".equals(var2) && var1.e2().k5(com.aspose.slides.internal.b8c.t4.l6) != null) {
         this.q0 = var1;
      }

      for (int var3 = 0; var3 < var1.y1().size(); var3++) {
         a9 var4 = (a9)var1.y1().get_Item(var3);
         if (!this.c8.containsKey(var4.k7())) {
            this.c8.addItem(var4.k7(), var4);
         }

         var2 = this.k5(var4);
         if (this.e2.get_Item(var2) == null) {
            this.e2.addItem(var2, var2);
         }

         if (this.q0 == null && "http://www.w3.org/2001/XMLSchema".equals(var2) && var1.e2().k5(com.aspose.slides.internal.b8c.t4.l6) != null) {
            this.q0 = var1;
         }
      }
   }

   private void n5(d0 var1, boolean var2) {
      IEnumerator var3 = var1.k5().iterator();

      try {
         while (var3.hasNext()) {
            f8y var4 = (f8y)var3.next();
            if (var2) {
               this.n5(var4, var1);
            }

            com.aspose.slides.ms.System.Xml.k6 var5 = var4.l6();
            f8y var6 = (f8y)this.u3.k5(var5);
            if (var6 != null) {
               for (int var7 = 0; var7 < var4.n5().size(); var7++) {
                  if (!var6.n5().contains(var4.n5().get_Item(var7))) {
                     var6.n5().addItem(var4.n5().get_Item(var7));
                  }
               }
            } else {
               this.n5(this.u3, var5, var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }
   }

   private void n5(f8y var1, d0 var2) {
      List var3 = null;
      v1 var4 = (v1)this.n5.k5(var1.l6());
      if (!var1.n5().contains(var4)) {
         for (int var5 = 0; var5 < var1.n5().size(); var5++) {
            v1 var6 = (v1)var1.n5().get_Item(var5);
            f8y var7 = (f8y)var2.k5(var6.z8());
            if (var7 != null) {
               this.n5(var7, var2);

               for (int var8 = 0; var8 < var7.n5().size(); var8++) {
                  v1 var9 = (v1)var7.n5().get_Item(var8);
                  if (var9 != var6) {
                     if (var3 == null) {
                        var3 = new List();
                     }

                     var3.addItem(var9);
                  }
               }
            }
         }

         if (var3 != null) {
            for (int var10 = 0; var10 < var3.size(); var10++) {
               var1.n5().addItem(var3.get_Item(var10));
            }
         }

         var1.n5().addItem(var4);
      }
   }

   public final a9 n5(a9 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Schema");
      }

      synchronized (this.n5()) {
         if (this.c8.containsKey(var1.k7())) {
            if (var2) {
               this.u9(var1);
               this.a6(var1);
            }

            this.c8.removeItem(var1.k7());
            if (var1.m1() != null) {
               this.n3.removeItem(var1.m1());
            }

            String var4 = this.k5(var1);
            if (this.n5(var4).size() == 0) {
               this.e2.removeItem(var4);
            }

            if (var2) {
               this.x8 = false;
               this.t9 = true;
            }

            return var1;
         } else {
            return null;
         }
      }
   }

   private void t4() {
      this.a6().n5();
      this.u9().n5();
      this.h0().n5();
      this.c8().n5();
      this.s7().n5();
   }

   public final boolean n5(a9[] var1, String var2) {
      t5 var3 = new t5(this.u9, this.n5(this.u9), this.s7, this.z3);
      var3.n5(this.t4.u3());
      var3.n5(this.t4);
      var3.n5(this.n3);
      var3.l6(this.y4);
      boolean var4 = var3.n5(var1[0], var2, true);
      var1[0] = var3.u9();
      return var4;
   }

   public final a9 n5(String var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      com.aspose.slides.ms.System.Xml.z9 var3 = var2.y1();
      o2 var4 = this.n5(var3);
      n7 var5 = new n7(3, var3, var4, this.s7);
      var5.n5(this.t4.u3());

      try {
         int var6 = var5.n5(var2, var1);
      } catch (XmlSchemaException var8) {
         this.n5(var8, 0);
         return null;
      }

      return var5.l6();
   }

   public final void l6(k0t var1) {
      SortedList var2 = var1.z1();
      boolean var3 = this.c8.size() == 0;
      ArrayList var4 = new ArrayList();
      x0 var5 = new x0();

      for (int var6 = 0; var6 < var2.size(); var6++) {
         a9 var7 = (a9)var2.getByIndex(var6);
         com.aspose.slides.ms.System.r8 var8 = var7.m1();
         if (!this.c8.containsKey(var7.k7()) && (var8 == null || var8.m1().length() == 0 || this.n3.get_Item(var8) == null)) {
            this.c8.addItem(var7.k7(), var7);
            if (var8 != null && var8.m1().length() != 0) {
               this.n3.addItem(var8, var7);
            }

            String var9 = this.k5(var7);
            if (this.e2.get_Item(var9) == null) {
               this.e2.addItem(var9, var9);
            }
         } else {
            var4.addItem(var7);
         }
      }

      this.q0();
      IEnumerator var27 = var1.a6().k5().iterator();

      try {
         while (var27.hasNext()) {
            v1 var28 = (v1)var27.next();
            if (!this.n5(this.n5, var28.z8(), var28)) {
               for (Object var11 : var2.getValues()) {
                  if (!var4.contains((a9)var11)) {
                     this.n5((a9)var11, false);
                  }
               }

               for (Object var35 : var1.a6().k5()) {
                  if (!var4.contains(((a9)var35).f2())) {
                     this.n5.n5(((v1)var35).z8());
                  }
               }

               for (Object var36 : var1.u9().k5()) {
                  if (!var4.contains(((a9)var36).f2())) {
                     this.l6.n5(((l2)var36).n3());
                  }
               }

               for (Object var37 : var1.h0().k5()) {
                  if (!var4.contains(((a9)var37).f2())) {
                     this.k5.n5(((j9e)var37).r4());
                  }
               }

               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
            ((IDisposable)var27).dispose();
         }
      }

      IEnumerator var29 = var1.u9().k5().iterator();

      try {
         while (var29.hasNext()) {
            l2 var33 = (l2)var29.next();
            if (!this.n5(this.l6, var33.n3(), var33)) {
               for (Object var12 : var2.getValues()) {
                  if (!var4.contains((a9)var12)) {
                     this.n5((a9)var12, false);
                  }
               }

               for (Object var43 : var1.a6().k5()) {
                  if (!var4.contains(((a9)var43).f2())) {
                     this.n5.n5(((v1)var43).z8());
                  }
               }

               for (Object var44 : var1.u9().k5()) {
                  if (!var4.contains(((a9)var44).f2())) {
                     this.l6.n5(((l2)var44).n3());
                  }
               }

               for (Object var45 : var1.h0().k5()) {
                  if (!var4.contains(((a9)var45).f2())) {
                     this.k5.n5(((j9e)var45).r4());
                  }
               }

               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            ((IDisposable)var29).dispose();
         }
      }

      IEnumerator var34 = var1.h0().k5().iterator();

      try {
         while (var34.hasNext()) {
            j9e var42 = (j9e)var34.next();
            if (!this.n5(this.k5, var42.r4(), var42)) {
               for (Object var13 : var2.getValues()) {
                  if (!var4.contains((a9)var13)) {
                     this.n5((a9)var13, false);
                  }
               }

               for (Object var50 : var1.a6().k5()) {
                  if (!var4.contains(((a9)var50).f2())) {
                     this.n5.n5(((v1)var50).z8());
                  }
               }

               for (Object var51 : var1.u9().k5()) {
                  if (!var4.contains(((a9)var51).f2())) {
                     this.l6.n5(((l2)var51).n3());
                  }
               }

               for (Object var52 : var1.h0().k5()) {
                  if (!var4.contains(((a9)var52).f2())) {
                     this.k5.n5(((j9e)var52).r4());
                  }
               }

               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var34, IDisposable.class)) {
            ((IDisposable)var34).dispose();
         }
      }

      this.n5(var1.c8(), false);
      var5.n5(this.z1, this.s7);
      var5.n5(var1.n3(), this.s7);
      this.z1 = var5;
      if (var3) {
         this.x8 = true;
         this.t9 = false;
      }
   }

   public final x0 n3() {
      return this.z1;
   }

   public final com.aspose.slides.ms.System.Xml.w4 y4() {
      return this.t4;
   }

   public final com.aspose.slides.ms.System.Xml.o8 e2() {
      return this.t4.u3();
   }

   public final b4 t9() {
      return this.s7;
   }

   public final o2 n5(com.aspose.slides.ms.System.Xml.z9 var1) {
      if (this.u9 != var1) {
         return new o2(var1);
      }

      if (this.h0 == null) {
         this.h0 = new o2(this.u9);
      }

      return this.h0;
   }

   public final boolean n5(com.aspose.slides.ms.System.r8 var1, String var2, a9[] var3) {
      var3[0] = null;
      if (var2 == null) {
         var2 = com.aspose.slides.ms.System.d1.n5;
      }

      if (!this.n5(var1, var3)) {
         return false;
      }

      if (!this.c8.containsKey(var3[0].k7()) || var2.length() != 0 && !com.aspose.slides.ms.System.d1.a6(var2, var3[0].a6())) {
         if (var3[0].a6() == null) {
            a9 var4 = this.n5(var1, var2, (DictionaryEntry[])null);
            if (var4 != null && this.c8.containsKey(var4.k7())) {
               var3[0] = var4;
            } else {
               var3[0] = this.n5(var2, var3[0]);
            }
         } else if (var2.length() != 0 && !com.aspose.slides.ms.System.d1.a6(var2, var3[0].a6())) {
            this.n5(
               new XmlSchemaException(
                  "The targetNamespace parameter '{0}' should be the same value as the targetNamespace '{1}' of the Schema.", new String[]{var2, var3[0].a6()}
               ),
               0
            );
            var3[0] = null;
         } else {
            this.u3(var3[0]);
         }
      }

      return true;
   }

   public final boolean n5(com.aspose.slides.ms.System.r8 var1, a9[] var2) {
      var2[0] = null;
      if (var1 != null && var1.m1().length() != 0) {
         var2[0] = (a9)this.n3.get_Item(var1);
         return var2[0] != null;
      } else {
         return false;
      }
   }

   public final String k5(a9 var1) {
      return var1.a6() == null ? com.aspose.slides.ms.System.d1.n5 : var1.a6();
   }

   public final SortedList z1() {
      return this.c8;
   }

   private void a6(a9 var1) {
      ArrayList var2 = new ArrayList();
      var1.n5(var2, var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         if (((a9)var2.get_Item(var3)).m1() != null && ((a9)var2.get_Item(var3)).m1().m1().length() != 0) {
            this.n3.removeItem(((a9)var2.get_Item(var3)).m1());
         }

         ICollection var4 = this.y4.getKeys();
         ArrayList var5 = new ArrayList();
         IEnumerator var6 = var4.iterator();

         try {
            while (var6.hasNext()) {
               x8 var7 = (x8)var6.next();
               if (var7.l6.equals(((a9)var2.get_Item(var3)).m1()) && (var7.k5 == null || com.aspose.slides.ms.System.j8.l6(var7.k5, var2.get_Item(var3)))) {
                  var5.addItem(var7);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               ((IDisposable)var6).dispose();
            }
         }

         for (int var11 = 0; var11 < var5.size(); var11++) {
            this.y4.removeItem(var5.get_Item(var11));
         }
      }
   }

   private void u9(a9 var1) {
      if (this.c8.size() != 0) {
         this.q0();
         IEnumerator var2 = var1.t9().k5().iterator();

         try {
            while (var2.hasNext()) {
               v1 var3 = (v1)var2.next();
               v1 var4 = (v1)this.n5.k5(var3.z8());
               if (var4 == var3) {
                  this.n5.n5(var3.z8());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }

         IEnumerator var20 = var1.n3().k5().iterator();

         try {
            while (var20.hasNext()) {
               l2 var21 = (l2)var20.next();
               l2 var5 = (l2)this.l6.k5(var21.n3());
               if (var5 == var21) {
                  this.l6.n5(var21.n3());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               ((IDisposable)var20).dispose();
            }
         }

         IEnumerator var22 = var1.e2().k5().iterator();

         try {
            while (var22.hasNext()) {
               j9e var23 = (j9e)var22.next();
               j9e var6 = (j9e)this.k5.k5(var23.r4());
               if (var6 == var23) {
                  this.k5.n5(var23.r4());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
               ((IDisposable)var22).dispose();
            }
         }
      }
   }

   private boolean n5(d0 var1, com.aspose.slides.ms.System.Xml.k6 var2, x4 var3) {
      if (var2.l6().length() == 0) {
         return true;
      }

      x4 var4 = var1.k5(var2);
      if (var4 != null) {
         if (var4 != var3 && !com.aspose.slides.ms.System.d1.a6(var4.p8(), var3.p8())) {
            String var5 = com.aspose.slides.ms.System.d1.n5;
            if (com.aspose.slides.internal.v6g.k5.l6(var3, l9.class)) {
               var5 = "The complexType '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, u1s.class)) {
               var5 = "The simpleType '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, v1.class)) {
               var5 = "The global element '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, l2.class)) {
               if ("http://www.w3.org/XML/1998/namespace".equals(var2.n5())) {
                  a9 var6 = t5.h0();
                  x4 var7 = var6.n3().k5(var2);
                  if (var4 == var7) {
                     var1.l6(var2, var3);
                     return true;
                  }

                  if (var3 == var7) {
                     return true;
                  }
               }

               var5 = "The global attribute '{0}' has already been declared.";
            }

            this.n5(new XmlSchemaException(var5, var2.toString()), 0);
            return false;
         } else {
            return true;
         }
      } else {
         var1.n5(var2, var3);
         return true;
      }
   }

   private void q0() {
      if (this.n5 == null) {
         this.n5 = new d0();
      }

      if (this.l6 == null) {
         this.l6 = new d0();
      }

      if (this.k5 == null) {
         this.k5 = new d0();
      }

      if (this.u3 == null) {
         this.u3 = new d0();
      }
   }

   private void n5(Object var1, i0 var2) {
      if (var2.n5() == 0) {
         throw var2.l6();
      }
   }

   private void n5(XmlSchemaException var1, int var2) {
      if (this.s7 != null) {
         this.s7.n5(this, new i0(var1, var2));
      } else {
         throw var1;
      }
   }

   // $VF: synthetic method
   static void n5(k0t var0, Object var1, i0 var2) {
      var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static b4 n5(k0t var0, b4 var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static b4 k5(k0t var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static b4 u3(k0t var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static b4 l6(k0t var0, b4 var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static b4 a6(k0t var0) {
      return var0.m3;
   }
}
