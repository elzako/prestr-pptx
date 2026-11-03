package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public final class a2 extends h0 {
   private a9 n5;
   private String l6;
   private boolean k5 = false;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private Hashtable c8;
   private Hashtable t2;
   private String s7;
   private com.aspose.slides.ms.System.Xml.o8 x8 = null;

   public a2(com.aspose.slides.ms.System.Xml.z9 var1, o2 var2, b4 var3) {
      super(var1, var2, var3);
   }

   public final boolean n5(a9 var1, String var2, boolean var3, v2 var4) {
      this.n5 = var1;
      this.s7 = this.n5().n5("xmlns");
      this.n5(var1);
      if (var3 && this.x8 != null) {
         this.c8 = new Hashtable();
         if (var1.m1() != null) {
            this.c8.addItem(var1.m1(), var1.m1());
         }

         this.n5(var1, var4);
      }

      this.n5((x4)var1);
      this.n5(var1, var2, 0);
      if (!this.a6()) {
         var1.l6(true);

         for (int var5 = 0; var5 < var1.h0().size(); var5++) {
            h7 var6 = (h7)var1.h0().n5(var5);
            if (var6.l6() != null) {
               var6.l6().l6(true);
            }
         }
      }

      return !this.a6();
   }

   private void n5(a9 var1) {
      if (!var1.e5()) {
         var1.u9(true);

         for (int var2 = 0; var2 < var1.h0().size(); var2++) {
            h7 var3 = (h7)var1.h0().n5(var2);
            if (var3.l6() != null) {
               this.n5(var3.l6());
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var3, f6.class)) {
               f6 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, f6.class);
               var4.h0().n5();
               var4.t2().n5();
               var4.c8().n5();
            }
         }

         var1.n3().n5();
         var1.y4().n5();
         var1.e2().n5();
         var1.t9().n5();
         var1.t4().n5();
         var1.q0().n5();
         var1.z8().clear();
         var1.z3().n5();
         var1.u9(false);
      }
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.x8 = var1;
   }

   private void n5(a9 var1, v2 var2) {
      if (!var1.e5()) {
         var1.u9(true);

         for (int var3 = 0; var3 < var1.h0().size(); var3++) {
            h7 var4 = (h7)var1.h0().n5(var3);
            Object var5 = null;
            if (var4.l6() != null) {
               if (com.aspose.slides.internal.v6g.k5.l6(var4, g0.class) && "http://www.w3.org/XML/1998/namespace".equals(((g0)var4).u9())) {
                  this.k5 = true;
               } else {
                  var5 = var4.u3();
                  if (var5 != null && this.c8.get_Item(var5) == null) {
                     this.c8.addItem(var5, var5);
                  }

                  this.n5(var4.l6(), var2);
               }
            } else {
               if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var4, g0.class)) {
                  g0 var6 = (g0)var4;
                  String var7 = var6.u9() != null ? var6.u9() : com.aspose.slides.ms.System.d1.n5;
                  var4.n5(var2.n5(var7));
                  if (var4.l6() != null) {
                     var4.n5(var4.l6().r4());
                     if (var4.l6().m1() != null && this.c8.get_Item(var4.l6().m1()) == null) {
                        this.c8.addItem(var4.l6().m1(), var4.l6().m1());
                     }

                     Object var22 = null;

                     for (int var24 = 0; var24 < var4.l6().h0().size(); var24++) {
                        h7 var25 = (h7)var4.l6().h0().n5(var24);
                        if (com.aspose.slides.internal.v6g.k5.l6(var25, g0.class)) {
                           g0 var11 = (g0)var25;
                           var22 = var11.u3() != null ? var11.u3() : (var11.l6() != null && var11.l6().m1() != null ? var11.l6().m1() : null);
                           if (var22 != null) {
                              if (this.c8.get_Item(var22) != null) {
                                 var11.n5((com.aspose.slides.internal.b8c.a9)null);
                              } else {
                                 this.c8.addItem(var22, var22);
                              }
                           }
                        }
                     }
                     continue;
                  }
               }

               if (!com.aspose.slides.internal.v6g.k5.l6(var4, g0.class) || !"http://www.w3.org/XML/1998/namespace".equals(((g0)var4).u9())) {
                  String var20 = var4.n5();
                  if (var20 != null) {
                     com.aspose.slides.ms.System.r8 var21 = this.n5(var1, var20);
                     if (var21 != null && this.c8.get_Item(var21) == null) {
                        com.aspose.slides.internal.z0k.t4 var8 = this.n5(var21);
                        if (var8 != null) {
                           var4.n5(var21);
                           this.c8.addItem(var21, var21);
                           com.aspose.slides.ms.System.Xml.p5 var9 = new com.aspose.slides.ms.System.Xml.p5(var21.toString(), var8, this.n5());
                           var9.n5(this.x8);

                           try {
                              n7 var10 = new n7(3, this.n5(), this.l6(), this.k5());
                              var10.n5(var9, null);

                              while (var9.u9()) {
                              }

                              var4.n5(var10.l6());
                              this.n5(var4.l6(), var2);
                           } catch (XmlSchemaException var16) {
                              this.l6(
                                 new XmlSchemaException(
                                    "Cannot load the Schema for the namespace '{0}' - {1}",
                                    new String[]{var20, var16.getMessage()},
                                    var16.getSourceUri(),
                                    var16.getLineNumber(),
                                    var16.getLinePosition()
                                 ),
                                 0
                              );
                           } catch (RuntimeException var17) {
                              this.n5("Cannot resolve the 'schemaLocation' attribute.", var4, 1);
                           } finally {
                              var9.w1();
                           }
                        } else {
                           this.n5("Cannot resolve the 'schemaLocation' attribute.", var4, 1);
                        }
                     }
                  }
               } else if (!this.k5) {
                  this.k5 = true;
                  var4.n5(t5.h0());
               }
            }
         }

         var1.u9(false);
      }
   }

   private void l6(a9 var1) {
      this.t2 = new Hashtable();
      this.t2.addItem("http://www.w3.org/2001/XMLSchema", "http://www.w3.org/2001/XMLSchema");
      this.t2.addItem(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);

      for (int var2 = 0; var2 < var1.h0().size(); var2++) {
         g0 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.h0().n5(var2), g0.class);
         if (var3 != null) {
            String var4 = var3.u9();
            if (var4 != null && this.t2.get_Item(var4) == null) {
               this.t2.addItem(var4, var4);
            }
         }
      }

      if (var1.a6() != null && this.t2.get_Item(var1.a6()) == null) {
         this.t2.addItem(var1.a6(), var1.a6());
      }
   }

   private void n5(a9 var1, String var2, int var3) {
      if (!var1.e5()) {
         var1.u9(true);
         String var4 = var1.a6();
         if (var4 != null) {
            String var5 = this.n5().n5(var4);
            var4 = var5;
            var1.n5(var5);
            if (var4.length() == 0) {
               this.n5("The targetNamespace attribute cannot have empty string as its value.", var1);
            } else {
               try {
                  com.aspose.slides.ms.System.Xml.f4.z8(var4);
               } catch (RuntimeException var79) {
                  this.n5("The Namespace '{0}' is an invalid URI.", var1.a6(), var1);
               }
            }
         }

         if (var1.u9() != null) {
            try {
               com.aspose.slides.ms.System.Xml.f4.a6(var1.u9());
            } catch (RuntimeException var78) {
               this.n5("The '{0}' attribute has an invalid value according to its data type.", "version", var1);
            }
         }

         switch (var3) {
            case 0:
               if (var2 == null && var1.a6() != null) {
                  var2 = var1.a6();
               } else if (var1.a6() == null && var2 != null && var2.length() == 0) {
                  var2 = null;
               }

               if (!com.aspose.slides.ms.System.d1.a6(var2, var1.a6())) {
                  this.n5("The targetNamespace parameter '{0}' should be the same value as the targetNamespace '{1}' of the Schema.", var2, var1.a6(), var1);
               }
               break;
            case 1:
               if (var1.a6() != null && !com.aspose.slides.ms.System.d1.a6(var2, var1.a6())) {
                  this.n5(
                     "The targetNamespace '{0}' of included/redefined Schema should be the same as the targetNamespace '{1}' of the including Schema.",
                     var2,
                     var1.a6(),
                     var1
                  );
               }
               break;
            case 2:
               if (!com.aspose.slides.ms.System.d1.a6(var2, var1.a6())) {
                  this.n5(
                     "The namespace attribute '{0}' of an import should be the same value as the targetNamespace '{1}' of the imported Schema.",
                     var2,
                     var1.a6(),
                     var1
                  );
               }
         }

         for (int var87 = 0; var87 < var1.h0().size(); var87++) {
            h7 var6 = (h7)var1.h0().n5(var87);
            this.n5(var6, var1);
            this.k5(var6);
            String var7 = var6.n5();
            if (var7 != null) {
               try {
                  com.aspose.slides.ms.System.Xml.f4.z8(var7);
               } catch (RuntimeException var77) {
                  this.n5("The SchemaLocation '{0}' is an invalid URI.", var7, var6);
               }
            } else if ((com.aspose.slides.internal.v6g.k5.l6(var6, f6.class) || com.aspose.slides.internal.v6g.k5.l6(var6, i5.class)) && var6.l6() == null) {
               this.n5("The required attribute '{0}' is missing.", "schemaLocation", var6);
            }

            if (var6.l6() != null) {
               if (com.aspose.slides.internal.v6g.k5.l6(var6, f6.class)) {
                  this.n5(var6.l6(), var1.a6(), 1);
               } else if (com.aspose.slides.internal.v6g.k5.l6(var6, g0.class)) {
                  if (((g0)var6).u9() == null && var1.a6() == null) {
                     this.n5("The enclosing <Schema> must have a targetNamespace, if the Namespace attribute is absent on the import element.", var6);
                  } else if (com.aspose.slides.ms.System.d1.a6(((g0)var6).u9(), var1.a6())) {
                     this.n5("Namespace attribute of an import must not match the real value of the enclosing targetNamespace of the <Schema>.", var6);
                  }

                  this.n5(var6.l6(), ((g0)var6).u9(), 2);
               } else {
                  this.n5(var6.l6(), var1.a6(), 1);
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var6, g0.class)) {
               String var8 = ((g0)var6).u9();
               if (var8 != null) {
                  if (var8.length() == 0) {
                     this.n5("The namespace attribute cannot have empty string as its value.", var8, var6);
                  } else {
                     try {
                        com.aspose.slides.ms.System.Xml.f4.z8(var8);
                     } catch (FormatException var76) {
                        this.n5("The Namespace '{0}' is an invalid URI.", var8, var6);
                     }
                  }
               }
            }
         }

         this.l6(var1);
         this.l6 = var2 == null ? com.aspose.slides.ms.System.d1.n5 : var2;
         if (var1.l6() == 255) {
            this.u9 = 255;
         } else if (var1.l6() == 256) {
            this.u9 = 0;
         } else {
            if ((var1.l6() & -8) != 0) {
               this.n5("The values 'list' and 'union' are invalid for the blockDefault attribute.", var1);
            }

            this.u9 = var1.l6() & 7;
         }

         if (var1.k5() == 255) {
            this.h0 = 255;
         } else if (var1.k5() == 256) {
            this.h0 = 0;
         } else {
            if ((var1.k5() & -31) != 0) {
               this.n5("The value 'substitution' is invalid for the finalDefault attribute.", var1);
            }

            this.h0 = var1.k5() & 30;
         }

         this.u3 = var1.u3();
         if (this.u3 == 0) {
            this.u3 = 2;
         }

         this.a6 = var1.n5();
         if (this.a6 == 0) {
            this.a6 = 2;
         }

         for (int var88 = 0; var88 < var1.h0().size(); var88++) {
            h7 var90 = (h7)var1.h0().n5(var88);
            if (com.aspose.slides.internal.v6g.k5.l6(var90, f6.class)) {
               f6 var93 = (f6)var90;
               if (var90.l6() != null) {
                  this.n5(var93);
               } else {
                  for (int var96 = 0; var96 < var93.u9().size(); var96++) {
                     if (!com.aspose.slides.internal.v6g.k5.l6(var93.u9().n5(var96), q4.class)) {
                        this.n5("'SchemaLocation' must successfully resolve if <redefine> contains any child other than <annotation>.", var93);
                        break;
                     }
                  }
               }
            }

            a9 var94 = var90.l6();
            if (var94 != null) {
               IEnumerator var97 = var94.t9().k5().iterator();

               try {
                  while (var97.hasNext()) {
                     v1 var9 = (v1)var97.next();
                     this.n5(var1.t9(), var9.z8(), var9);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var97, IDisposable.class)) {
                     ((IDisposable)var97).dispose();
                  }
               }

               IEnumerator var104 = var94.n3().k5().iterator();

               try {
                  while (var104.hasNext()) {
                     l2 var10 = (l2)var104.next();
                     this.n5(var1.n3(), var10.n3(), var10);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var104, IDisposable.class)) {
                     ((IDisposable)var104).dispose();
                  }
               }

               IEnumerator var105 = var94.t4().k5().iterator();

               try {
                  while (var105.hasNext()) {
                     f3 var11 = (f3)var105.next();
                     this.n5(var1.t4(), var11.u9(), var11);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var105, IDisposable.class)) {
                     ((IDisposable)var105).dispose();
                  }
               }

               IEnumerator var106 = var94.y4().k5().iterator();

               try {
                  while (var106.hasNext()) {
                     j7 var12 = (j7)var106.next();
                     this.n5(var1.y4(), var12.h0(), var12);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var106, IDisposable.class)) {
                     ((IDisposable)var106).dispose();
                  }
               }

               IEnumerator var107 = var94.e2().k5().iterator();

               try {
                  while (var107.hasNext()) {
                     j9e var13 = (j9e)var107.next();
                     this.n5(var1.e2(), var13.r4(), var13);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var107, IDisposable.class)) {
                     ((IDisposable)var107).dispose();
                  }
               }

               IEnumerator var108 = var94.q0().k5().iterator();

               try {
                  while (var108.hasNext()) {
                     y3 var14 = (y3)var108.next();
                     this.n5(var1.q0(), var14.h0(), var14);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var108, IDisposable.class)) {
                     ((IDisposable)var108).dispose();
                  }
               }
            }

            this.n5(var90);
         }

         List var89 = new List();

         for (int var91 = 0; var91 < var1.c8().size(); var91++) {
            this.n5(var1.c8().n5(var91), var1);
            l2 var95 = com.aspose.slides.internal.v6g.k5.n5(var1.c8().n5(var91), l2.class);
            if (var95 != null) {
               this.n5(var95);
               this.n5(var1.n3(), var95.n3(), var95);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), j7.class)) {
               j7 var98 = (j7)var1.c8().n5(var91);
               this.l6(var98);
               this.n5(var1.y4(), var98.h0(), var98);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), l9.class)) {
               l9 var99 = (l9)var1.c8().n5(var91);
               this.n5(var99, false);
               this.n5(var1.e2(), var99.r4(), var99);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), u1s.class)) {
               u1s var100 = (u1s)var1.c8().n5(var91);
               this.n5(var100, false);
               this.n5(var1.e2(), var100.r4(), var100);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), v1.class)) {
               v1 var101 = (v1)var1.c8().n5(var91);
               this.n5(var101);
               this.n5(var1.t9(), var101.z8(), var101);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), f3.class)) {
               f3 var102 = (f3)var1.c8().n5(var91);
               this.l6(var102);
               this.n5(var1.t4(), var102.u9(), var102);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), y3.class)) {
               y3 var103 = (y3)var1.c8().n5(var91);
               this.n5(var103);
               this.n5(var1.q0(), var103.h0(), var103);
            } else if (!com.aspose.slides.internal.v6g.k5.l6(var1.c8().n5(var91), q4.class)) {
               this.n5(
                  "The Schema items collection cannot contain an object of type 'XmlSchemaInclude', 'XmlSchemaImport', or 'XmlSchemaRedefine'.",
                  var1.c8().n5(var91)
               );
               var89.addItem(var1.c8().n5(var91));
            }
         }

         for (int var92 = 0; var92 < var89.size(); var92++) {
            var1.c8().l6((x4)var89.get_Item(var92));
         }

         var1.u9(false);
      }
   }

   private void n5(f6 var1) {
      for (int var2 = 0; var2 < var1.u9().size(); var2++) {
         this.n5(var1.u9().n5(var2), var1);
         f3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.u9().n5(var2), f3.class);
         if (var3 != null) {
            this.l6(var3);
            if (var1.t2().k5(var3.u9()) != null) {
               this.n5("Double redefine for group.", var3);
            } else {
               this.n5(var1.t2(), var3.u9(), var3);
               var3.n5((f3)var1.l6().t4().k5(var3.u9()));
               if (var3.c8() != null) {
                  this.n5(var3);
               } else {
                  this.n5("No group to redefine.", var3);
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1.u9().n5(var2), j7.class)) {
            j7 var4 = (j7)var1.u9().n5(var2);
            this.l6(var4);
            if (var1.h0().k5(var4.h0()) != null) {
               this.n5("Double redefine for attribute group.", var4);
            } else {
               this.n5(var1.h0(), var4.h0(), var4);
               var4.n5((j7)var1.l6().y4().k5(var4.h0()));
               if (var4.s7() != null) {
                  this.n5(var4);
               } else {
                  this.n5("No attribute group to redefine.", var4);
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1.u9().n5(var2), l9.class)) {
            l9 var12 = (l9)var1.u9().n5(var2);
            this.n5(var12, false);
            if (var1.c8().k5(var12.r4()) != null) {
               this.n5("Double redefine for complex type.", var12);
            } else {
               this.n5(var1.c8(), var12.r4(), var12);
               j9e var5 = (j9e)var1.l6().e2().k5(var12.r4());
               if (var5 != null) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var5, l9.class)) {
                     var12.l6(var5);
                     this.n5(var12);
                  } else {
                     this.n5("Cannot redefine a simple type as complex type.", var12);
                  }
               } else {
                  this.n5("No complex type to redefine.", var12);
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1.u9().n5(var2), u1s.class)) {
            u1s var13 = (u1s)var1.u9().n5(var2);
            this.n5(var13, false);
            if (var1.c8().k5(var13.r4()) != null) {
               this.n5("Double redefine for simple type.", var13);
            } else {
               this.n5(var1.c8(), var13.r4(), var13);
               j9e var14 = (j9e)var1.l6().e2().k5(var13.r4());
               if (var14 != null) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var14, u1s.class)) {
                     var13.l6(var14);
                     this.n5(var13);
                  } else {
                     this.n5("Cannot redefine a complex type as simple type.", var13);
                  }
               } else {
                  this.n5("No simple type to redefine.", var13);
               }
            }
         }
      }

      for (Object recoveredElement$var9$22603 : (Iterable)var1.t2()) {
         DictionaryEntry var9 = (DictionaryEntry)recoveredElement$var9$22603;
         var1.l6().t4().l6((com.aspose.slides.ms.System.Xml.k6)var9.getKey(), (x4)var9.getValue());
      }

      for (Object recoveredElement$var10$22769 : (Iterable)var1.h0()) {
         DictionaryEntry var10 = (DictionaryEntry)recoveredElement$var10$22769;
         var1.l6().y4().l6((com.aspose.slides.ms.System.Xml.k6)var10.getKey(), (x4)var10.getValue());
      }

      for (Object recoveredElement$var11$22938 : (Iterable)var1.c8()) {
         DictionaryEntry var11 = (DictionaryEntry)recoveredElement$var11$22938;
         var1.l6().e2().l6((com.aspose.slides.ms.System.Xml.k6)var11.getKey(), (x4)var11.getValue());
      }
   }

   private int n5(z4 var1, com.aspose.slides.ms.System.Xml.k6 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var1.size(); var4++) {
         e1 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(var4), e1.class);
         if (var5 != null) {
            if (com.aspose.slides.ms.System.Xml.k6.n5(var5.n5(), var2)) {
               if (com.aspose.slides.ms.System.c4.h0(var5.z7(), com.aspose.slides.ms.System.c4.u3)
                  || com.aspose.slides.ms.System.c4.h0(var5.v4(), com.aspose.slides.ms.System.c4.u3)) {
                  this.n5("When group is redefined, the real value of both minOccurs and maxOccurs attribute must be 1 (or absent).", var5);
               }

               var3++;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(var4), g3.class)) {
            var3 += this.n5(((g3)var1.n5(var4)).n5(), var2);
         }

         if (var3 > 1) {
            break;
         }
      }

      return var3;
   }

   private void n5(f3 var1) {
      int var2 = 0;
      if (var1.l6() != null) {
         var2 = this.n5(var1.l6().n5(), var1.u9());
      }

      if (var2 > 1) {
         this.n5("Multiple self-reference within a group is redefined.", var1);
      }
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
         this.l6((x4)var1);
         var1.k5(new com.aspose.slides.ms.System.Xml.k6(var1.h0(), this.l6));
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
      this.n5((x4)var1);
   }

   private void l6(l2 var1) {
      if (var1.h0() != null) {
         this.l6((x4)var1);
         this.k5(var1);
         var1.k5(new com.aspose.slides.ms.System.Xml.k6(var1.h0(), var1.u9() != 1 && (var1.u9() != 0 || this.a6 != 1) ? null : this.l6));
      } else {
         this.k5((x4)var1);
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

      this.n5((x4)var1);
   }

   private void k5(l2 var1) {
      this.k5((x4)var1);
      if ("http://www.w3.org/2001/XMLSchema-instance".equals(this.n5.a6())) {
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

      if (com.aspose.slides.ms.System.d1.a6(var1.h0(), this.s7)) {
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
         this.l6((x4)var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.l6));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      this.n5(var1.l6(), var1.u9(), var1);
      this.k5(var1);
      this.n5((x4)var1);
   }

   private void n5(v1 var1) {
      if (var1.n3() != null) {
         this.l6((x4)var1);
         var1.u3(new com.aspose.slides.ms.System.Xml.k6(var1.n3(), this.l6));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      this.k5(var1);
      if (var1.c8() == 255) {
         var1.a6(255);
      } else if (var1.c8() == 256) {
         if (this.h0 == 255) {
            var1.a6(255);
         } else {
            var1.a6(this.h0 & 6);
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

      this.n5((x4)var1);
   }

   private void l6(v1 var1) {
      if (var1.n3() != null) {
         this.l6((x4)var1);
         this.k5(var1);
         var1.u3(new com.aspose.slides.ms.System.Xml.k6(var1.n3(), var1.x8() != 1 && (var1.x8() != 0 || this.u3 != 1) ? null : this.l6));
      } else {
         this.k5((x4)var1);
         if (var1.q0().k5()) {
            this.n5("For element declaration, either the name or the ref attribute must be present.", var1);
         } else {
            this.n5(var1, "ref", var1.q0());
         }

         if (!var1.m1().k5()
            || var1.n5()
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

      if (var1.n5()) {
         this.n5("The '{0}' attribute cannot be present.", "abstract", var1);
      }

      if (var1.c8() != 256) {
         this.n5("The '{0}' attribute cannot be present.", "final", var1);
      }

      if (!var1.z3().k5()) {
         this.n5("The '{0}' attribute cannot be present.", "substitutionGroup", var1);
      }

      this.n5((x4)var1);
   }

   private void k5(v1 var1) {
      this.k5((x4)var1);
      if (!var1.q0().k5()) {
         this.n5("The '{0}' attribute cannot be present.", "ref", var1);
      }

      if (var1.u9() == 255) {
         var1.u3(255);
      } else if (var1.u9() == 256) {
         if (this.u9 == 255) {
            var1.u3(255);
         } else {
            var1.u3(this.u9 & 7);
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
         this.n5(var1.m3().n5(var2), var1);
         this.n5((m2)var1.m3().n5(var2));
      }
   }

   private void n5(m2 var1) {
      boolean var2 = true;
      this.k5(var1);
      if (var1.n5() != null) {
         this.l6(var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.l6));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
         var2 = false;
      }

      if (this.n5.z3().k5(var1.h0()) != null) {
         this.n5("The identity constraint '{0}' has already been declared.", var1.h0().toString(), var1);
         var2 = false;
      } else {
         this.n5.z3().n5(var1.h0(), var1);
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
         this.n5((x4)var1);
         this.n5(var1.l6());
         this.n5(var1.l6(), var1);

         for (int var4 = 0; var4 < var1.u9().size(); var4++) {
            this.n5(var1.u9().n5(var4), var1);
            this.n5(var1.u9().n5(var4));
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
            this.l6(var1);
            var1.l6(new com.aspose.slides.ms.System.Xml.k6(var1.j5(), this.l6));
         } else {
            this.n5("The required attribute '{0}' is missing.", "name", var1);
         }

         if (var1.w1() == 255) {
            var1.a6(255);
         } else if (var1.w1() == 256) {
            if (this.h0 == 255) {
               var1.a6(255);
            } else {
               var1.a6(this.h0 & 28);
            }
         } else {
            if ((var1.w1() & -29) != 0) {
               this.n5("The values 'substitution' and 'extension' are invalid for the final attribute on simpleType.", var1);
            }

            var1.a6(var1.w1() & 28);
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

         this.k5(var3);
         this.n5(var3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), e5a.class)) {
         e5a var6 = (e5a)var1.n5();
         this.n5(var6, var1);
         if (var6.l6() != null) {
            if (!var6.n5().k5()) {
               this.n5("SimpleType list should have either the itemType attribute or a simpleType child, but not both.", var6);
            }

            this.n5(var6.l6(), var6);
            this.n5(var6.l6(), true);
         } else if (var6.n5().k5()) {
            this.n5("SimpleType list should have either the itemType attribute or a simpleType child to indicate the itemType of the list.", var6);
         } else {
            this.n5(var6, "itemType", var6.n5());
         }

         this.k5(var6);
         this.n5(var6);
      } else {
         d4n var7 = (d4n)var1.n5();
         this.n5(var7, var1);
         int var8 = var7.n5().size();
         if (var7.l6() != null) {
            var8 += var7.l6().length;

            for (int var5 = 0; var5 < var7.l6().length; var5++) {
               this.n5(var7, "memberTypes", var7.l6()[var5]);
            }
         }

         if (var8 == 0) {
            this.n5("Either the memberTypes attribute must be non-empty or there must be at least one simpleType child.", var7);
         }

         for (int var9 = 0; var9 < var7.n5().size(); var9++) {
            this.n5(var7.n5().n5(var9), var7);
            this.n5((u1s)var7.n5().n5(var9), true);
         }

         this.k5(var7);
         this.n5(var7);
      }

      this.n5((x4)var1);
   }

   private void n5(l9 var1, boolean var2) {
      if (var2) {
         if (var1.j5() != null) {
            this.n5("The '{0}' attribute cannot be present.", "name", var1);
         }
      } else {
         if (var1.j5() != null) {
            this.l6(var1);
            var1.l6(new com.aspose.slides.ms.System.Xml.k6(var1.j5(), this.l6));
         } else {
            this.n5("The required attribute '{0}' is missing.", "name", var1);
         }

         if (var1.t2() == 255) {
            var1.l6(255);
         } else if (var1.t2() == 256) {
            var1.l6(this.u9 & 6);
         } else {
            if ((var1.t2() & -7) != 0) {
               this.n5("The values 'substitution', 'list', and 'union' are invalid for the block attribute on complexType.", var1);
            }

            var1.l6(var1.t2() & 6);
         }

         if (var1.w1() == 255) {
            var1.a6(255);
         } else if (var1.w1() == 256) {
            if (this.h0 == 255) {
               var1.a6(255);
            } else {
               var1.a6(this.h0 & 6);
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
         this.k5(var1.x8());
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
               this.k5(var3.n5());
               if (com.aspose.slides.internal.v6g.k5.l6(var3.n5(), i0e.class)) {
                  i0e var4 = (i0e)var3.n5();
                  if (var4.n5().k5()) {
                     this.n5("The '{0}' attribute is either invalid or missing.", "base", var4);
                  } else {
                     this.n5(var4, "base", var4.n5());
                  }

                  this.n5(var4.l6(), var4.u9(), var4);
                  this.n5(var4);
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
                  this.n5(var6);
               }
            }

            this.n5(var3);
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
               this.k5(var5.l6());
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
                  this.n5(var7);
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
                  this.n5(var8);
               }

               this.n5(var5);
            }
         }
      } else {
         if (var1.n3() != null) {
            this.n5(var1.n3(), var1);
            this.n5(var1.n3());
         }

         this.n5(var1.y4(), var1.e2(), var1);
      }

      this.n5((x4)var1);
   }

   private void l6(f3 var1) {
      if (var1.n5() != null) {
         this.l6((x4)var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.l6));
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
         this.k5(var1);
         this.n5((x4)var1);
      }
   }

   private void n5(y3 var1) {
      if (var1.n5() != null) {
         this.l6(var1);
         var1.n5(new com.aspose.slides.ms.System.Xml.k6(var1.n5(), this.l6));
      } else {
         this.n5("The required attribute '{0}' is missing.", "name", var1);
      }

      if (var1.l6() != null) {
         try {
            com.aspose.slides.ms.System.Xml.f4.z8(var1.l6());
         } catch (RuntimeException var4) {
            this.n5("Public attribute '{0}' is an invalid URI.", var1.l6(), var1);
         }
      } else {
         this.n5("The required attribute '{0}' is missing.", "public", var1);
      }

      if (var1.u9() != null) {
         try {
            com.aspose.slides.ms.System.Xml.f4.z8(var1.u9());
         } catch (RuntimeException var3) {
            this.n5("System attribute '{0}' is an invalid URI.", var1.u9(), var1);
         }
      }

      this.k5(var1);
      this.n5((x4)var1);
   }

   private void n5(c1 var1) {
      u0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, u0.class);
      if (var2 != null) {
         if (com.aspose.slides.ms.System.c4.h0(var1.z7(), com.aspose.slides.ms.System.c4.a6)
            && com.aspose.slides.ms.System.c4.h0(var1.z7(), com.aspose.slides.ms.System.c4.u3)) {
            var1.n5(com.aspose.slides.ms.System.c4.u3.l6());
            this.n5("'all' must have 'minOccurs' value of 0 or 1.", var1);
         }

         if (com.aspose.slides.ms.System.c4.h0(var1.v4(), com.aspose.slides.ms.System.c4.u3)) {
            var1.l6(com.aspose.slides.ms.System.c4.u3.l6());
            this.n5("'all' must have {max occurs}=1.", var1);
         }

         for (int var3 = 0; var3 < var2.n5().size(); var3++) {
            v1 var4 = (v1)var2.n5().n5(var3);
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

         d4 var8 = com.aspose.slides.internal.v6g.k5.n5(var1, d4.class);
         if (var8 != null) {
            z4 var9 = var8.n5();

            for (int var5 = 0; var5 < var9.size(); var5++) {
               this.n5(var9.n5(var5), var1);
               v1 var6 = com.aspose.slides.internal.v6g.k5.n5(var9.n5(var5), v1.class);
               if (var6 != null) {
                  this.l6(var6);
               } else {
                  this.n5((c1)var9.n5(var5));
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f1s.class)) {
            z4 var10 = ((f1s)var1).n5();

            for (int var12 = 0; var12 < var10.size(); var12++) {
               this.n5(var10.n5(var12), var1);
               v1 var13 = com.aspose.slides.internal.v6g.k5.n5(var10.n5(var12), v1.class);
               if (var13 != null) {
                  this.l6(var13);
               } else {
                  this.n5((c1)var10.n5(var12));
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, e1.class)) {
            e1 var11 = (e1)var1;
            if (var11.n5().k5()) {
               this.n5("The '{0}' attribute is either invalid or missing.", "ref", var11);
            } else {
               this.n5(var11, "ref", var11.n5());
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f7.class)) {
            try {
               ((f7)var1).a6(this.l6);
            } catch (RuntimeException var7) {
               this.n5("Invalid namespace in 'any'.", var1);
            }
         }
      }

      this.k5(var1);
      this.n5((x4)var1);
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

            this.k5(var1.n5(var4));
            this.n5(var1.n5(var4));
         }
      }

      if (var2 != null) {
         try {
            this.n5(var2, var3);
            this.k5(var2);
            var2.a6(this.l6);
         } catch (RuntimeException var7) {
            this.n5("Invalid namespace in 'anyAttribute'.", var2);
         }

         this.n5(var2);
      }
   }

   private void n5(x4 var1) {
      if (var1.y2() != null) {
         try {
            var1.u3(this.n5().n5(com.aspose.slides.ms.System.Xml.f4.k5(var1.y2())));
            if (this.n5.z8().get_Item(var1.y2()) != null) {
               this.n5("Duplicate ID attribute.", var1);
            } else {
               this.n5.z8().addItem(var1.y2(), var1);
            }
         } catch (RuntimeException var3) {
            this.n5("Invalid 'id' attribute value: {0}", var3.getMessage(), var1);
         }
      }
   }

   private void l6(x4 var1) {
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
         if (this.t2.get_Item(var3.n5()) == null) {
            this.n5("Namespace '{0}' is not available to be referenced in this Schema.", var3.n5(), var1, 1);
         }
      } catch (RuntimeException var5) {
         this.n5("Invalid '{0}' attribute: '{1}'.", var2, var5.getMessage(), var1);
      }
   }

   private void n5(x4 var1, x4 var2) {
      var1.n5(var2);
   }

   private void k5(x4 var1) {
      d8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, d8.class);
      if (var2 != null && var2.u3() != null) {
         var2.u3().n5(var1);

         for (int var3 = 0; var3 < var2.u3().l6().size(); var3++) {
            var2.u3().l6().n5(var3).n5((x4)var2.u3());
         }
      }
   }

   private com.aspose.slides.ms.System.r8 n5(a9 var1, String var2) {
      try {
         return this.x8.n5(var1.m1(), var2);
      } catch (RuntimeException var4) {
         return null;
      }
   }

   private com.aspose.slides.internal.z0k.t4 n5(com.aspose.slides.ms.System.r8 var1) {
      try {
         return (com.aspose.slides.internal.z0k.t4)this.x8.n5(var1, null, null);
      } catch (RuntimeException var3) {
         return null;
      }
   }
}
