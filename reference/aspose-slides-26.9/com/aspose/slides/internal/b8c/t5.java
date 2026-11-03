package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class t5 extends h0 {
   private String n5;
   private String l6;
   private String k5;
   private a9 u3;
   private a9 a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private Hashtable s7;
   private Hashtable x8;
   private Hashtable n3;
   private Hashtable y4;
   private SortedList e2;
   private com.aspose.slides.ms.System.Xml.w4 t9;
   private a9 z1 = null;
   private ArrayList t4;
   private static AtomicReference<a9> q0 = new AtomicReference<>();
   private com.aspose.slides.ms.System.Xml.o8 z3 = null;

   public t5(com.aspose.slides.ms.System.Xml.z9 var1, o2 var2, b4 var3, x2 var4) {
      super(var1, var2, var3, var4);
      this.n3 = new Hashtable();
      this.y4 = new Hashtable();
      this.e2 = new SortedList();
   }

   public final boolean n5(a9 var1, String var2, boolean var3) {
      this.u3 = var1;
      this.n5 = this.n5().n5("xmlns");
      this.l6 = this.n5().n5("http://www.w3.org/2001/XMLSchema-instance");
      this.u3.y1().clear();
      this.u3.a0().clear();
      if (this.u3.m1() != null && this.s7.get_Item(this.u3.m1()) == null) {
         this.s7.addItem(this.u3.m1(), this.u3);
      }

      if (this.u3.a6() != null) {
         if (var2 == null) {
            var2 = this.u3.a6();
         } else if (!com.aspose.slides.ms.System.d1.a6(var2, this.u3.a6())) {
            this.n5("The targetNamespace parameter '{0}' should be the same value as the targetNamespace '{1}' of the Schema.", var2, this.u3.a6(), this.u3);
         }
      } else if (var2 != null && var2.length() != 0) {
         this.u3 = this.n5(var2, this.u3);
      }

      if (var3 && this.z3 != null) {
         this.k5(this.u3);
      }

      this.l6(this.u3);
      int var4 = 0;

      try {
         for (var4 = 0; var4 < this.e2.size(); var4++) {
            a9 var11 = (a9)this.e2.getByIndex(var4);
            com.aspose.slides.internal.r5t.u3.n5(var11);
            var11.u9(false);
         }

         this.z1 = this.u3;
         this.n5(this.u3, var2, this.u3.y1());
         if (this.t4 != null) {
            for (int var6 = 0; var6 < this.t4.size(); var6++) {
               this.n5((r6)this.t4.get_Item(var6));
            }
         }
      } finally {
         if (var4 == this.e2.size()) {
            var4--;
         }

         while (true) {
            if (var4 < 0) {
               break;
            } else {
               a9 var5 = (a9)this.e2.getByIndex(var4);
               var5.u9(false);
               if (var5 == h0()) {
                  com.aspose.slides.internal.r5t.u3.l6(var5);
               } else {
                  var5.n5(false);
                  var5.l6(!this.a6());
                  com.aspose.slides.internal.r5t.u3.l6(var5);
               }

               var4--;
            }
         }
      }

      this.u3.l6(!this.a6());
      return !this.a6();
   }

   private void n5(a9 var1) {
      if (var1 != h0()) {
         var1.n3().n5();
         var1.y4().n5();
         var1.e2().n5();
         var1.t9().n5();
         var1.t4().n5();
         var1.q0().n5();
         var1.z8().clear();
         var1.z3().n5();
         var1.k5(false);
         var1.n5(false);
      }
   }

   private void n5(h7 var1) {
      f6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, f6.class);
      var2.h0().n5();
      var2.t2().n5();
      var2.c8().n5();
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.z3 = var1;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.w4 var1) {
      this.t9 = var1;
   }

   public final void n5(Hashtable var1) {
      this.s7 = var1;
   }

   public final void l6(Hashtable var1) {
      this.x8 = var1;
   }

   public final a9 u9() {
      return this.u3;
   }

   private void l6(a9 var1) {
      if (!this.e2.contains(var1.k7())) {
         this.e2.addItem(var1.k7(), var1);

         for (int var2 = 0; var2 < var1.h0().size(); var2++) {
            h7 var3 = (h7)var1.h0().n5(var2);
            if (var3.l6() != null) {
               this.l6(var3.l6());
            }
         }
      }
   }

   private void k5(a9 var1) {
      if (!var1.e5()) {
         var1.u9(true);

         for (int var2 = 0; var2 < var1.h0().size(); var2++) {
            Object var3 = null;
            h7 var4 = (h7)var1.h0().n5(var2);
            a9 var5 = var4.l6();
            if (var5 != null) {
               var3 = var5.m1();
               if (var3 != null && this.s7.get_Item(var3) == null) {
                  this.s7.addItem(var3, var5);
               }

               this.k5(var5);
            } else {
               String var6 = var4.n5();
               com.aspose.slides.ms.System.r8 var7 = null;
               RuntimeException var8 = null;
               if (var6 != null) {
                  try {
                     var7 = this.n5(var1, var6);
                  } catch (RuntimeException var20) {
                     var7 = null;
                     var8 = var20;
                  }
               }

               if (var4.a6() == 2) {
                  g0 var9 = com.aspose.slides.internal.v6g.k5.n5(var4, g0.class);
                  String var10 = var9.u9() != null ? var9.u9() : com.aspose.slides.ms.System.d1.n5;
                  if (!var1.a0().contains(var10)) {
                     var1.a0().addItem(var10);
                  }

                  if ("http://www.w3.org/XML/1998/namespace".equals(var10) && var7 == null) {
                     var4.n5(h0());
                     continue;
                  }
               }

               if (var7 == null) {
                  if (var6 != null) {
                     this.n5(new XmlSchemaException("Cannot resolve the 'schemaLocation' attribute.", null, var8, var4.p8(), var4.d5(), var4.s3(), var4), 1);
                  }
               } else if (this.s7.get_Item(var7) == null) {
                  Object var26 = null;

                  try {
                     var26 = this.n5(var7);
                  } catch (RuntimeException var19) {
                     var8 = var19;
                     var26 = null;
                  }

                  if (var26 == null) {
                     this.n5(new XmlSchemaException("Cannot resolve the 'schemaLocation' attribute.", null, var8, var4.p8(), var4.d5(), var4.s3(), var4), 1);
                  } else {
                     var4.n5(var7);
                     com.aspose.slides.ms.System.y8 var28 = com.aspose.slides.ms.System.j8.n5(var26);
                     if (com.aspose.slides.internal.v6g.k5.n5(a9.class).l6(var28)) {
                        var4.n5((a9)var26);
                        this.s7.addItem(var7, var4.l6());
                        this.k5(var4.l6());
                     } else {
                        com.aspose.slides.ms.System.Xml.c7 var11 = null;
                        if (var28.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
                           this.t9.u9(true);
                           this.t9.n5(this.z3);
                           var11 = com.aspose.slides.ms.System.Xml.c7.n5((com.aspose.slides.internal.z0k.t4)var26, this.t9, var7.toString());
                        } else if (var28.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.c7.class))) {
                           var11 = (com.aspose.slides.ms.System.Xml.c7)var26;
                        } else if (var28.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.y1.class))) {
                           this.t9.u9(true);
                           this.t9.n5(this.z3);
                           var11 = com.aspose.slides.ms.System.Xml.c7.n5((com.aspose.slides.internal.z0k.y1)var26, this.t9, var7.toString());
                        }

                        if (var11 == null) {
                           this.n5("Cannot resolve the 'schemaLocation' attribute.", var4, 1);
                        } else {
                           try {
                              n7 var12 = new n7(3, this.n5(), this.l6(), this.k5());
                              var12.n5(var11, null);

                              while (var11.u9()) {
                              }

                              var5 = var12.l6();
                              var4.n5(var5);
                              this.s7.addItem(var7, var5);
                              this.k5(var5);
                           } catch (XmlSchemaException var21) {
                              this.n5(
                                 "Cannot load the Schema from the location '{0}' - {1}",
                                 var6,
                                 var21.getMessage(),
                                 var21.getSourceUri(),
                                 var21.getLineNumber(),
                                 var21.getLinePosition()
                              );
                           } catch (RuntimeException var22) {
                              this.n5(
                                 new XmlSchemaException("Cannot resolve the 'schemaLocation' attribute.", null, var22, var4.p8(), var4.d5(), var4.s3(), var4),
                                 1
                              );
                           } finally {
                              var11.w1();
                           }
                        }
                     }
                  }
               } else {
                  var4.n5((a9)this.s7.get_Item(var7));
               }
            }
         }
      }
   }

   public static a9 h0() {
      if (q0.get() == null) {
         a9 var0 = new a9();
         var0.n5("http://www.w3.org/XML/1998/namespace");
         var0.i1().n5("xml", "http://www.w3.org/XML/1998/namespace");
         l2 var1 = new l2();
         var1.a6("lang");
         var1.l6(new com.aspose.slides.ms.System.Xml.k6("language", "http://www.w3.org/2001/XMLSchema"));
         var0.c8().n5(var1);
         l2 var2 = new l2();
         var2.a6("base");
         var2.l6(new com.aspose.slides.ms.System.Xml.k6("anyURI", "http://www.w3.org/2001/XMLSchema"));
         var0.c8().n5(var2);
         l2 var3 = new l2();
         var3.a6("space");
         u1s var4 = new u1s();
         r3q var5 = new r3q();
         var5.n5(new com.aspose.slides.ms.System.Xml.k6("NCName", "http://www.w3.org/2001/XMLSchema"));
         g4 var6 = new g4();
         var6.l6("default");
         var5.u9().n5(var6);
         g4 var7 = new g4();
         var7.l6("preserve");
         var5.u9().n5(var7);
         var4.n5(var5);
         var3.n5(var4);
         var3.l6("preserve");
         var0.c8().n5(var3);
         j7 var8 = new j7();
         var8.l6("specialAttrs");
         l2 var9 = new l2();
         var9.n5(new com.aspose.slides.ms.System.Xml.k6("lang", "http://www.w3.org/XML/1998/namespace"));
         var8.l6().n5(var9);
         l2 var10 = new l2();
         var10.n5(new com.aspose.slides.ms.System.Xml.k6("space", "http://www.w3.org/XML/1998/namespace"));
         var8.l6().n5(var10);
         l2 var11 = new l2();
         var11.n5(new com.aspose.slides.ms.System.Xml.k6("base", "http://www.w3.org/XML/1998/namespace"));
         var8.l6().n5(var11);
         var0.c8().n5(var8);
         var0.l6(true);
         var0.n5(new com.aspose.slides.ms.System.Xml.j9(), null, null);
         q0.set(var0);
      }

      return q0.get();
   }

   private void u3(a9 var1) {
      this.n3.clear();
      this.n3.addItem("http://www.w3.org/2001/XMLSchema", "http://www.w3.org/2001/XMLSchema");

      for (int var2 = 0; var2 < var1.h0().size(); var2++) {
         h7 var3 = (h7)var1.h0().n5(var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var3, g0.class)) {
            g0 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, g0.class);
            String var5 = var4.u9();
            if (var5 == null) {
               var5 = com.aspose.slides.ms.System.d1.n5;
            }

            if (this.n3.get_Item(var5) == null) {
               this.n3.addItem(var5, var5);
            }
         }
      }

      String var6 = var1.a6();
      if (var6 == null) {
         var6 = com.aspose.slides.ms.System.d1.n5;
      }

      if (this.n3.get_Item(var6) == null) {
         this.n3.addItem(var6, var6);
      }
   }

   private void l6(String var1, String var2, x4 var3) {
      try {
         com.aspose.slides.ms.System.Xml.f4.z8(var1);
      } catch (FormatException var5) {
         this.n5(var2, new String[]{var1}, var5, var3);
      }
   }

   private void n5(a9 var1, String var2, ArrayList var3) {
      Object var4 = null;
      if (!var1.e5()) {
         var1.u9(true);
         String var5 = var1.a6();
         if (var5 != null) {
            String var6 = this.n5().n5(var5);
            var5 = var6;
            var1.n5(var6);
            if (var5.length() == 0) {
               this.n5("The targetNamespace attribute cannot have empty string as its value.", (x4)var1);
            } else {
               this.l6(var5, "The Namespace '{0}' is an invalid URI.", var1);
            }
         }

         if (var1.u9() != null) {
            v5 var15 = com.aspose.slides.internal.b8c.t4.k5(32).b3();
            Object var7 = null;
            Object[] var8 = new Object[]{var7};
            RuntimeException var9 = var15.n5(var1.u9(), null, null, var8);
            var7 = var8[0];
            if (var9 != null) {
               this.n5(
                  "The '{0}' attribute is invalid - The value '{1}' is invalid according to its datatype '{2}' - {3}",
                  new String[]{"version", var1.u9(), var15.j5(), var9.getMessage()},
                  var9,
                  var1
               );
            } else {
               var1.l6((String)var7);
            }
         }

         this.n5(var1);

         for (int var16 = 0; var16 < var1.h0().size(); var16++) {
            h7 var19 = (h7)var1.h0().n5(var16);
            a9 var22 = var19.l6();
            this.n5(var19, var1);
            this.u3(var19);
            String var25 = var19.n5();
            if (var25 != null) {
               this.l6(var25, "The SchemaLocation '{0}' is an invalid URI.", var19);
            } else if ((var19.a6() == 1 || var19.a6() == 3) && var22 == null) {
               this.n5("The required attribute '{0}' is missing.", "schemaLocation", var19);
            }

            switch (var19.a6()) {
               case 1:
                  a9 var12 = var19.l6();
                  if (var12 != null) {
                     if (var22.a6() != null) {
                        if (!com.aspose.slides.ms.System.d1.a6(var1.a6(), var22.a6())) {
                           this.n5(
                              "The targetNamespace '{0}' of included/redefined Schema should be the same as the targetNamespace '{1}' of the including Schema.",
                              var22.a6(),
                              var1.a6(),
                              var19
                           );
                        }
                     } else if (var2 != null && var2.length() != 0) {
                        var22 = this.n5(var2, var22);
                        var19.n5(var22);
                     }

                     this.n5(var22, var1.a6(), var3);
                  }
                  break;
               case 2:
                  g0 var10 = com.aspose.slides.internal.v6g.k5.n5(var19, g0.class);
                  String var11 = var10.u9();
                  if (com.aspose.slides.ms.System.d1.a6(var11, var1.a6())) {
                     this.n5("Namespace attribute of an import must not match the real value of the enclosing targetNamespace of the <Schema>.", var19);
                  }

                  if (var22 != null) {
                     if (!com.aspose.slides.ms.System.d1.a6(var11, var22.a6())) {
                        this.n5(
                           "The namespace attribute '{0}' of an import should be the same value as the targetNamespace '{1}' of the imported Schema.",
                           var11,
                           var22.a6(),
                           var10
                        );
                     }

                     var4 = this.z1;
                     this.z1 = var22;
                     this.n5(var22, var11, var3);
                     this.z1 = (a9)var4;
                  } else if (var11 != null) {
                     if (var11.length() == 0) {
                        this.n5("The namespace attribute cannot have empty string as its value.", var11, var19);
                     } else {
                        this.l6(var11, "The Namespace '{0}' is an invalid URI.", var19);
                     }
                  }
                  break;
               case 3:
                  if (var22 != null) {
                     this.n5(var19);
                     if (var22.a6() != null) {
                        if (!com.aspose.slides.ms.System.d1.a6(var1.a6(), var22.a6())) {
                           this.n5(
                              "The targetNamespace '{0}' of included/redefined Schema should be the same as the targetNamespace '{1}' of the including Schema.",
                              var22.a6(),
                              var1.a6(),
                              var19
                           );
                        }
                     } else if (var2 != null && var2.length() != 0) {
                        var22 = this.n5(var2, var22);
                        var19.n5(var22);
                     }

                     this.n5(var22, var1.a6(), var3);
                  }
                  break;
               default:
                  if (var22.a6() != null) {
                     if (!com.aspose.slides.ms.System.d1.a6(var1.a6(), var22.a6())) {
                        this.n5(
                           "The targetNamespace '{0}' of included/redefined Schema should be the same as the targetNamespace '{1}' of the including Schema.",
                           var22.a6(),
                           var1.a6(),
                           var19
                        );
                     }
                  } else if (var2 != null && var2.length() != 0) {
                     var22 = this.n5(var2, var22);
                     var19.n5(var22);
                  }

                  this.n5(var22, var1.a6(), var3);
            }
         }

         this.a6 = var1;
         this.u3(var1);
         this.l6((x4)var1);
         this.k5 = var2 == null ? com.aspose.slides.ms.System.d1.n5 : var2;
         this.a6(var1);
         this.y4.clear();

         for (int var20 = 0; var20 < var1.h0().size(); var20++) {
            h7 var17 = (h7)var1.h0().n5(var20);
            a9 var23 = var17.l6();
            if (var23 != null) {
               switch (var17.a6()) {
                  case 1:
                     if (this.y4.get_Item(var23) != null) {
                        continue;
                     }

                     this.y4.addItem(var23, var17);
                     this.n5(var23, var1);
                     break;
                  case 2:
                     if (var23 != this.u3) {
                        g0 var26 = com.aspose.slides.internal.v6g.k5.n5(var17, g0.class);
                        String var30 = var26.u9() != null ? var26.u9() : com.aspose.slides.ms.System.d1.n5;
                        if (!var3.contains(var23)) {
                           var3.addItem(var23);
                        }

                        if (!this.u3.a0().contains(var30)) {
                           this.u3.a0().addItem(var30);
                        }
                     }
                     break;
                  case 3:
                     if (this.t4 == null) {
                        this.t4 = new ArrayList();
                     }

                     this.t4.addItem(new r6(com.aspose.slides.internal.v6g.k5.n5(var17, f6.class), this.z1));
                     if (this.y4.get_Item(var23) != null) {
                        continue;
                     }

                     this.y4.addItem(var23, var17);
                     this.n5(var23, var1);
               }
            } else if (var17.a6() == 3) {
               f6 var27 = com.aspose.slides.internal.v6g.k5.n5(var17, f6.class);
               if (var27.u3() == null) {
                  for (int var31 = 0; var31 < var27.u9().size(); var31++) {
                     if (!com.aspose.slides.internal.v6g.k5.l6(var27.u9().n5(var31), q4.class)) {
                        this.n5("'SchemaLocation' must successfully resolve if <redefine> contains any child other than <annotation>.", var27);
                        break;
                     }
                  }
               }
            }

            this.l6(var17);
         }

         List var21 = new List();
         z4 var24 = var1.c8();

         for (int var28 = 0; var28 < var24.size(); var28++) {
            this.n5(var24.n5(var28), var1);
            l2 var32 = com.aspose.slides.internal.v6g.k5.n5(var24.n5(var28), l2.class);
            if (var32 != null) {
               this.n5(var32);
               this.n5(var1.n3(), var32.n3(), var32);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), j7.class)) {
               j7 var33 = (j7)var24.n5(var28);
               this.l6(var33);
               this.n5(var1.y4(), var33.h0(), var33);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), l9.class)) {
               l9 var34 = (l9)var24.n5(var28);
               this.n5(var34, false);
               this.n5(var1.e2(), var34.r4(), var34);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), u1s.class)) {
               u1s var35 = (u1s)var24.n5(var28);
               this.n5(var35, false);
               this.n5(var1.e2(), var35.r4(), var35);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), v1.class)) {
               v1 var36 = (v1)var24.n5(var28);
               this.n5(var36);
               this.n5(var1.t9(), var36.z8(), var36);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), f3.class)) {
               f3 var37 = (f3)var24.n5(var28);
               this.l6(var37);
               this.n5(var1.t4(), var37.u9(), var37);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), y3.class)) {
               y3 var38 = (y3)var24.n5(var28);
               this.n5(var38);
               this.n5(var1.q0(), var38.h0(), var38);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var24.n5(var28), q4.class)) {
               this.n5(com.aspose.slides.internal.v6g.k5.n5(var24.n5(var28), q4.class));
            } else {
               this.n5(
                  "The Schema items collection cannot contain an object of type 'XmlSchemaInclude', 'XmlSchemaImport', or 'XmlSchemaRedefine'.",
                  var24.n5(var28)
               );
               var21.addItem(var24.n5(var28));
            }
         }

         for (int var29 = 0; var29 < var21.size(); var29++) {
            var1.c8().l6((x4)var21.get_Item(var29));
         }
      }
   }

   private void n5(a9 var1, a9 var2) {
      IEnumerator var3 = var1.t9().k5().iterator();

      try {
         while (var3.hasNext()) {
            v1 var4 = (v1)var3.next();
            this.n5(var2.t9(), var4.z8(), var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      IEnumerator var53 = var1.n3().k5().iterator();

      try {
         while (var53.hasNext()) {
            l2 var5 = (l2)var53.next();
            this.n5(var2.n3(), var5.n3(), var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var53, IDisposable.class)) {
            ((IDisposable)var53).dispose();
         }
      }

      IEnumerator var54 = var1.t4().k5().iterator();

      try {
         while (var54.hasNext()) {
            f3 var6 = (f3)var54.next();
            this.n5(var2.t4(), var6.u9(), var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var54, IDisposable.class)) {
            ((IDisposable)var54).dispose();
         }
      }

      IEnumerator var55 = var1.y4().k5().iterator();

      try {
         while (var55.hasNext()) {
            j7 var7 = (j7)var55.next();
            this.n5(var2.y4(), var7.h0(), var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var55, IDisposable.class)) {
            ((IDisposable)var55).dispose();
         }
      }

      IEnumerator var56 = var1.e2().k5().iterator();

      try {
         while (var56.hasNext()) {
            j9e var8 = (j9e)var56.next();
            this.n5(var2.e2(), var8.r4(), var8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var56, IDisposable.class)) {
            ((IDisposable)var56).dispose();
         }
      }

      IEnumerator var57 = var1.q0().k5().iterator();

      try {
         while (var57.hasNext()) {
            y3 var9 = (y3)var57.next();
            this.n5(var2.q0(), var9.h0(), var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var57, IDisposable.class)) {
            ((IDisposable)var57).dispose();
         }
      }
   }

   private void n5(r6 var1) {
      f6 var2 = var1.n5;
      a9 var3 = var2.l6();
      this.a6 = n5((com.aspose.slides.internal.b8c.x4)(var2));
      this.a6(this.a6);
      if (var3.x8()) {
         this.n5("Multiple redefines of the same Schema will be ignored.", var2, 1);
      } else {
         var3.k5(true);
         a9 var4 = var1.l6;
         ArrayList var5 = new ArrayList();
         this.n5(var3, var5);
         String var6 = var4.a6() == null ? com.aspose.slides.ms.System.d1.n5 : var4.a6();
         z4 var7 = var2.u9();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            this.n5(var7.n5(var8), var2);
            f3 var9 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(var8), f3.class);
            if (var9 != null) {
               this.l6(var9);
               var9.u9().n5(var6);
               if (var2.t2().k5(var9.u9()) != null) {
                  this.n5("Double redefine for group.", var9);
               } else {
                  this.n5(var2.t2(), var9.u9(), var9);
                  f3 var10 = (f3)var4.t4().k5(var9.u9());
                  a9 var11 = n5((x4)var10);
                  if (var10 != null && (var11 == var3 || var5.contains(var11))) {
                     var9.n5(var10);
                     var4.t4().l6(var9.u9(), var9);
                     this.n5(var9);
                  } else {
                     this.n5("Cannot find a {0} with name '{1}' to redefine.", "<group>", var9.u9().toString(), var9);
                  }
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var7.n5(var8), j7.class)) {
               j7 var13 = (j7)var7.n5(var8);
               this.l6(var13);
               var13.h0().n5(var6);
               if (var2.h0().k5(var13.h0()) != null) {
                  this.n5("Double redefine for attribute group.", var13);
               } else {
                  this.n5(var2.h0(), var13.h0(), var13);
                  j7 var16 = (j7)var4.y4().k5(var13.h0());
                  a9 var12 = n5((x4)var16);
                  if (var16 != null && (var12 == var3 || var5.contains(var12))) {
                     var13.n5(var16);
                     var4.y4().l6(var13.h0(), var13);
                     this.n5(var13);
                  } else {
                     this.n5("Cannot find a {0} with name '{1}' to redefine.", "<attributeGroup>", var13.h0().toString(), var13);
                  }
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var7.n5(var8), l9.class)) {
               l9 var14 = (l9)var7.n5(var8);
               this.n5(var14, false);
               var14.r4().n5(var6);
               if (var2.c8().k5(var14.r4()) != null) {
                  this.n5("Double redefine for complex type.", var14);
               } else {
                  this.n5(var2.c8(), var14.r4(), var14);
                  j9e var17 = (j9e)var4.e2().k5(var14.r4());
                  a9 var19 = n5(var17);
                  if (var17 != null && (var19 == var3 || var5.contains(var19))) {
                     if (com.aspose.slides.internal.v6g.k5.l6(var17, l9.class)) {
                        var14.l6(var17);
                        var4.e2().l6(var14.r4(), var14);
                        this.n5(var14);
                     } else {
                        this.n5("Cannot redefine a simple type as complex type.", var14);
                     }
                  } else {
                     this.n5("Cannot find a {0} with name '{1}' to redefine.", "<complexType>", var14.r4().toString(), var14);
                  }
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var7.n5(var8), u1s.class)) {
               u1s var15 = (u1s)var7.n5(var8);
               this.n5(var15, false);
               var15.r4().n5(var6);
               if (var2.c8().k5(var15.r4()) != null) {
                  this.n5("Double redefine for simple type.", var15);
               } else {
                  this.n5(var2.c8(), var15.r4(), var15);
                  j9e var18 = (j9e)var4.e2().k5(var15.r4());
                  a9 var20 = n5(var18);
                  if (var18 != null && (var20 == var3 || var5.contains(var20))) {
                     if (com.aspose.slides.internal.v6g.k5.l6(var18, u1s.class)) {
                        var15.l6(var18);
                        var4.e2().l6(var15.r4(), var15);
                        this.n5(var15);
                     } else {
                        this.n5("Cannot redefine a complex type as simple type.", var15);
                     }
                  } else {
                     this.n5("Cannot find a {0} with name '{1}' to redefine.", "<simpleType>", var15.r4().toString(), var15);
                  }
               }
            }
         }
      }
   }

   private void n5(a9 var1, ArrayList var2) {
      if (!var2.contains(var1)) {
         var2.addItem(var1);

         for (int var3 = 0; var3 < var1.h0().size(); var3++) {
            h7 var4 = (h7)var1.h0().n5(var3);
            if ((var4.a6() == 1 || var4.a6() == 3) && var4.l6() != null) {
               this.n5(var4.l6(), var2);
            }
         }
      }
   }

   public static a9 n5(x4 var0) {
      a9 var1 = null;

      while (var1 == null && var0 != null) {
         var0 = var0.f2();
         var1 = com.aspose.slides.internal.v6g.k5.n5(var0, a9.class);
      }

      return var1;
   }

   private void a6(a9 var1) {
      if (var1.l6() == 255) {
         this.c8 = 255;
      } else if (var1.l6() == 256) {
         this.c8 = 0;
      } else {
         if ((var1.l6() & -8) != 0) {
            this.n5("The values 'list' and 'union' are invalid for the blockDefault attribute.", (x4)var1);
         }

         this.c8 = var1.l6() & 7;
      }

      if (var1.k5() == 255) {
         this.t2 = 255;
      } else if (var1.k5() == 256) {
         this.t2 = 0;
      } else {
         if ((var1.k5() & -31) != 0) {
            this.n5("The value 'substitution' is invalid for the finalDefault attribute.", (x4)var1);
         }

         this.t2 = var1.k5() & 30;
      }

      this.u9 = var1.u3();
      if (this.u9 == 0) {
         this.u9 = 2;
      }

      this.h0 = var1.n5();
      if (this.h0 == 0) {
         this.h0 = 2;
      }
   }

   private int n5(z4 var1, com.aspose.slides.ms.System.Xml.k6 var2, f3 var3) {
      int var4 = 0;

      for (int var5 = 0; var5 < var1.size(); var5++) {
         e1 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(var5), e1.class);
         if (var6 != null) {
            if (com.aspose.slides.ms.System.Xml.k6.n5(var6.n5(), var2)) {
               var6.n5(var3);
               if (com.aspose.slides.ms.System.c4.h0(var6.z7(), com.aspose.slides.ms.System.c4.u3)
                  || com.aspose.slides.ms.System.c4.h0(var6.v4(), com.aspose.slides.ms.System.c4.u3)) {
                  this.n5("When group is redefined, the real value of both minOccurs and maxOccurs attribute must be 1 (or absent).", var6);
               }

               var4++;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(var5), g3.class)) {
            var4 += this.n5(((g3)var1.n5(var5)).n5(), var2, var3);
         }

         if (var4 > 1) {
            break;
         }
      }

      return var4;
   }

   private void n5(f3 var1) {
      int var2 = 0;
      if (var1.l6() != null) {
         var2 = this.n5(var1.l6().n5(), var1.u9(), var1.c8());
      }

      if (var2 > 1) {
         this.n5("Multiple self-reference within a group is redefined.", var1);
      }

      var1.n5(var2);
   }

   private void n5(j7 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.l6().size(); var3++) {
         k0 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(var3), k0.class);
         if (var4 != null && com.aspose.slides.ms.System.Xml.k6.n5(var4.n5(), var1.h0())) {
            var2++;
         }
      }

      if (var2 > 1) {
         this.n5("Multiple self-reference within an attribute group is redefined.", var1);
      }

      var1.n5(var2);
   }

   private void n5(u1s var1) {
      if (var1.n5() != null && com.aspose.slides.internal.v6g.k5.l6(var1.n5(), r3q.class)) {
         r3q var2 = (r3q)var1.n5();
         if (com.aspose.slides.ms.System.Xml.k6.n5(var2.n5(), var1.r4())) {
            return;
         }
      }

      this.n5("If type is being redefined, the base type has to be self-referenced.", var1);
   }

   private void n5(l9 var1) {
      if (var1.x8() != null) {
         com.aspose.slides.ms.System.Xml.k6 var3;
         if (com.aspose.slides.internal.v6g.k5.l6(var1.x8(), p0.class)) {
            p0 var2 = (p0)var1.x8();
            if (com.aspose.slides.internal.v6g.k5.l6(var2.l6(), g9.class)) {
               var3 = ((g9)var2.l6()).n5();
            } else {
               var3 = ((s1)var2.l6()).n5();
            }
         } else {
            y9w var4 = (y9w)var1.x8();
            if (com.aspose.slides.internal.v6g.k5.l6(var4.n5(), f6z.class)) {
               var3 = ((f6z)var4.n5()).n5();
            } else {
               var3 = ((i0e)var4.n5()).n5();
            }
         }

         if (com.aspose.slides.ms.System.Xml.k6.n5(var3, var1.r4())) {
            return;
         }
      }

      this.n5("If type is being redefined, the base type has to be self-referenced.", var1);
   }

   private void n5(l2 var1) {
      if (var1.h0() != null) {
         this.k5((x4)var1);
         var1.k5(new com.aspose.slides.ms.System.Xml.k6(var1.h0(), this.k5));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      if (var1.x8() != 0) {
         this.n5("The '{0}' attribute cannot be present.", "use", var1);
      }

      if (var1.u9() != 0) {
         this.n5("The '{0}' attribute cannot be present.", "form", var1);
      }

      this.k5(var1);
      this.l6((x4)var1);
   }

   private void l6(l2 var1) {
      if (var1.h0() != null) {
         this.k5((x4)var1);
         this.k5(var1);
         var1.k5(new com.aspose.slides.ms.System.Xml.k6(var1.h0(), var1.u9() != 1 && (var1.u9() != 0 || this.h0 != 1) ? null : this.k5));
      } else {
         this.u3(var1);
         if (var1.c8().k5()) {
            this.n5("For attribute '{0}', either the name or the ref attribute must be present, but not both.", "???", var1);
         } else {
            this.n5(var1, "ref", var1.c8());
         }

         if (!var1.t2().k5() || var1.s7() != null || var1.u9() != 0) {
            this.n5("If ref is present, all of 'simpleType', 'form', 'type', and 'use' must be absent.", var1);
         }

         var1.k5(var1.c8());
      }

      this.l6((x4)var1);
   }

   private void k5(l2 var1) {
      this.u3(var1);
      if (com.aspose.slides.ms.System.Xml.v8.n5(this.a6.a6(), this.l6)) {
         this.n5("The target namespace of an attribute declaration, whether local or global, must not match http://www.w3.org/2001/XMLSchema-instance.", var1);
      }

      if (!var1.c8().k5()) {
         this.n5("The '{0}' attribute cannot be present.", "ref", var1);
      }

      if (var1.n5() != null && var1.l6() != null) {
         this.n5("The fixed and default attributes cannot both be present.", var1);
      }

      if (var1.n5() != null && var1.x8() != 1 && var1.x8() != 0) {
         this.n5("The 'use' attribute must be optional (or absent) if the default attribute is present.", var1);
      }

      if (com.aspose.slides.ms.System.d1.a6(var1.h0(), this.n5)) {
         this.n5("The value 'xmlns' cannot be used as the name of an attribute declaration.", var1);
      }

      if (var1.s7() != null) {
         this.n5(var1.s7(), var1);
         if (!var1.t2().k5()) {
            this.n5("The type attribute cannot be present with either simpleType or complexType.", var1);
         }

         this.n5(var1.s7(), true);
      }

      if (!var1.t2().k5()) {
         this.n5(var1, "type", var1.t2());
      }
   }

   private void l6(j7 var1) {
      if (var1.n5() != null) {
         this.k5(var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.k5));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      this.n5(var1.l6(), var1.u9(), var1);
      this.u3(var1);
      this.l6((x4)var1);
   }

   private void n5(v1 var1) {
      if (var1.n3() != null) {
         this.k5((x4)var1);
         var1.u3(new com.aspose.slides.ms.System.Xml.k6(var1.n3(), this.k5));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      this.k5(var1);
      if (var1.c8() == 255) {
         var1.a6(255);
      } else if (var1.c8() == 256) {
         if (this.t2 == 255) {
            var1.a6(255);
         } else {
            var1.a6(this.t2 & 6);
         }
      } else {
         if ((var1.c8() & -7) != 0) {
            this.n5("The values 'substitution', 'list', and 'union' are invalid for the final attribute on element.", var1);
         }

         var1.a6(var1.c8() & 6);
      }

      if (var1.x8() != 0) {
         this.n5("The '{0}' attribute cannot be present.", "form", var1);
      }

      if (var1.b3() != null) {
         this.n5("The '{0}' attribute cannot be present.", "minOccurs", var1);
      }

      if (var1.o0() != null) {
         this.n5("The '{0}' attribute cannot be present.", "maxOccurs", var1);
      }

      if (!var1.z3().k5()) {
         this.n5(var1, "type", var1.z3());
      }

      this.l6((x4)var1);
   }

   private void l6(v1 var1) {
      if (var1.n3() != null) {
         this.k5((x4)var1);
         this.k5(var1);
         var1.u3(new com.aspose.slides.ms.System.Xml.k6(var1.n3(), var1.x8() != 1 && (var1.x8() != 0 || this.u9 != 1) ? null : this.k5));
      } else {
         this.u3(var1);
         if (var1.q0().k5()) {
            this.n5("For element declaration, either the name or the ref attribute must be present.", var1);
         } else {
            this.n5(var1, "ref", var1.q0());
         }

         if (!var1.m1().k5()
            || var1.t9()
            || var1.u9() != 256
            || var1.k7() != null
            || var1.c4()
            || var1.h0() != null
            || var1.x8() != 0
            || var1.s7() != null
            || var1.e2()) {
            this.n5(
               "If ref is present, all of <complexType>, <simpleType>, <key>, <keyref>, <unique>, nillable, default, fixed, form, block, and type must be absent.",
               var1
            );
         }

         if (var1.h0() != null && var1.s7() != null) {
            this.n5("The fixed and default attributes cannot both be present.", var1);
         }

         var1.u3(var1.q0());
      }

      if (com.aspose.slides.ms.System.c4.t2(var1.z7(), var1.v4())) {
         var1.n5(com.aspose.slides.ms.System.c4.a6.l6());
         this.n5("minOccurs value cannot be greater than maxOccurs value.", var1);
      }

      if (var1.t9()) {
         this.n5("The '{0}' attribute cannot be present.", "abstract", var1);
      }

      if (var1.c8() != 256) {
         this.n5("The '{0}' attribute cannot be present.", "final", var1);
      }

      if (!var1.z3().k5()) {
         this.n5("The '{0}' attribute cannot be present.", "substitutionGroup", var1);
      }

      this.l6((x4)var1);
   }

   private void k5(v1 var1) {
      this.u3(var1);
      if (!var1.q0().k5()) {
         this.n5("The '{0}' attribute cannot be present.", "ref", var1);
      }

      if (var1.u9() == 255) {
         var1.u3(255);
      } else if (var1.u9() == 256) {
         if (this.c8 == 255) {
            var1.u3(255);
         } else {
            var1.u3(this.c8 & 7);
         }
      } else {
         if ((var1.u9() & -8) != 0) {
            this.n5("The values 'list' and 'union' are invalid for the block attribute on element.", var1);
         }

         var1.u3(var1.u9() & 7);
      }

      if (var1.k7() != null) {
         this.n5(var1.k7(), var1);
         if (!var1.m1().k5()) {
            this.n5("The type attribute cannot be present with either simpleType or complexType.", var1);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1.k7(), l9.class)) {
            this.n5((l9)var1.k7(), true);
         } else {
            this.n5((u1s)var1.k7(), true);
         }
      }

      if (!var1.m1().k5()) {
         this.n5(var1, "type", var1.m1());
      }

      if (var1.h0() != null && var1.s7() != null) {
         this.n5("The fixed and default attributes cannot both be present.", var1);
      }

      for (int var2 = 0; var2 < var1.m3().size(); var2++) {
         m2 var3 = (m2)var1.m3().n5(var2);
         this.n5(var3, var1);
         this.n5(var3);
      }
   }

   private void n5(m2 var1) {
      boolean var2 = true;
      this.u3(var1);
      if (var1.n5() != null) {
         this.k5(var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.k5));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
         var2 = false;
      }

      if (this.u3.z3().k5(var1.h0()) != null) {
         this.n5("The identity constraint '{0}' has already been declared.", var1.h0().toString(), var1);
         var2 = false;
      } else {
         this.u3.z3().n5(var1.h0(), var1);
      }

      if (var1.l6() == null) {
         this.n5("Selector must be present.", var1);
         var2 = false;
      }

      if (var1.u9().size() == 0) {
         this.n5("At least one field must be present.", var1);
         var2 = false;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, g5.class)) {
         g5 var3 = (g5)var1;
         if (var3.t2().k5()) {
            this.n5("The referring attribute must be present.", var1);
            var2 = false;
         } else {
            this.n5(var3, "refer", var3.t2());
         }
      }

      if (var2) {
         this.l6(var1);
         this.l6(var1.l6());
         this.n5(var1.l6(), var1);

         for (int var4 = 0; var4 < var1.u9().size(); var4++) {
            this.n5(var1.u9().n5(var4), var1);
            this.l6(var1.u9().n5(var4));
         }
      }
   }

   private void n5(u1s var1, boolean var2) {
      if (var2) {
         if (var1.j5() != null) {
            this.n5("The '{0}' attribute cannot be present.", "name", var1);
         }
      } else {
         if (var1.j5() != null) {
            this.k5(var1);
            var1.l6(new com.aspose.slides.ms.System.Xml.k6(var1.j5(), this.k5));
         } else {
            this.n5("The required attribute '{0}' is missing.", "name", var1);
         }

         if (var1.w1() == 255) {
            var1.a6(255);
         } else if (var1.w1() == 256) {
            if (this.t2 == 255) {
               var1.a6(255);
            } else {
               var1.a6(this.t2 & 30);
            }
         } else {
            if ((var1.w1() & -31) != 0) {
               this.n5("The values 'substitution' and 'extension' are invalid for the final attribute on simpleType.", var1);
            }

            var1.a6(var1.w1() & 30);
         }
      }

      if (var1.n5() == null) {
         this.n5("SimpleType content is missing.", var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), r3q.class)) {
         r3q var3 = (r3q)var1.n5();
         this.n5(var3, var1);

         for (int var4 = 0; var4 < var3.u9().size(); var4++) {
            this.n5(var3.u9().n5(var4), var3);
         }

         if (var3.l6() != null) {
            if (!var3.n5().k5()) {
               this.n5("SimpleType restriction should have either the base attribute or a simpleType child, but not both.", var3);
            }

            this.n5(var3.l6(), true);
         } else if (var3.n5().k5()) {
            this.n5("SimpleType restriction should have either the base attribute or a simpleType child to indicate the base type for the derivation.", var3);
         } else {
            this.n5(var3, "base", var3.n5());
         }

         this.u3(var3);
         this.l6(var3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), e5a.class)) {
         e5a var7 = (e5a)var1.n5();
         this.n5(var7, var1);
         if (var7.l6() != null) {
            if (!var7.n5().k5()) {
               this.n5("SimpleType list should have either the itemType attribute or a simpleType child, but not both.", var7);
            }

            this.n5(var7.l6(), var7);
            this.n5(var7.l6(), true);
         } else if (var7.n5().k5()) {
            this.n5("SimpleType list should have either the itemType attribute or a simpleType child to indicate the itemType of the list.", var7);
         } else {
            this.n5(var7, "itemType", var7.n5());
         }

         this.u3(var7);
         this.l6(var7);
      } else {
         d4n var8 = (d4n)var1.n5();
         this.n5(var8, var1);
         int var9 = var8.n5().size();
         if (var8.l6() != null) {
            var9 += var8.l6().length;
            com.aspose.slides.ms.System.Xml.k6[] var5 = var8.l6();

            for (int var6 = 0; var6 < var5.length; var6++) {
               this.n5(var8, "memberTypes", var5[var6]);
            }
         }

         if (var9 == 0) {
            this.n5("Either the memberTypes attribute must be non-empty or there must be at least one simpleType child.", var8);
         }

         for (int var10 = 0; var10 < var8.n5().size(); var10++) {
            u1s var11 = (u1s)var8.n5().n5(var10);
            this.n5(var11, var8);
            this.n5(var11, true);
         }

         this.u3(var8);
         this.l6(var8);
      }

      this.l6(var1);
   }

   private void n5(l9 var1, boolean var2) {
      if (var2) {
         if (var1.j5() != null) {
            this.n5("The '{0}' attribute cannot be present.", "name", var1);
         }
      } else {
         if (var1.j5() != null) {
            this.k5(var1);
            var1.l6(new com.aspose.slides.ms.System.Xml.k6(var1.j5(), this.k5));
         } else {
            this.n5("The required attribute '{0}' is missing.", "name", var1);
         }

         if (var1.t2() == 255) {
            var1.l6(255);
         } else if (var1.t2() == 256) {
            var1.l6(this.c8 & 6);
         } else {
            if ((var1.t2() & -7) != 0) {
               this.n5("The values 'substitution', 'list', and 'union' are invalid for the block attribute on complexType.", var1);
            }

            var1.l6(var1.t2() & 6);
         }

         if (var1.w1() == 255) {
            var1.a6(255);
         } else if (var1.w1() == 256) {
            if (this.t2 == 255) {
               var1.a6(255);
            } else {
               var1.a6(this.t2 & 6);
            }
         } else {
            if ((var1.w1() & -7) != 0) {
               this.n5("The values 'substitution', 'list', and 'union' are invalid for the final attribute on complexType.", var1);
            }

            var1.a6(var1.w1() & 6);
         }
      }

      if (var1.x8() != null) {
         this.n5(var1.x8(), var1);
         this.u3(var1.x8());
         if (var1.n3() == null && var1.y4() != null) {
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1.x8(), y9w.class)) {
            y9w var3 = (y9w)var1.x8();
            if (var3.n5() == null) {
               if (com.aspose.slides.ms.System.Xml.k6.n5(var1.r4(), com.aspose.slides.ms.System.Xml.k6.n5)) {
                  this.n5("'restriction' or 'extension' child is required for complexType with simpleContent or complexContent child.", var1);
               } else {
                  this.n5(
                     "'restriction' or 'extension' child is required for complexType '{0}' in namespace '{1}', because it has a simpleContent or complexContent child.",
                     var1.r4().l6(),
                     var1.r4().n5(),
                     var1
                  );
               }
            } else {
               this.n5(var3.n5(), var3);
               this.u3(var3.n5());
               if (com.aspose.slides.internal.v6g.k5.l6(var3.n5(), i0e.class)) {
                  i0e var4 = (i0e)var3.n5();
                  if (var4.n5().k5()) {
                     this.n5("The '{0}' attribute is either invalid or missing.", "base", var4);
                  } else {
                     this.n5(var4, "base", var4.n5());
                  }

                  this.n5(var4.l6(), var4.u9(), var4);
                  this.l6(var4);
               } else {
                  f6z var6 = (f6z)var3.n5();
                  if (var6.n5().k5()) {
                     this.n5("The '{0}' attribute is either invalid or missing.", "base", var6);
                  } else {
                     this.n5(var6, "base", var6.n5());
                  }

                  if (var6.l6() != null) {
                     this.n5(var6.l6(), var6);
                     this.n5(var6.l6(), true);
                  }

                  this.n5(var6.h0(), var6.c8(), var6);
                  this.l6(var6);
               }
            }

            this.l6(var3);
         } else {
            p0 var5 = (p0)var1.x8();
            if (var5.l6() == null) {
               if (com.aspose.slides.ms.System.Xml.k6.n5(var1.r4(), com.aspose.slides.ms.System.Xml.k6.n5)) {
                  this.n5("'restriction' or 'extension' child is required for complexType with simpleContent or complexContent child.", var1);
               } else {
                  this.n5(
                     "'restriction' or 'extension' child is required for complexType '{0}' in namespace '{1}', because it has a simpleContent or complexContent child.",
                     var1.r4().l6(),
                     var1.r4().n5(),
                     var1
                  );
               }
            } else {
               if (!var5.u9() && var1.s7()) {
                  var5.n5(true);
               }

               this.n5(var5.l6(), var5);
               this.u3(var5.l6());
               if (com.aspose.slides.internal.v6g.k5.l6(var5.l6(), s1.class)) {
                  s1 var7 = (s1)var5.l6();
                  if (var7.n5().k5()) {
                     this.n5("The '{0}' attribute is either invalid or missing.", "base", var7);
                  } else {
                     this.n5(var7, "base", var7.n5());
                  }

                  if (var7.l6() != null) {
                     this.n5(var7.l6(), var7);
                     this.n5(var7.l6());
                  }

                  this.n5(var7.u9(), var7.h0(), var7);
                  this.l6(var7);
               } else {
                  g9 var8 = (g9)var5.l6();
                  if (var8.n5().k5()) {
                     this.n5("The '{0}' attribute is either invalid or missing.", "base", var8);
                  } else {
                     this.n5(var8, "base", var8.n5());
                  }

                  if (var8.l6() != null) {
                     this.n5(var8.l6(), var8);
                     this.n5(var8.l6());
                  }

                  this.n5(var8.u9(), var8.h0(), var8);
                  this.l6(var8);
               }

               this.l6(var5);
            }
         }
      } else {
         if (var1.n3() != null) {
            this.n5(var1.n3(), var1);
            this.n5(var1.n3());
         }

         this.n5(var1.y4(), var1.e2(), var1);
      }

      this.l6(var1);
   }

   private void l6(f3 var1) {
      if (var1.n5() != null) {
         this.k5(var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.k5));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      if (var1.l6() == null) {
         this.n5("'sequence', 'choice', or 'all' child is required.", var1);
      } else {
         if (var1.l6().b3() != null) {
            this.n5("The '{0}' attribute cannot be present.", "minOccurs", var1.l6());
         }

         if (var1.l6().o0() != null) {
            this.n5("The '{0}' attribute cannot be present.", "maxOccurs", var1.l6());
         }

         this.n5(var1.l6());
         this.u3(var1);
         this.l6((x4)var1);
      }
   }

   private void n5(y3 var1) {
      if (var1.n5() != null) {
         this.k5(var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.k5));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      if (var1.l6() == null && var1.u9() == null) {
         this.n5("NOTATION must have either the Public or System attribute present.", var1);
      } else {
         if (var1.l6() != null) {
            try {
               com.aspose.slides.ms.System.Xml.f4.a6(var1.l6());
            } catch (XmlException var3) {
               this.n5("Public attribute '{0}' is an invalid URI.", new String[]{var1.l6()}, var3, var1);
            }
         }

         if (var1.u9() != null) {
            this.l6(var1.u9(), "System attribute '{0}' is an invalid URI.", var1);
         }
      }

      this.u3(var1);
      this.l6(var1);
   }

   private void n5(c1 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, u0.class)) {
         if (com.aspose.slides.ms.System.c4.h0(var1.z7(), com.aspose.slides.ms.System.c4.a6)
            && com.aspose.slides.ms.System.c4.h0(var1.z7(), com.aspose.slides.ms.System.c4.u3)) {
            var1.n5(com.aspose.slides.ms.System.c4.u3.l6());
            this.n5("'all' must have 'minOccurs' value of 0 or 1.", var1);
         }

         if (com.aspose.slides.ms.System.c4.h0(var1.v4(), com.aspose.slides.ms.System.c4.u3)) {
            var1.l6(com.aspose.slides.ms.System.c4.u3.l6());
            this.n5("'all' must have {max occurs}=1.", var1);
         }

         z4 var2 = ((u0)var1).n5();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            v1 var4 = (v1)var2.n5(var3);
            if (com.aspose.slides.ms.System.c4.h0(var4.v4(), com.aspose.slides.ms.System.c4.a6)
               && com.aspose.slides.ms.System.c4.h0(var4.v4(), com.aspose.slides.ms.System.c4.u3)) {
               var4.l6(com.aspose.slides.ms.System.c4.u3.l6());
               this.n5("The {max occurs} of all the particles in the {particles} of an all group must be 0 or 1.", var4);
            }

            this.n5(var4, var1);
            this.l6(var4);
         }
      } else {
         if (com.aspose.slides.ms.System.c4.t2(var1.z7(), var1.v4())) {
            var1.n5(var1.v4().l6());
            this.n5("minOccurs value cannot be greater than maxOccurs value.", var1);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, d4.class)) {
            z4 var6 = ((d4)var1).n5();

            for (int var8 = 0; var8 < var6.size(); var8++) {
               this.n5(var6.n5(var8), var1);
               v1 var11 = com.aspose.slides.internal.v6g.k5.n5(var6.n5(var8), v1.class);
               if (var11 != null) {
                  this.l6(var11);
               } else {
                  this.n5((c1)var6.n5(var8));
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f1s.class)) {
            z4 var7 = ((f1s)var1).n5();

            for (int var9 = 0; var9 < var7.size(); var9++) {
               this.n5(var7.n5(var9), var1);
               v1 var12 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(var9), v1.class);
               if (var12 != null) {
                  this.l6(var12);
               } else {
                  this.n5((c1)var7.n5(var9));
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, e1.class)) {
            e1 var10 = (e1)var1;
            if (var10.n5().k5()) {
               this.n5("The '{0}' attribute is either invalid or missing.", "ref", var10);
            } else {
               this.n5(var10, "ref", var10.n5());
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f7.class)) {
            try {
               ((f7)var1).k5(this.k5);
            } catch (FormatException var5) {
               this.n5(
                  "The value of the namespace attribute of the element or attribute wildcard is invalid - {0}", new String[]{var5.getMessage()}, var5, var1
               );
            }
         }
      }

      this.u3(var1);
      this.l6(var1);
   }

   private void n5(z4 var1, k9 var2, x4 var3) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.n5(var1.n5(var4), var3);
         l2 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(var4), l2.class);
         if (var5 != null) {
            this.l6(var5);
         } else {
            k0 var6 = (k0)var1.n5(var4);
            if (var6.n5().k5()) {
               this.n5("The '{0}' attribute is either invalid or missing.", "ref", var6);
            } else {
               this.n5(var6, "ref", var6.n5());
            }

            this.u3(var1.n5(var4));
            this.l6(var1.n5(var4));
         }
      }

      if (var2 != null) {
         try {
            this.n5(var2, var3);
            this.u3(var2);
            var2.k5(this.k5);
         } catch (FormatException var7) {
            this.n5("The value of the namespace attribute of the element or attribute wildcard is invalid - {0}", new String[]{var7.getMessage()}, var7, var2);
         }

         this.l6(var2);
      }
   }

   private void l6(x4 var1) {
      if (var1.y2() != null) {
         try {
            var1.u3(this.n5().n5(com.aspose.slides.ms.System.Xml.f4.k5(var1.y2())));
         } catch (XmlException var4) {
            this.n5("Invalid 'id' attribute value: {0}", new String[]{var4.getMessage()}, var4, var1);
            return;
         } catch (ArgumentNullException var5) {
            this.n5("Invalid 'id' attribute value: {0}", com.aspose.slides.ms.System.Xml.v3.n5("Value cannot be null."), var1);
            return;
         }

         try {
            this.a6.z8().addItem(var1.y2(), var1);
         } catch (ArgumentException var3) {
            this.n5("Duplicate ID attribute.", var1);
         }
      }
   }

   private void k5(x4 var1) {
      String var2 = var1.ae_();
      if (var2 == null || var2.length() == 0) {
         this.n5("Invalid 'name' attribute value '{0}': '{1}'.", (String)null, com.aspose.slides.ms.System.Xml.v3.n5("Value cannot be null."), var1);
      }

      var2 = com.aspose.slides.ms.System.Xml.a8.n5(var2);
      int var3 = com.aspose.slides.ms.System.Xml.y5.u3(var2, 0);
      if (var3 != var2.length()) {
         String[] var4 = XmlException.buildCharExceptionArgs(var2, var3);
         String var5 = com.aspose.slides.ms.System.Xml.v3.n5(
            "The '{0}' character, hexadecimal value {1}, at position {2} within the name, cannot be included in a name.", var4[0], var4[1], var3
         );
         this.n5("Invalid 'name' attribute value '{0}': '{1}'.", var2, var5, var1);
      } else {
         var1.u9(this.n5().n5(var2));
      }
   }

   private void n5(x4 var1, String var2, com.aspose.slides.ms.System.Xml.k6 var3) {
      try {
         var3.u3();
         var3.n5(this.n5());
         if (this.a6.m3() && var3.n5().length() == 0) {
            var3.n5(this.a6.a6());
         }

         if (this.n3.get_Item(var3.n5()) == null) {
            this.n5("Namespace '{0}' is not available to be referenced in this Schema.", var3.n5(), var1, 1);
         }
      } catch (FormatException var5) {
         this.n5("Invalid '{0}' attribute: '{1}'.", new String[]{var2, var5.getMessage()}, var5, var1);
      } catch (XmlException var6) {
         this.n5("Invalid '{0}' attribute: '{1}'.", new String[]{var2, var6.getMessage()}, var6, var1);
      }
   }

   private com.aspose.slides.ms.System.r8 n5(a9 var1, String var2) {
      return var2.length() == 0 ? null : this.z3.n5(var1.m1(), var2);
   }

   private Object n5(com.aspose.slides.ms.System.r8 var1) {
      return this.z3.n5(var1, null, null);
   }

   private a9 n5(String var1, a9 var2) {
      x8 var3 = new x8(var1, var2);
      a9 var4 = (a9)this.x8.get_Item(var3);
      if (var4 == null) {
         var4 = var2.c4();
         var4.u3(true);
         var4.n5(var1);
         this.x8.addItem(var3, var4);
         var4.h0(var2.p8());
         var2.u9(false);
      }

      return var4;
   }

   private void n5(x4 var1, x4 var2) {
      var1.n5(var2);
   }

   private void u3(x4 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, d8.class)) {
         d8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, d8.class);
         q4 var3 = var2.u3();
         if (var3 != null) {
            this.n5(var3);
            var3.n5(var1);
         }
      }
   }

   private void n5(q4 var1) {
      this.l6(var1);

      for (int var2 = 0; var2 < var1.l6().size(); var2++) {
         var1.l6().n5(var2).n5((x4)var1);
      }
   }
}
