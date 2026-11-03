package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.exceptions.XmlSchemaValidationException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class v7u {
   private k0t k5;
   private int u3;
   private int a6 = -1;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private x0 s7;
   private com.aspose.slides.ms.System.Xml.z7 x8;
   private Hashtable n3;
   private com.aspose.slides.ms.System.Xml.a0 y4;
   private x5 e2;
   private int t9;
   private Hashtable z1;
   private h9 t4;
   private Hashtable q0;
   private s9 z3;
   private com.aspose.slides.ms.System.Xml.k6 m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private x4 w1;
   private com.aspose.slides.internal.l7h.a5 r4;
   private b4 c4;
   private Object y2;
   private com.aspose.slides.ms.System.Xml.z9 y1;
   private com.aspose.slides.ms.System.Xml.f0 a0;
   private com.aspose.slides.ms.System.Xml.f0 d2;
   private com.aspose.slides.ms.System.Xml.o8 d5;
   private com.aspose.slides.ms.System.r8 s3;
   private String p8;
   private com.aspose.slides.ms.System.Xml.a3 f2;
   private int i1 = 3;
   private static AtomicReference<l2> e5 = new AtomicReference<>();
   private static AtomicReference<l2> b3 = new AtomicReference<>();
   private static AtomicReference<l2> o0 = new AtomicReference<>();
   private static AtomicReference<l2> z7 = new AtomicReference<>();
   private String v4;
   private String u6;
   private String t1;
   private String a5;
   private static final v5 h2 = v5.h0(10);
   private static final v5 v0 = v5.u9(0);
   private static final v5 f0 = v0.n5((j9e)null);
   private static c1[] a3 = new c1[0];
   private static l2[] p3 = new l2[0];
   private com.aspose.slides.ms.System.Xml.u4 x9 = com.aspose.slides.ms.System.Xml.u4.n5().l6();
   public static boolean[][] n5 = new boolean[][]{
      {true, true, false, false, false, false, false, false, false, false, false, false},
      {false, true, true, true, true, false, false, false, false, false, false, true},
      {false, false, false, false, false, false, false, false, false, false, false, true},
      {false, false, false, true, true, false, false, false, false, false, false, true},
      {false, false, false, true, false, true, true, false, false, true, true, false},
      {false, false, false, false, false, true, true, false, false, true, true, false},
      {false, false, false, false, true, false, false, true, true, true, true, false},
      {false, false, false, false, true, false, false, true, true, true, true, false},
      {false, false, false, false, true, false, false, true, true, true, true, false},
      {false, false, false, true, true, false, false, true, true, true, true, true},
      {false, false, false, true, true, false, false, true, true, true, true, true},
      {false, true, false, false, false, false, false, false, false, false, false, false}
   };
   private static String[] y0 = new String[]{
      "None",
      "Initialize",
      "top-level ValidateAttribute",
      "top-level ValidateText or ValidateWhitespace",
      "ValidateElement",
      "ValidateAttribute",
      "ValidateEndOfAttributes",
      "ValidateText",
      "ValidateWhitespace",
      "ValidateEndElement",
      "SkipToEndElement",
      "EndValidation"
   };
   private b4 j9;
   public final com.aspose.slides.internal.v6g.n5<b4> l6 = new x7n(this);

   public v7u(com.aspose.slides.ms.System.Xml.z9 var1, k0t var2, com.aspose.slides.ms.System.Xml.a3 var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("nameTable");
      }

      if (var2 == null) {
         throw new ArgumentNullException("schemas");
      }

      if (var3 == null) {
         throw new ArgumentNullException("namespaceResolver");
      }

      this.y1 = var1;
      this.f2 = var3;
      this.u3 = var4;
      if ((var4 & 1) == 0 && (var4 & 2) == 0) {
         this.k5 = var2;
      } else {
         this.k5 = new k0t(var1);
         this.k5.a6.l6(var2.t9());
         this.k5.n5(var2.k5());
         this.k5.n5(var2.e2());
         this.k5.n5(var2);
         this.n3 = new Hashtable();
      }

      this.n3();
   }

   private void n3() {
      this.y4 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.z1 = new Hashtable();
      this.k5(com.aspose.slides.ms.System.Xml.k6.n5);
      this.d2 = new com.aspose.slides.ms.System.Xml.o5();
      this.a0 = this.d2;
      this.y2 = this;
      this.t9 = 0;
      this.r4 = new com.aspose.slides.internal.l7h.a5(100);
      this.d5 = com.aspose.slides.internal.s5g.n5.l6();
      this.m1 = new com.aspose.slides.ms.System.Xml.k6();
      this.y4();
      this.c8();
      this.k7 = this.y1.n5("http://www.w3.org/2001/XMLSchema");
      this.m3 = this.y1.n5("http://www.w3.org/2001/XMLSchema-instance");
      this.z8 = this.y1.n5("http://www.w3.org/2000/xmlns/");
      this.j5 = this.y1.n5("http://www.w3.org/XML/1998/namespace");
      this.v4 = this.y1.n5("type");
      this.u6 = this.y1.n5("nil");
      this.t1 = this.y1.n5("schemaLocation");
      this.a5 = this.y1.n5("noNamespaceSchemaLocation");
   }

   private void y4() {
      this.u9 = true;
      this.h0 = true;

      while (this.y4.u3() > 1) {
         this.y4.l6();
      }

      this.a6 = -1;
      this.w1 = null;
      if (this.q0 != null) {
         this.q0.clear();
      }

      if (this.x8()) {
         this.n3.clear();
      }
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.d5 = var1;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.f0 var1) {
      if (var1 == null) {
         this.a0 = this.d2;
      } else {
         this.a0 = var1;
      }
   }

   public final void n5(com.aspose.slides.ms.System.r8 var1) {
      this.s3 = var1;
      this.p8 = this.s3.toString();
   }

   public final void n5(Object var1) {
      this.y2 = var1;
   }

   public final void n5(a9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Schema");
      }

      if ((this.u3 & 1) != 0) {
         String var2 = var1.a6();
         if (var2 == null) {
            var2 = com.aspose.slides.ms.System.d1.n5;
         }

         Hashtable var3 = this.k5.t2();
         DictionaryEntry[] var4 = (DictionaryEntry[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(DictionaryEntry.class), var3.size())
         );
         var3.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0);
         if (this.n3.get_Item(var2) != null && this.k5.n5(var1.m1(), var2, var4) == null) {
            this.n5(
               "An element or attribute information item has already been validated from the '{0}' namespace. It is an error if 'xsi:schemaLocation', 'xsi:noNamespaceSchemaLocation', or an inline Schema occurs for that namespace.",
               var2,
               0
            );
         }

         if (var1.w1() == 0) {
            try {
               this.k5.n5(var1);
               this.c8();
            } catch (XmlSchemaException var7) {
               this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1.m1().toString(), var7.getMessage()}, var7);
            }

            for (int var5 = 0; var5 < var1.y1().size(); var5++) {
               a9 var6 = (a9)var1.y1().get_Item(var5);
               var2 = var6.a6();
               if (var2 == null) {
                  var2 = com.aspose.slides.ms.System.d1.n5;
               }

               if (this.n3.get_Item(var2) != null && this.k5.n5(var6.m1(), var2, var4) == null) {
                  this.n5(
                     "An element or attribute information item has already been validated from the '{0}' namespace. It is an error if 'xsi:schemaLocation', 'xsi:noNamespaceSchemaLocation', or an inline Schema occurs for that namespace.",
                     var2,
                     0
                  );
                  this.k5.l6(var1);
                  break;
               }
            }
         }
      }
   }

   public final void n5() {
      if (this.t9 != 0 && this.t9 != 11) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("The transition from the '{0}' method to the '{1}' method is not allowed.", y0[this.t9], y0[1])
         );
      }

      this.t9 = 1;
      this.y4();
   }

   public final void n5(x4 var1) {
      if (this.t9 != 0 && this.t9 != 11) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("The transition from the '{0}' method to the '{1}' method is not allowed.", y0[this.t9], y0[1])
         );
      }

      if (var1 == null) {
         throw new ArgumentNullException("partialValidationType");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, v1.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, l2.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, j9e.class)) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.Xml.v3.n5("The partial validation type has to be 'XmlSchemaElement', 'XmlSchemaAttribute', or 'XmlSchemaType'.")
         );
      }

      this.t9 = 1;
      this.y4();
      this.w1 = var1;
   }

   public final void n5(String var1, String var2, j2 var3, String var4, String var5, String var6, String var7) {
      if (var1 == null) {
         throw new ArgumentNullException("localName");
      }

      if (var2 == null) {
         throw new ArgumentNullException("namespaceUri");
      }

      this.n5(4, y0[4]);
      this.m3();
      this.m1.l6(var1, var2);
      com.aspose.slides.ms.System.Xml.k6 var8 = this.m1;
      boolean var9 = false;
      boolean[] var10 = new boolean[]{false};
      Object var11 = this.n5(var8, var10);
      var9 = var10[0];
      t6 var12 = this.n5(var8, var11);
      this.k5(var8);
      if (var9) {
         this.e2.h0 = 2;
      }

      if ((this.u3 & 2) != 0 && this.d5 != null) {
         this.k5(var6, var7);
      }

      if (this.i1 != 1) {
         if (var12 == null && this.w1 == null) {
            var12 = this.s7.l6(var8);
         }

         boolean var13 = var12 != null;
         if (var4 != null || var5 != null) {
            boolean[] var14 = new boolean[]{var13};
            var12 = this.n5(var12, var4, var5, var14);
            var13 = var14[0];
         }

         if (var12 == null) {
            this.n5(var13);
         }
      }

      this.e2.c8 = var12;
      v1 var16 = null;
      j9e var17 = null;
      if (var12 != null) {
         this.t4();
         this.z1.clear();
         this.e2.k5 = this.i1 != 1;
         this.q0();
         var12.z1().n5(this.e2);
         var17 = var12.y1();
         var16 = this.z8();
      }

      if (var3 != null) {
         var3.n5(var17);
         var3.n5(var16);
         var3.l6(this.e2.n5);
         var3.n5(this.e2.h0);
      }

      if (this.x8() && this.n3.get_Item(var2) == null) {
         this.n3.addItem(var2, var2);
      }

      if (this.u9) {
         this.u9 = false;
      }
   }

   public final Object n5(String var1, String var2, k9m var3, j2 var4) {
      if (var3 == null) {
         throw new ArgumentNullException("attributeValue");
      } else {
         return this.n5(var1, var2, var3, null, var4);
      }
   }

   private Object n5(String var1, String var2, k9m var3, String var4, j2 var5) {
      if (var1 == null) {
         throw new ArgumentNullException("localName");
      }

      if (var2 == null) {
         throw new ArgumentNullException("namespaceUri");
      }

      int var6 = this.y4.u3() > 1 ? 5 : 2;
      this.n5(var6, y0[var6]);
      Object var7 = null;
      this.c8 = true;
      byte var8 = 0;
      l2 var9 = null;
      u1s var10 = null;
      var2 = this.y1.n5(var2);
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, this.z8)) {
         return null;
      }

      h9 var11 = null;
      t6 var12 = this.e2.c8;
      com.aspose.slides.ms.System.Xml.k6 var13 = new com.aspose.slides.ms.System.Xml.k6(var1, var2);
      if (this.z1.get_Item(var13) != null) {
         this.a6("The '{0}' attribute has already been validated and is a duplicate attribute.", var13.toString());
         if (var5 != null) {
            var5.s7();
         }

         return null;
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, this.m3)) {
            x4 var14 = this.t9 == 2 ? this.w1 : null;
            int var15 = 0;
            int[] var16 = new int[]{0};
            var11 = this.s7.n5(var12, var13, var14, var16);
            var15 = var16[0];
            switch (var15) {
               case 0:
                  var9 = var11.m1();
                  if (var12 != null) {
                     this.z1.addItem(var13, var11);
                  }

                  Object var27;
                  if (var3 != null) {
                     var27 = var3.n5();
                  } else {
                     var27 = var4;
                  }

                  var7 = this.n5(var27, var11);
                  v5 var31 = var11.a0();
                  if (var31.x8() == 2 && var7 != null) {
                     e4j var35 = com.aspose.slides.internal.v6g.k5.n5(var7, e4j.class);
                     var10 = var35.n5();
                     var31 = var35.n5().b3();
                     var7 = var35.l6();
                  }

                  this.n5(var31, var7, true);
                  if (this.k7()) {
                     this.n5(var13.l6(), var13.n5(), var7, var27.toString(), var31);
                  }
                  break;
               case 1:
                  if (this.t4 == null) {
                     this.t4 = var11;
                     l9 var34 = com.aspose.slides.internal.v6g.k5.n5(var12.y1(), l9.class);
                     if (var34.u3(false)) {
                        this.a6(
                           "It is an error if there is a member of the attribute uses of a type definition with type xs:ID or derived from xs:ID and another attribute with type xs:ID matches an attribute wildcard.",
                           com.aspose.slides.ms.System.d1.n5
                        );
                     } else {
                        var9 = var11.m1();
                        if (var12 != null) {
                           this.z1.addItem(var13, var11);
                        }

                        Object var26;
                        if (var3 != null) {
                           var26 = var3.n5();
                        } else {
                           var26 = var4;
                        }

                        var7 = this.n5(var26, var11);
                        v5 var30 = var11.a0();
                        if (var30.x8() == 2 && var7 != null) {
                           e4j var20 = com.aspose.slides.internal.v6g.k5.n5(var7, e4j.class);
                           var10 = var20.n5();
                           var30 = var20.n5().b3();
                           var7 = var20.l6();
                        }

                        this.n5(var30, var7, true);
                        if (this.k7()) {
                           this.n5(var13.l6(), var13.n5(), var7, var26.toString(), var30);
                        }
                     }
                  } else {
                     this.a6(
                        "It is an error if more than one attribute whose type is xs:ID or is derived from xs:ID, matches an attribute wildcard on an element.",
                        com.aspose.slides.ms.System.d1.n5
                     );
                  }
                  break;
               case 2:
                  if ((var11 = this.u3(var13)) != null) {
                     var9 = var11.m1();
                     if (var12 != null) {
                        this.z1.addItem(var13, var11);
                     }

                     Object var25;
                     if (var3 != null) {
                        var25 = var3.n5();
                     } else {
                        var25 = var4;
                     }

                     var7 = this.n5(var25, var11);
                     v5 var29 = var11.a0();
                     if (var29.x8() == 2 && var7 != null) {
                        e4j var33 = com.aspose.slides.internal.v6g.k5.n5(var7, e4j.class);
                        var10 = var33.n5();
                        var29 = var33.n5().b3();
                        var7 = var33.l6();
                     }

                     this.n5(var29, var7, true);
                     if (this.k7()) {
                        this.n5(var13.l6(), var13.n5(), var7, var25.toString(), var29);
                     }
                  } else if (var12 == null && this.i1 == 3 && var13.n5().length() != 0 && this.s7.u3(var13.n5())) {
                     this.c8 = false;
                     this.a6("The '{0}' attribute is not declared.", var13.toString());
                  } else if (this.i1 != 1) {
                     this.n5("Could not find Schema information for the attribute '{0}'.", var13.toString(), 1);
                  }
                  break;
               case 3:
                  if ((var11 = this.u3(var13)) != null) {
                     var9 = var11.m1();
                     if (var12 != null) {
                        this.z1.addItem(var13, var11);
                     }

                     Object var24;
                     if (var3 != null) {
                        var24 = var3.n5();
                     } else {
                        var24 = var4;
                     }

                     var7 = this.n5(var24, var11);
                     v5 var28 = var11.a0();
                     if (var28.x8() == 2 && var7 != null) {
                        e4j var32 = com.aspose.slides.internal.v6g.k5.n5(var7, e4j.class);
                        var10 = var32.n5();
                        var28 = var32.n5().b3();
                        var7 = var32.l6();
                     }

                     this.n5(var28, var7, true);
                     if (this.k7()) {
                        this.n5(var13.l6(), var13.n5(), var7, var24.toString(), var28);
                     }
                  } else {
                     this.c8 = false;
                     this.a6("The '{0}' attribute is not declared.", var13.toString());
                  }
                  break;
               case 4:
                  this.n5("Could not find Schema information for the attribute '{0}'.", var13.toString(), 1);
               case 5:
               default:
                  break;
               case 6:
                  if ((var11 = this.u3(var13)) != null) {
                     var9 = var11.m1();
                     if (var12 != null) {
                        this.z1.addItem(var13, var11);
                     }

                     Object var17;
                     if (var3 != null) {
                        var17 = var3.n5();
                     } else {
                        var17 = var4;
                     }

                     var7 = this.n5(var17, var11);
                     v5 var18 = var11.a0();
                     if (var18.x8() == 2 && var7 != null) {
                        e4j var19 = com.aspose.slides.internal.v6g.k5.n5(var7, e4j.class);
                        var10 = var19.n5();
                        var18 = var19.n5().b3();
                        var7 = var19.l6();
                     }

                     this.n5(var18, var7, true);
                     if (this.k7()) {
                        this.n5(var13.l6(), var13.n5(), var7, var17.toString(), var18);
                     }
                  } else {
                     this.c8 = false;
                     this.a6("The '{0}' attribute is not allowed.", var13.toString());
                  }
                  break;
               case 7:
                  this.c8 = false;
                  this.a6("The '{0}' attribute is not allowed.", var13.toString());
                  break;
               case 8:
                  this.c8 = false;
                  this.n5(
                     "The attribute name '{0}' does not match the name '{1}' of the 'XmlSchemaAttribute' set as a partial validation type.",
                     new String[]{var13.toString(), ((l2)var14).n3().toString()}
                  );
                  break;
               case 9:
                  this.t9 = 1;
                  this.c8 = false;
                  this.a6(
                     "If the partial validation type is 'XmlSchemaElement' or 'XmlSchemaType', the 'ValidateAttribute' method cannot be called.",
                     com.aspose.slides.ms.System.d1.n5
                  );
            }
         } else {
            var1 = this.y1.n5(var1);
            if (!com.aspose.slides.ms.System.Xml.v8.n5(var1, this.v4)
               && !com.aspose.slides.ms.System.Xml.v8.n5(var1, this.u6)
               && !com.aspose.slides.ms.System.Xml.v8.n5(var1, this.t1)
               && !com.aspose.slides.ms.System.Xml.v8.n5(var1, this.a5)) {
               this.c8 = false;
               this.a6("The attribute '{0}' does not match one of the four allowed attributes in the 'xsi' namespace.", var13.toString());
            } else {
               this.z1.addItem(var13, h9.n5);
            }
         }

         if (!this.c8) {
            var8 = 2;
         } else if (var11 != null) {
            var8 = 1;
         }

         if (var5 != null) {
            var5.n5(var9);
            var5.n5((j9e)(var9 == null ? null : var9.y4()));
            var5.n5(var10);
            var5.n5(false);
            var5.n5(var8);
         }

         if (this.x8() && this.n3.get_Item(var2) == null) {
            this.n3.addItem(var2, var2);
         }

         return var7;
      }
   }

   public final void n5(ArrayList var1) {
      if (var1 == null) {
         throw new ArgumentNullException("defaultAttributes");
      }

      this.n5(5, "GetUnspecifiedDefaultAttributes");
      this.n5(var1, false);
   }

   public final void n5(j2 var1) {
      this.n5(6, y0[6]);
      t6 var2 = this.e2.c8;
      if (var2 != null && var2.t9()) {
         this.e2.u3 = false;
         this.n5(var2);
      }

      if (var1 != null) {
         var1.n5(this.e2.h0);
      }
   }

   public final void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("elementValue");
      }

      this.n5(var1, (k9m)null);
   }

   public final void n5(k9m var1) {
      if (var1 == null) {
         throw new ArgumentNullException("elementValue");
      }

      this.n5((java.lang.String)(null), (com.aspose.slides.internal.b8c.k9m)(var1));
   }

   private void n5(String var1, k9m var2) {
      int var3 = this.y4.u3() > 1 ? 7 : 3;
      this.n5(var3, y0[var3]);
      if (this.e2.k5) {
         if (this.e2.n5) {
            this.a6("Element '{0}' must have no character or element children.", n5(this.e2.s7, this.e2.x8));
            return;
         }

         int var4 = this.e2.c8.z1().l6();
         switch (var4) {
            case 0:
               if (var2 != null) {
                  this.l6(var2.n5());
               } else {
                  this.l6((Object)var1);
               }
               break;
            case 1:
               this.a6("The element cannot contain text. Content model is empty.", com.aspose.slides.ms.System.d1.n5);
               break;
            case 2:
               String var5 = var2 != null ? var2.n5().toString() : var1;
               if (!this.x9.n5(var5)) {
                  ArrayList var6 = this.e2.c8.z1().n5(this.e2, false, this.k5);
                  if (var6 != null && var6.size() != 0) {
                     this.n5(
                        "The element {0} cannot contain text. List of possible elements expected: {1}.",
                        new String[]{l6(this.e2.s7, this.e2.x8), l6(var6, true)}
                     );
                  } else {
                     this.a6("The element {0} cannot contain text.", l6(this.e2.s7, this.e2.x8));
                  }
               }
               break;
            case 3:
               if (this.e2.c8.s3() != null) {
                  if (var2 != null) {
                     this.l6(var2.n5());
                  } else {
                     this.l6((Object)var1);
                  }
               }
         }
      }
   }

   public final void l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("elementValue");
      }

      this.l6(var1, (k9m)null);
   }

   public final void l6(k9m var1) {
      if (var1 == null) {
         throw new ArgumentNullException("elementValue");
      }

      this.l6(null, var1);
   }

   private void l6(String var1, k9m var2) {
      int var3 = this.y4.u3() > 1 ? 8 : 3;
      this.n5(var3, y0[var3]);
      if (this.e2.k5) {
         if (this.e2.n5) {
            this.a6("Element '{0}' must have no character or element children.", n5(this.e2.s7, this.e2.x8));
         }

         int var4 = this.e2.c8.z1().l6();
         switch (var4) {
            case 0:
               if (var2 != null) {
                  this.l6(var2.n5());
               } else {
                  this.l6((Object)var1);
               }
               break;
            case 1:
               this.a6("The element cannot contain white space. Content model is empty.", com.aspose.slides.ms.System.d1.n5);
            case 2:
            default:
               break;
            case 3:
               if (this.e2.c8.s3() != null) {
                  if (var2 != null) {
                     this.l6(var2.n5());
                  } else {
                     this.l6((Object)var1);
                  }
               }
         }
      }
   }

   public final Object l6(j2 var1) {
      return this.n5(var1, (java.lang.Object)null);
   }

   public final void k5(j2 var1) {
      if (this.y4.u3() <= 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("The call to the '{0}' method does not match a corresponding call to 'ValidateElement' method.", y0[10])
         );
      }

      this.n5(10, y0[10]);
      if (var1 != null) {
         t6 var2 = this.e2.c8;
         if (var2 != null) {
            var1.n5(var2.y1());
            var1.n5(this.z8());
         } else {
            var1.n5((j9e)null);
            var1.n5((v1)null);
         }

         var1.n5((u1s)null);
         var1.l6(this.e2.n5);
         var1.n5(this.e2.l6);
         var1.n5(this.e2.h0);
      }

      this.e2.a6 = true;
      this.t9 = 10;
      this.z1();
   }

   public final void l6() {
      if (this.y4.u3() > 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "The 'EndValidation' method cannot not be called when all the elements have not been validated. 'ValidateEndElement' calls corresponding to 'ValidateElement' calls might be missing."
            )
         );
      }

      this.n5(11, y0[11]);
      this.m1();
   }

   public final void n5(ArrayList var1, boolean var2) {
      this.t9 = 5;
      t6 var3 = this.e2.c8;
      if (var3 != null && var3.e2()) {
         for (int var4 = 0; var4 < var3.m1().size(); var4++) {
            h9 var5 = (h9)var3.m1().get_Item(var4);
            if (!this.z1.contains(var5.z8()) && var5.s3() != null) {
               String var6 = this.y1.n5(var5.z8().n5());
               String var7 = com.aspose.slides.ms.System.d1.n5;
               if (var6.length() > 0) {
                  var7 = this.u3(var6);
                  if (var7 == null || var7.length() == 0) {
                     this.n5(
                        "Default attribute '{0}' for element '{1}' could not be applied as the attribute namespace is not mapped to a prefix in the instance document.",
                        new String[]{var5.z8().toString(), n5(this.e2.s7, this.e2.x8)}
                     );
                     continue;
                  }
               }

               v5 var8 = var5.a0();
               if (var2) {
                  com.aspose.slides.ms.System.Xml.k8 var9 = new com.aspose.slides.ms.System.Xml.k8();
                  var9.n5(this.y1.n5(var5.z8().l6()));
                  var9.l6(var6);
                  var9.k5(this.y1.n5(var7));
                  var9.l6(2);
                  com.aspose.slides.ms.System.Xml.n5 var10 = new com.aspose.slides.ms.System.Xml.n5();
                  j2 var11 = var10.u3;
                  if (var5.a0().x8() == 2) {
                     e4j var12 = com.aspose.slides.internal.v6g.k5.n5(var5.s3(), e4j.class);
                     var11.n5(var12.n5());
                     var8 = var12.n5().b3();
                     var10.k5 = var12.l6();
                  } else {
                     var10.k5 = var5.s3();
                  }

                  var11.n5(true);
                  var11.n5(1);
                  var11.n5(var5.y1());
                  var11.n5(var5.m1());
                  var9.u3(var11.c8().z7().t2(var10.k5));
                  var9.n5(var10);
                  var1.addItem(var9);
               } else {
                  var1.addItem(var5.m1());
               }

               this.n5(var8, var5.s3(), true);
               if (this.k7()) {
                  this.n5(var5.z8().l6(), var5.z8().n5(), var5.s3(), var5.d5(), var8);
               }
            }
         }
      }
   }

   public final k0t k5() {
      return this.k5;
   }

   public final int u3() {
      return this.u3;
   }

   public final int a6() {
      return this.e2.c8 == null ? 1 : this.e2.c8.z1().l6();
   }

   public final int u9() {
      return this.i1;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.z7 var1) {
      this.x8 = var1;
      this.t2 = true;
   }

   private boolean e2() {
      return (this.i1 == 3 || this.i1 == 2) && this.e2.c8 != null && !this.e2.a6;
   }

   private boolean t9() {
      if (this.u9) {
         this.u9 = false;
         if (!this.s7.u3(this.e2.x8)) {
            this.h0 = false;
         }
      }

      return this.h0;
   }

   public final String h0() {
      return this.r4.toString();
   }

   private Object n5(j2 var1, Object var2) {
      if (this.y4.u3() <= 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("The call to the '{0}' method does not match a corresponding call to 'ValidateElement' method.", y0[9])
         );
      }

      this.n5(9, y0[9]);
      t6 var3 = this.e2.c8;
      u1s var4 = null;
      j9e var5 = null;
      v1 var6 = null;
      String var7 = com.aspose.slides.ms.System.d1.n5;
      if (var3 != null) {
         if (this.e2.u3 && var3.t9()) {
            this.n5(var3);
         }

         if (!this.e2.n5 && this.e2.k5) {
            int var8 = var3.z1().l6();
            switch (var8) {
               case 0:
                  if (var2 == null) {
                     var7 = this.r4.toString();
                     u1s[] var9 = new u1s[]{var4};
                     var2 = this.n5(var7, var9);
                     var4 = var9[0];
                  } else {
                     u1s[] var11 = new u1s[]{var4};
                     var2 = this.n5(var2, var11);
                     var4 = var11[0];
                  }
               case 1:
               default:
                  break;
               case 2:
                  if (var2 != null) {
                     throw new InvalidOperationException(
                        com.aspose.slides.ms.System.Xml.v3.n5(
                           "It is invalid to call the 'ValidateEndElement' overload that takes in a 'typedValue' for elements with complex content."
                        )
                     );
                  }
                  break;
               case 3:
                  if (var3.s3() != null && var2 == null) {
                     var7 = this.r4.toString();
                     var2 = this.k5(var7);
                  }
            }

            if (!var3.z1().l6(this.e2)) {
               n5(this.e2, this.c4, this.f2, this.p8, this.a0.ah_(), this.a0.ai_(), this.k5);
               this.e2.h0 = 2;
            }
         }

         if (this.k7()) {
            j9e var10 = var4 == null ? var3.y1() : var4;
            this.n5(var2, var7, var10.b3());
         }

         var5 = var3.y1();
         var6 = this.z8();
      }

      if (var1 != null) {
         var1.n5(var5);
         var1.n5(var6);
         var1.n5(var4);
         var1.l6(this.e2.n5);
         var1.n5(this.e2.l6);
         if (this.e2.h0 == 0 && this.e2()) {
            this.e2.h0 = 1;
         }

         var1.n5(this.e2.h0);
      }

      this.z1();
      return var2;
   }

   private void k5(String var1, String var2) {
      boolean var3 = false;
      if (var2 != null) {
         var3 = true;
         this.u3(com.aspose.slides.ms.System.d1.n5, var2);
      }

      if (var1 != null) {
         Object var4 = null;
         Object[] var5 = new Object[]{var4};
         RuntimeException var6 = f0.n5(var1, this.y1, this.f2, var5);
         var4 = var5[0];
         if (var6 != null) {
            this.n5(
               "The attribute '{0}' has an invalid value '{1}' according to its Schema type '{2}' - {3}",
               new String[]{"schemaLocation", var1, f0.j5(), var6.getMessage()},
               var6
            );
            return;
         }

         String[] var7 = com.aspose.slides.internal.v6g.k5.k5(var4, String[].class);
         var3 = true;

         try {
            for (int var8 = 0; var8 < var7.length - 1; var8 += 2) {
               this.u3(var7[var8], var7[var8 + 1]);
            }
         } catch (XmlSchemaException var9) {
            this.n5(var9);
         }
      }

      if (var3) {
         this.c8();
      }
   }

   private Object n5(com.aspose.slides.ms.System.Xml.k6 var1, boolean[] var2) {
      Object var3 = null;
      int var4 = 0;
      v1 var5 = null;
      var2[0] = false;
      if (this.e2.k5) {
         if (this.e2.n5) {
            this.a6("Element '{0}' must have no character or element children.", n5(this.e2.s7, this.e2.x8));
            return null;
         }

         z1 var6 = this.e2.c8.z1();
         if (var6.l6() == 3 && this.e2.c8.r4() == 3) {
            this.a6(
               "Although the '{0}' element's content type is mixed, it cannot have element children, because it has a fixed value constraint in the Schema.",
               n5(this.e2.s7, this.e2.x8)
            );
            return null;
         }

         com.aspose.slides.ms.System.Xml.k6 var7 = var1;
         boolean var8 = false;

         while (true) {
            int[] var9 = new int[]{var4};
            var3 = this.e2.c8.z1().n5(var7, this.e2, var9);
            var4 = var9[0];
            if (var3 != null) {
               break;
            }

            if (var4 == -2) {
               this.a6("Element '{0}' cannot appear more than once if content model type is \"all\".", var1.toString());
               var2[0] = true;
               byte var10 = 1;
               this.e2.u9 = var10;
               this.i1 = var10;
               return null;
            }

            var8 = true;
            var5 = this.l6(var7);
            if (var5 == null) {
               break;
            }

            var7 = var5.z8();
         }

         if (var8) {
            v1 var12 = com.aspose.slides.internal.v6g.k5.n5(var3, v1.class);
            if (var12 == null) {
               var3 = null;
            } else if (var12.q0().k5()) {
               this.n5("The element {0} cannot substitute for a local element {1} expected in that position.", n5(var1), n5(var12.z8()));
               var2[0] = true;
               byte var14 = 1;
               this.e2.u9 = var14;
               this.i1 = var14;
            } else {
               var3 = this.s7.u3(var1);
               this.e2.k5 = true;
            }
         }

         if (var3 == null) {
            n5(var1, this.e2, this.c4, this.f2, this.p8, this.a0.ah_(), this.a0.ai_(), this.k5);
            var2[0] = true;
            byte var13 = 1;
            this.e2.u9 = var13;
            this.i1 = var13;
         }
      }

      return var3;
   }

   private v1 l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      v1 var2 = this.s7.u3(var1);
      if (var2 != null) {
         com.aspose.slides.ms.System.Xml.k6 var3 = var2.z3();
         if (!var3.k5()) {
            v1 var4 = this.s7.u3(var3);
            if (var4 != null) {
               if ((var4.w1() & 1) != 0) {
                  this.n5(
                     "Element '{0}' cannot substitute in place of head element '{1}' because it has block='substitution'.",
                     new String[]{var1.toString(), var3.toString()}
                  );
                  return null;
               }

               if (!j9e.n5(var2.j5(), var4.j5(), var4.w1())) {
                  this.n5(
                     "Member element {0}'s type cannot be derived by restriction or extension from head element {1}'s type, because it has block='restriction' or 'extension'.",
                     new String[]{var1.toString(), var3.toString()}
                  );
                  return null;
               }

               return var4;
            }
         }
      }

      return null;
   }

   private Object n5(String var1, u1s[] var2) {
      Object var3 = null;
      var2[0] = null;
      t6 var4 = this.e2.c8;
      if (!this.e2.n5) {
         if (var1.length() == 0 && var4.s3() != null) {
            t6 var5 = this.e2.t2;
            if (var5 != null && var5 != var4) {
               Object[] var6 = new Object[]{var3};
               RuntimeException var7 = var4.a0().n5(var4.d5(), this.y1, this.f2, var6);
               var3 = var6[0];
               if (var7 != null) {
                  this.n5(
                     "The default value '{0}' of element '{1}' is invalid according to the type specified by xsi:type.",
                     new String[]{var4.d5(), n5(this.e2.s7, this.e2.x8)}
                  );
               } else {
                  this.e2.l6 = true;
               }
            } else {
               this.e2.l6 = true;
               var3 = var4.s3();
            }
         } else {
            var3 = this.a6(var1);
         }

         e4j var8 = com.aspose.slides.internal.v6g.k5.n5(var3, e4j.class);
         v5 var9 = var4.a0();
         if (var8 != null) {
            var2[0] = var8.n5();
            var3 = var8.l6();
            var9 = var2[0].b3();
         }

         this.n5(var9, var3, false);
      }

      return var3;
   }

   private Object n5(Object var1, u1s[] var2) {
      var2[0] = null;
      t6 var3 = this.e2.c8;
      Object var4 = null;
      if (!this.e2.n5) {
         h1 var5 = com.aspose.slides.internal.v6g.k5.n5(var3, h1.class);
         v5 var6 = var3.a0();
         Object[] var7 = new Object[]{var4};
         RuntimeException var8 = var6.n5(var1, this.y1, this.f2, var7);
         var4 = var7[0];
         if (var8 != null) {
            String var10 = com.aspose.slides.internal.v6g.k5.n5(var1, String.class);
            if (var10 == null) {
               var10 = v5.n5(var1);
            }

            this.n5(
               "The '{0}' element is invalid - The value '{1}' is invalid according to its datatype '{2}' - {3}",
               new String[]{n5(this.e2.s7, this.e2.x8), var10, this.n5(var5), var8.getMessage()},
               var8
            );
            return null;
         }

         if (!var5.k5(var4)) {
            this.a6("The value of the '{0}' element does not equal its fixed value.", n5(this.e2.s7, this.e2.x8));
         }

         if (var6.x8() == 2) {
            e4j var9 = com.aspose.slides.internal.v6g.k5.n5(var4, e4j.class);
            var2[0] = var9.n5();
            var4 = var9.l6();
            var6 = var2[0].b3();
         }

         this.n5(var6, var4, false);
      }

      return var4;
   }

   private String n5(h1 var1) {
      String var2 = var1.y1().r4().toString();
      if (var2.length() == 0) {
         var2 = var1.a0().j5();
      }

      return var2;
   }

   private void l6(Object var1) {
      String var2 = var1.toString();
      this.r4.n5(var2);
   }

   private void k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.e2 = (x5)this.y4.n5();
      if (this.e2 == null) {
         this.e2 = new x5();
         this.y4.n5(this.e2);
      }

      this.e2.s7 = var1.l6();
      this.e2.x8 = var1.n5();
      this.e2.e2 = false;
      this.e2.n5 = false;
      this.e2.l6 = false;
      this.e2.u3 = true;
      this.e2.a6 = false;
      this.e2.h0 = 0;
      this.e2.k5 = false;
      this.e2.u9 = this.i1;
      this.e2.t2 = null;
      this.e2.n3 = null;
   }

   private void z1() {
      x5 var1 = (x5)this.y4.l6();
      if (this.a6 == this.y4.u3()) {
         this.a6 = -1;
      }

      this.e2 = (x5)this.y4.k5();
      if (var1.h0 == 2) {
         this.e2.h0 = 2;
      }

      if (var1.a6) {
         this.e2.a6 = true;
      }

      this.i1 = this.e2.u9;
   }

   private t6 n5(com.aspose.slides.ms.System.Xml.k6 var1, Object var2) {
      t6 var3 = null;
      if (var2 != null) {
         v1 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, v1.class);
         if (var4 != null) {
            var3 = var4.a0();
         } else {
            f7 var5 = (f7)var2;
            this.i1 = var5.c8();
         }
      }

      if (var3 == null && this.i1 != 1) {
         if (!this.u9 || this.w1 == null) {
            var3 = this.s7.l6(var1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(this.w1, v1.class)) {
            v1 var6 = (v1)this.w1;
            if (var1.equals(var6.z8())) {
               var3 = var6.a0();
            } else {
               this.n5(
                  "The element name '{0}' does not match the name '{1}' of the 'XmlSchemaElement' set as a partial validation type.",
                  var1.toString(),
                  var6.z8().toString()
               );
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(this.w1, j9e.class)) {
            j9e var7 = (j9e)this.w1;
            var3 = var7.u6();
         } else {
            this.a6("If the partial validation type is 'XmlSchemaAttribute', the 'ValidateElement' method cannot be called.", com.aspose.slides.ms.System.d1.n5);
         }
      }

      return var3;
   }

   private t6 n5(t6 var1, String var2, String var3, boolean[] var4) {
      com.aspose.slides.ms.System.Xml.k6 var5 = com.aspose.slides.ms.System.Xml.k6.n5;
      if (var2 != null) {
         Object var6 = null;
         Object[] var7 = new Object[]{var6};
         RuntimeException var8 = h2.n5(var2, this.y1, this.f2, var7);
         var6 = var7[0];
         if (var8 != null) {
            this.n5(
               "The attribute '{0}' has an invalid value '{1}' according to its Schema type '{2}' - {3}",
               new String[]{"type", var2, h2.j5(), var8.getMessage()},
               var8
            );
         } else {
            var5 = com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.ms.System.Xml.k6.class);
         }
      }

      if (var1 != null) {
         if (var1.x8()) {
            if (var3 != null) {
               this.e2.n5 = com.aspose.slides.ms.System.Xml.f4.t2(var3);
               if (this.e2.n5 && var1.r4() == 3) {
                  this.c8("There must be no fixed value when an attribute is 'xsi:nil' and has a value of 'true'.");
               }
            }
         } else if (var3 != null) {
            this.c8("If the 'nillable' attribute is false in the Schema, the 'xsi:nil' attribute must not be present in the instance.");
         }
      }

      if (var5.k5()) {
         if (var1 != null && var1.s7()) {
            this.a6("The element '{0}' is abstract or its type is abstract.", n5(this.e2.s7, this.e2.x8));
            var1 = null;
         }
      } else {
         t6 var10 = this.s7.k5(var5);
         byte var11 = 1;
         if (this.t9() && this.i1 == 3) {
            var11 = 0;
         }

         if (var10 == null && com.aspose.slides.ms.System.d1.a6(var5.n5(), this.k7)) {
            j9e var12 = com.aspose.slides.internal.b8c.t4.n5(var5);
            if (var12 == null) {
               var12 = j9e.n5(var5);
            }

            if (var12 != null) {
               var10 = var12.u6();
            }
         }

         if (var10 == null) {
            this.n5("This is an invalid xsi:type '{0}'.", var5.toString(), var11);
            var1 = null;
         } else {
            var4[0] = true;
            if (var10.s7()) {
               this.n5("The xsi:type '{0}' cannot be abstract.", var5.toString(), var11);
               var1 = null;
            } else if (var1 != null && !j9e.n5(var10.y1(), var1.y1(), var1.n3())) {
               this.n5(
                  "The xsi:type attribute value '{0}' is not valid for the element '{1}', either because it is not a type validly derived from the type in the Schema, or because it has xsi:type derivation blocked.",
                  new String[]{var5.toString(), n5(this.e2.s7, this.e2.x8)}
               );
               var1 = null;
            } else {
               if (var1 != null) {
                  var10 = var10.t2();
                  var10.n5(var1.q0());
                  var10.u3(var1.d5());
                  var10.n5(var1.s3());
                  var10.n5(var1.n3());
               }

               this.e2.t2 = var1;
               var1 = var10;
            }
         }
      }

      return var1;
   }

   private void n5(boolean var1) {
      if (var1) {
         byte var2 = 1;
         this.e2.u9 = var2;
         this.i1 = var2;
         this.e2.k5 = false;
      } else if (this.t9() && this.i1 == 3) {
         byte var3 = 1;
         this.e2.u9 = var3;
         this.i1 = var3;
         this.e2.k5 = false;
         this.a6("The '{0}' element is not declared.", n5(this.e2.s7, this.e2.x8));
      } else {
         this.n5("Could not find Schema information for the element '{0}'.", n5(this.e2.s7, this.e2.x8), 1);
      }
   }

   private void t4() {
      if (this.e2.c8.s7()) {
         this.a6("The element '{0}' is abstract or its type is abstract.", n5(this.e2.s7, this.e2.x8));
      }
   }

   private void q0() {
      if (this.t2() && this.e2.c8.q0() != null) {
         this.j5();
      }

      if (this.k7()) {
         this.w1();
      }
   }

   private h9 u3(com.aspose.slides.ms.System.Xml.k6 var1) {
      h9 var2 = null;
      if (com.aspose.slides.ms.System.Xml.v8.n5(var1.n5(), this.j5) && (this.u3 & 16) != 0) {
         if (!this.s7.u3(this.j5)) {
            this.z3();
         }

         h9[] var3 = new h9[]{var2};
         this.s7.e2().tryGetValue(var1, var3);
         var2 = var3[0];
      }

      return var2;
   }

   private void z3() {
      k0t var1 = new k0t();
      var1.n5(t5.h0());
      var1.x8();
      this.k5.n5(var1);
      this.c8();
   }

   public final Object k5(String var1) {
      t6 var2 = this.e2.c8;
      if (this.e2.n5) {
         return null;
      }

      if (var1.length() == 0) {
         this.e2.l6 = true;
         return var2.s3();
      }

      h1 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, h1.class);
      if (var3.r4() == 3 && !com.aspose.slides.ms.System.d1.a6(var1, var2.d5())) {
         this.a6("The value of the '{0}' element does not equal its fixed value.", var2.z8().toString());
      }

      return var1;
   }

   private void u3(String var1, String var2) {
      com.aspose.slides.ms.System.Xml.c7 var3 = null;

      try {
         com.aspose.slides.ms.System.r8 var4 = this.d5.n5(this.s3, var2);
         com.aspose.slides.internal.z0k.t4 var5 = (com.aspose.slides.internal.z0k.t4)this.d5.n5(var4, null, null);
         com.aspose.slides.ms.System.Xml.w4 var6 = this.k5.y4();
         var6.u9(true);
         var6.n5(this.d5);
         var3 = com.aspose.slides.ms.System.Xml.c7.n5(var5, var6, var4.toString());
         this.k5.n5(var1, var3, this.n3);

         while (var3.u9()) {
         }
      } catch (XmlSchemaException var11) {
         this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var11.getMessage()}, var11);
      } catch (Exception var12) {
         this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var12.getMessage()}, var12, 1);
      } finally {
         if (var3 != null) {
            var3.w1();
         }
      }
   }

   public final void c8() {
      if (!this.k5.l6()) {
         try {
            this.k5.x8();
         } catch (XmlSchemaException var2) {
            this.n5(var2);
         }
      }

      this.s7 = this.k5.n3();
   }

   private void n5(int var1, String var2, boolean var3) {
      switch (var1) {
         case 1:
            if (this.t2()) {
               if (this.u9(var2) != null) {
                  if (var3) {
                     this.c8 = false;
                  }

                  this.a6("'{0}' is already used as an ID.", var2);
               } else {
                  if (this.q0 == null) {
                     this.q0 = new Hashtable();
                  }

                  this.q0.addItem(var2, this.e2.s7);
               }
            }
            break;
         case 2:
            if (this.t2()) {
               Object var4 = this.u9(var2);
               if (var4 == null) {
                  this.z3 = new s9(this.z3, var2, this.a0.ah_(), this.a0.ai_());
               }
            }
         case 3:
         default:
            break;
         case 4:
            this.h0(var2);
      }
   }

   private Object n5(Object var1, h9 var2) {
      Object var3 = null;
      h1 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, h1.class);
      v5 var5 = var2.a0();
      String var6 = com.aspose.slides.internal.v6g.k5.n5(var1, String.class);
      RuntimeException var7 = null;
      if (var6 != null) {
         Object[] var8 = new Object[]{var3};
         var7 = var5.n5(var6, this.y1, this.f2, var8);
         var3 = var8[0];
         if (var7 != null) {
            this.c8 = false;
            if (var6 == null) {
               var6 = v5.n5(var1);
            }

            this.n5(
               "The '{0}' attribute is invalid - The value '{1}' is invalid according to its datatype '{2}' - {3}",
               new String[]{var2.z8().toString(), var6, this.n5(var4), var7.getMessage()},
               var7
            );
            return null;
         }
      } else {
         Object[] var12 = new Object[]{var3};
         var7 = var5.n5(var1, this.y1, this.f2, var12);
         var3 = var12[0];
         if (var7 != null) {
            this.c8 = false;
            if (var6 == null) {
               var6 = v5.n5(var1);
            }

            this.n5(
               "The '{0}' attribute is invalid - The value '{1}' is invalid according to its datatype '{2}' - {3}",
               new String[]{var2.z8().toString(), var6, this.n5(var4), var7.getMessage()},
               var7
            );
            return null;
         }
      }

      if (!var4.k5(var3)) {
         this.c8 = false;
         this.a6("The value of the '{0}' attribute does not equal its fixed value.", var2.z8().toString());
      }

      return var3;
   }

   private Object a6(String var1) {
      Object var2 = null;
      h1 var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2.c8, h1.class);
      v5 var4 = var3.a0();
      Object[] var5 = new Object[]{var2};
      RuntimeException var6 = var4.n5(var1, this.y1, this.f2, var5);
      var2 = var5[0];
      if (var6 != null) {
         this.n5(
            "The '{0}' element is invalid - The value '{1}' is invalid according to its datatype '{2}' - {3}",
            new String[]{n5(this.e2.s7, this.e2.x8), var1, this.n5(var3), var6.getMessage()},
            var6
         );
         return null;
      }

      if (!var3.k5(var2)) {
         this.a6("The value of the '{0}' element does not equal its fixed value.", n5(this.e2.s7, this.e2.x8));
      }

      return var2;
   }

   private void n5(v5 var1, Object var2, boolean var3) {
      if (var2 != null) {
         int var4 = var1.t2();
         if (var4 == 4 || var4 == 1 || var4 == 2) {
            if (var1.x8() == 1) {
               String[] var5 = com.aspose.slides.internal.v6g.k5.k5(var2, String[].class);

               for (int var6 = 0; var6 < var5.length; var6++) {
                  this.n5(var1.t2(), var5[var6], var3);
               }
            } else {
               this.n5(var1.t2(), (String)var2, var3);
            }
         }
      }
   }

   private Object u9(String var1) {
      return this.q0 == null ? null : this.q0.get_Item(var1);
   }

   private void m1() {
      s9 var1 = this.z3;

      while (var1 != null) {
         if (this.u9(var1.n5) == null) {
            this.n5(new XmlSchemaValidationException("Reference to undeclared ID is '{0}'.", var1.n5, this.p8, var1.l6, var1.k5), 0);
         }

         s9 var2 = var1.u3;
         var1.u3 = null;
         var1 = var2;
      }

      this.z3 = null;
   }

   private boolean k7() {
      return this.t2() && this.a6 != -1;
   }

   public final boolean t2() {
      return (this.u3 & 8) != 0;
   }

   public final boolean s7() {
      return (this.u3 & 4) != 0;
   }

   public final boolean x8() {
      return (this.u3 & 1) != 0 || (this.u3 & 2) != 0;
   }

   private void n5(int var1, String var2) {
      if (!n5[this.t9][var1]) {
         if (this.t9 == 0) {
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.Xml.v3.n5(
                  "It is invalid to call the '{0}' method in the current state of the validator. The '{1}' method must be called before proceeding with validation.",
                  var2,
                  y0[1]
               )
            );
         } else {
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.Xml.v3.n5("The transition from the '{0}' method to the '{1}' method is not allowed.", y0[this.t9], var2)
            );
         }
      } else {
         this.t9 = var1;
      }
   }

   private void m3() {
      if (this.r4 != null) {
         this.r4.n5(0);
      }

      this.z1.clear();
      this.t4 = null;
   }

   private void n5(t6 var1) {
      Dictionary var2 = var1.k7();
      Dictionary$ValueCollection$Enumerator var3 = var2.getValues().iterator();

      try {
         while (var3.hasNext()) {
            h9 var4 = (h9)var3.next();
            if (this.z1.get_Item(var4.z8()) == null && (var4.r4() == 1 || var4.r4() == 4)) {
               this.a6("The required attribute '{0}' is missing.", var4.z8().toString());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private v1 z8() {
      t6 var1 = this.e2.t2;
      t6 var2 = this.e2.c8;
      if (var1 != null && var1.z3() != null) {
         v1 var3 = (v1)var1.z3().n5((a9)null);
         var3.k5(com.aspose.slides.ms.System.Xml.k6.n5);
         var3.n5(var2.y1());
         var3.l6(var2.y1());
         var3.n5(var2);
         return var3;
      } else {
         return var2.z3();
      }
   }

   public final String u3(String var1) {
      IGenericDictionary var2 = this.f2.n5(0);
      String var3 = null;
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            String var6 = this.y1.n5((String)var5.getValue());
            if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var1)) {
               var3 = (String)var5.getKey();
               if (var3.length() != 0) {
                  return var3;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   private void j5() {
      t6 var1 = this.e2.c8;
      this.e2.n3 = new t9[var1.q0().length];
      int var2 = 0;

      for (int var3 = 0; var3 < var1.q0().length; var3++) {
         this.e2.n3[var2++] = new t9(var1.q0()[var3]);
      }

      for (int var8 = 0; var8 < this.e2.n3.length; var8++) {
         if (this.e2.n3[var8].n5.n5() == 2) {
            boolean var4 = false;

            for (int var5 = this.y4.u3() - 1; var5 >= (this.a6 >= 0 ? this.a6 : this.y4.u3() - 1); var5--) {
               if (((x5)this.y4.n5(var5)).n3 != null) {
                  t9[] var6 = ((x5)this.y4.n5(var5)).n3;

                  for (int var7 = 0; var7 < var6.length; var7++) {
                     if (com.aspose.slides.ms.System.Xml.k6.n5(var6[var7].n5.n5, this.e2.n3[var8].n5.l6)) {
                        var4 = true;
                        if (var6[var7].a6 == null) {
                           var6[var7].a6 = new Hashtable();
                        }

                        this.e2.n3[var8].u3 = var6[var7].a6;
                        break;
                     }
                  }

                  if (var4) {
                     break;
                  }
               }
            }

            if (!var4) {
               this.a6("The Keyref '{0}' cannot find the referred key or unique in scope.", n5(this.e2.s7, this.e2.x8));
            }
         }
      }

      if (this.a6 == -1) {
         this.a6 = this.y4.u3() - 1;
      }
   }

   private void w1() {
      t6 var1 = this.e2.c8;
      String var2 = this.e2.s7;
      String var3 = this.e2.x8;

      for (int var4 = this.a6; var4 < this.y4.u3(); var4++) {
         if (((x5)this.y4.n5(var4)).n3 != null) {
            t9[] var5 = ((x5)this.y4.n5(var4)).n3;

            for (int var6 = 0; var6 < var5.length; var6++) {
               if (var5[var6].l6.n5(var2, var3)) {
                  com.aspose.slides.internal.f8y.n5.u3("Selector Match!");
                  com.aspose.slides.internal.f8y.n5.u3(
                     com.aspose.slides.ms.System.d1.n5(new String[]{"Name: ", var2, "\t|\tURI: ", var3, com.aspose.slides.ms.System.p8.k5()})
                  );
                  var5[var6].l6.n5(this.a0.ah_(), this.a0.ai_());
               }

               for (int var7 = 0; var7 < var5[var6].k5.size(); var7++) {
                  a1 var8 = (a1)var5[var6].k5.get_Item(var7);
                  if (var8.n5(var2, var3)) {
                     com.aspose.slides.internal.f8y.n5.u3("Element Field Match!");
                     if (var1 != null) {
                        if (var1.a0() != null && var1.z1().l6() != 3) {
                           var8.n5 = true;
                        } else {
                           this.a6("The field '{0}' is expecting an element or attribute with simple type or simple content.", var2);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void n5(String var1, String var2, Object var3, String var4, v5 var5) {
      for (int var6 = this.a6; var6 < this.y4.u3(); var6++) {
         if (((x5)this.y4.n5(var6)).n3 != null) {
            t9[] var7 = ((x5)this.y4.n5(var6)).n3;

            for (int var8 = 0; var8 < var7.length; var8++) {
               for (int var9 = 0; var9 < var7[var8].k5.size(); var9++) {
                  a1 var10 = (a1)var7[var8].k5.get_Item(var9);
                  if (var10.k5(var1, var2)) {
                     com.aspose.slides.internal.f8y.n5.u3("Attribute Field Match!");
                     com.aspose.slides.internal.f8y.n5.u3("Attribute Field Filling Value!");
                     com.aspose.slides.internal.f8y.n5.u3(com.aspose.slides.ms.System.d1.n5(new Object[]{"Name: ", var1, "\t|\tURI: ", var2, "\t|\tValue: ", var3, "\n"}));
                     if (var10.l6.n5(var10.k5()) != null) {
                        this.a6("The field '{0}' is expecting at the most one value.", var1);
                     } else {
                        var10.l6.n5(var10.k5(), new p9(var3, var4, var5));
                     }
                  }
               }
            }
         }
      }
   }

   private void n5(Object var1, String var2, v5 var3) {
      String var4 = this.e2.s7;
      String var5 = this.e2.x8;

      for (int var6 = this.y4.u3() - 1; var6 >= this.a6; var6--) {
         if (((x5)this.y4.n5(var6)).n3 != null) {
            t9[] var7 = ((x5)this.y4.n5(var6)).n3;

            for (int var8 = 0; var8 < var7.length; var8++) {
               for (int var9 = 0; var9 < var7[var8].k5.size(); var9++) {
                  a1 var10 = (a1)var7[var8].k5.get_Item(var9);
                  if (var10.n5) {
                     com.aspose.slides.internal.f8y.n5.u3("Element Field Filling Value!");
                     com.aspose.slides.internal.f8y.n5.u3(com.aspose.slides.ms.System.d1.n5(new Object[]{"Name: ", var4, "\t|\tURI: ", var5, "\t|\tValue: ", var1, "\n"}));
                     var10.n5 = false;
                     if (var10.l6.n5(var10.k5()) != null) {
                        this.a6("The field '{0}' is expecting at the most one value.", var4);
                     } else if (var1 != null && var2.length() != 0) {
                        var10.l6.n5(var10.k5(), new p9(var1, var2, var3));
                     }
                  }

                  var10.l6(var4, var5);
               }

               if (var7[var8].l6.l6(var4, var5)) {
                  h5 var17 = var7[var8].l6.u3();
                  switch (var7[var8].n5.n5()) {
                     case 0:
                        if (var17.k5()) {
                           if (var7[var8].u3.contains(var17)) {
                              this.n5(
                                 new XmlSchemaValidationException(
                                    "There is a duplicate key sequence '{0}' for the '{1}' key or unique identity constraint.",
                                    new String[]{var17.toString(), var7[var8].n5.n5.toString()},
                                    this.p8,
                                    var17.n5(),
                                    var17.l6()
                                 )
                              );
                           } else {
                              var7[var8].u3.addItem(var17, var17);
                           }
                        }
                        break;
                     case 1:
                        if (!var17.k5()) {
                           this.n5(
                              new XmlSchemaValidationException(
                                 "The identity constraint '{0}' validation has failed. Either a key is missing or the existing key has an empty node.",
                                 var7[var8].n5.n5.toString(),
                                 this.p8,
                                 var17.n5(),
                                 var17.l6()
                              )
                           );
                        } else if (var7[var8].u3.contains(var17)) {
                           this.n5(
                              new XmlSchemaValidationException(
                                 "There is a duplicate key sequence '{0}' for the '{1}' key or unique identity constraint.",
                                 new String[]{var17.toString(), var7[var8].n5.n5.toString()},
                                 this.p8,
                                 var17.n5(),
                                 var17.l6()
                              )
                           );
                        } else {
                           var7[var8].u3.addItem(var17, var17);
                        }
                        break;
                     case 2:
                        if (var7[var8].u3 != null && var17.k5() && !var7[var8].u3.contains(var17)) {
                           var7[var8].u3.addItem(var17, var17);
                        }
                  }
               }
            }
         }
      }

      t9[] var14 = ((x5)this.y4.n5(this.y4.u3() - 1)).n3;
      if (var14 != null) {
         for (int var15 = 0; var15 < var14.length; var15++) {
            if (var14[var15].n5.n5() != 2 && var14[var15].a6 != null) {
               IEnumerator var16 = var14[var15].a6.getKeys().iterator();

               try {
                  while (var16.hasNext()) {
                     h5 var18 = (h5)var16.next();
                     if (!var14[var15].u3.contains(var18)) {
                        this.n5(
                           new XmlSchemaValidationException(
                              "The key sequence '{0}' in '{1}' Keyref fails to refer to some key.",
                              new String[]{var18.toString(), var14[var15].n5.n5.toString()},
                              this.p8,
                              var18.n5(),
                              var18.l6()
                           )
                        );
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
                     ((IDisposable)var16).dispose();
                  }
               }
            }
         }
      }
   }

   public static void n5(com.aspose.slides.ms.System.Xml.k6 var0, x5 var1, b4 var2, Object var3, String var4, int var5, int var6, k0t var7) {
      ArrayList var8 = null;
      if (var1.c8 != null) {
         z1 var9 = var1.c8.z1();
         int var10 = var9.l6();
         if (var10 == 2 || var10 == 3 && var9 != com.aspose.slides.internal.b8c.z1.k5 && var9 != com.aspose.slides.internal.b8c.z1.u3) {
            boolean var11 = var7 != null;
            if (var11) {
               var8 = var9.n5(var1, false, var7);
            } else {
               var8 = var9.n5(var1, false);
            }

            if (var8 != null && var8.size() != 0) {
               if (var1.q0) {
                  n5(
                     var2,
                     var3,
                     new XmlSchemaValidationException(
                        "The element {0} has invalid child element {1}. List of possible elements expected: {2}. {3}",
                        new String[]{
                           l6(var1.s7, var1.x8),
                           n5(var0),
                           l6(var8, var11),
                           com.aspose.slides.ms.System.Xml.v3.n5(
                              "Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately."
                           )
                        },
                        var4,
                        var5,
                        var6
                     ),
                     0
                  );
               } else {
                  n5(
                     var2,
                     var3,
                     new XmlSchemaValidationException(
                        "The element {0} has invalid child element {1}. List of possible elements expected: {2}.",
                        new String[]{l6(var1.s7, var1.x8), n5(var0), l6(var8, var11)},
                        var4,
                        var5,
                        var6
                     ),
                     0
                  );
               }
            } else if (var1.q0) {
               n5(
                  var2,
                  var3,
                  new XmlSchemaValidationException(
                     "The element {0} has invalid child element {1} - {2}",
                     new String[]{
                        l6(var1.s7, var1.x8),
                        n5(var0),
                        com.aspose.slides.ms.System.Xml.v3.n5(
                           "Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately."
                        )
                     },
                     var4,
                     var5,
                     var6
                  ),
                  0
               );
            } else {
               n5(
                  var2,
                  var3,
                  new XmlSchemaValidationException(
                     "The element {0} has invalid child element {1}.", new String[]{l6(var1.s7, var1.x8), n5(var0)}, var4, var5, var6
                  ),
                  0
               );
            }
         } else if (var10 == 1) {
            n5(
               var2,
               var3,
               new XmlSchemaValidationException(
                  "The element '{0}' cannot contain child element '{1}' because the parent element's content model is empty.",
                  new String[]{n5(var1.s7, var1.x8), var0.toString()},
                  var4,
                  var5,
                  var6
               ),
               0
            );
         } else if (!var9.u3()) {
            n5(
               var2,
               var3,
               new XmlSchemaValidationException(
                  "The element '{0}' cannot contain child element '{1}' because the parent element's content model is text only.",
                  new String[]{n5(var1.s7, var1.x8), var0.toString()},
                  var4,
                  var5,
                  var6
               ),
               0
            );
         }
      }
   }

   public static void n5(x5 var0, b4 var1, Object var2, String var3, int var4, int var5, k0t var6) {
      ArrayList var7 = null;
      boolean var8 = var6 != null;
      if (var0.c8 != null) {
         if (var8) {
            var7 = var0.c8.z1().n5(var0, true, var6);
         } else {
            var7 = var0.c8.z1().n5(var0, true);
         }
      }

      if (var7 != null && var7.size() != 0) {
         if (var0.q0) {
            n5(
               var1,
               var2,
               new XmlSchemaValidationException(
                  "The element {0} has incomplete content. List of possible elements expected: {1}. {2}",
                  new String[]{
                     l6(var0.s7, var0.x8),
                     l6(var7, var8),
                     com.aspose.slides.ms.System.Xml.v3.n5(
                        "Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately."
                     )
                  },
                  var3,
                  var4,
                  var5
               ),
               0
            );
         } else {
            n5(
               var1,
               var2,
               new XmlSchemaValidationException(
                  "The element {0} has incomplete content. List of possible elements expected: {1}.",
                  new String[]{l6(var0.s7, var0.x8), l6(var7, var8)},
                  var3,
                  var4,
                  var5
               ),
               0
            );
         }
      } else {
         if (var0.q0) {
            n5(
               var1,
               var2,
               new XmlSchemaValidationException(
                  "The element {0} has incomplete content - {2}",
                  new String[]{
                     l6(var0.s7, var0.x8),
                     com.aspose.slides.ms.System.Xml.v3.n5(
                        "Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately."
                     )
                  },
                  var3,
                  var4,
                  var5
               ),
               0
            );
         }

         n5(var1, var2, new XmlSchemaValidationException("The element {0} has incomplete content.", l6(var0.s7, var0.x8), var3, var4, var5), 0);
      }
   }

   public static String l6(ArrayList var0, boolean var1) {
      if (!var1) {
         return l6(var0);
      }

      String var2 = com.aspose.slides.ms.System.Xml.v3.n5("{0}as well as", " ");
      c1 var3 = null;
      c1 var4 = null;
      ArrayList var5 = new ArrayList();
      com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();
      if (var0.size() == 1) {
         var4 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(0), c1.class);
      } else {
         for (int var7 = 1; var7 < var0.size(); var7++) {
            var3 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var7 - 1), c1.class);
            var4 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var7), c1.class);
            com.aspose.slides.ms.System.Xml.k6 var8 = var3.u6();
            if (!com.aspose.slides.ms.System.d1.a6(var8.n5(), var4.u6().n5())) {
               var5.addItem(var8);
               n5(var5, var6);
               var5.clear();
               var6.n5(var2);
            } else {
               var5.addItem(var8);
            }
         }
      }

      var5.addItem(var4.u6());
      n5(var5, var6);
      return var6.toString();
   }

   private static String l6(ArrayList var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("'");
      var1.n5(var0.get_Item(0).toString());

      for (int var2 = 1; var2 < var0.size(); var2++) {
         var1.n5(" ");
         var1.n5(var0.get_Item(var2).toString());
      }

      var1.n5("'");
      return var1.toString();
   }

   private static void n5(ArrayList var0, com.aspose.slides.internal.l7h.a5 var1) {
      com.aspose.slides.ms.System.Xml.k6 var2 = null;
      var2 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(0), com.aspose.slides.ms.System.Xml.k6.class);
      if (var0.size() == 1) {
         if ("*".equals(var2.l6())) {
            n5(var1, var2.n5());
         } else if (var2.n5().length() != 0) {
            var1.n5(com.aspose.slides.ms.System.Xml.v3.n5("'{0}' in namespace '{1}'", var2.l6(), var2.n5()));
         } else {
            var1.n5(com.aspose.slides.ms.System.Xml.v3.n5("'{0}'", var2.l6()));
         }
      } else {
         boolean var3 = false;
         boolean var4 = true;
         com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();

         for (int var6 = 0; var6 < var0.size(); var6++) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var6), com.aspose.slides.ms.System.Xml.k6.class);
            if ("*".equals(var2.l6())) {
               var3 = true;
            } else {
               if (var4) {
                  var4 = false;
               } else {
                  var5.n5(", ");
               }

               var5.n5(var2.l6());
            }
         }

         if (var3) {
            var5.n5(", ");
            var5.n5(com.aspose.slides.ms.System.Xml.v3.n5("any element"));
         } else if (var2.n5().length() != 0) {
            var1.n5(com.aspose.slides.ms.System.Xml.v3.n5("'{0}' in namespace '{1}'", var5.toString(), var2.n5()));
         } else {
            var1.n5(com.aspose.slides.ms.System.Xml.v3.n5("'{0}'", var5.toString()));
         }
      }
   }

   private static void n5(com.aspose.slides.internal.l7h.a5 var0, String var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      if (!"##any".equals(var1) && !"##other".equals(var1)) {
         String[] var3 = com.aspose.slides.ms.System.Xml.f4.c4(var1);
         var2.n5(var3[0]);

         for (int var4 = 1; var4 < var3.length; var4++) {
            var2.n5(", ");
            var2.n5(var3[var4]);
         }
      } else {
         var2.n5(var1);
      }

      var0.n5(com.aspose.slides.ms.System.Xml.v3.n5("any element in namespace '{0}'", var2.toString()));
   }

   public static String n5(String var0, String var1) {
      return var1.length() != 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{var1, ":", var0}) : var0;
   }

   public static String n5(com.aspose.slides.ms.System.Xml.k6 var0) {
      return l6(var0.l6(), var0.n5());
   }

   public static String l6(String var0, String var1) {
      return var1.length() != 0
         ? com.aspose.slides.ms.System.Xml.v3.n5("'{0}' in namespace '{1}'", var0, var1)
         : com.aspose.slides.ms.System.Xml.v3.n5("'{0}'", var0);
   }

   private void h0(String var1) {
      if (this.t2) {
         com.aspose.slides.ms.System.Xml.o0 var2 = null;
         if (this.x8 != null) {
            var2 = this.x8.n5(var1);
         }

         if (var2 == null) {
            this.a6("Reference to an undeclared entity, '{0}'.", var1);
         } else if (var2.u3()) {
            this.a6("Reference to an unparsed entity, '{0}'.", var1);
         }
      }
   }

   private void c8(String var1) {
      this.a6(var1, com.aspose.slides.ms.System.d1.n5);
   }

   private void n5(String var1, String[] var2) {
      this.n5(new XmlSchemaValidationException(var1, var2, this.p8, this.a0.ah_(), this.a0.ai_()));
   }

   private void a6(String var1, String var2) {
      this.n5(new XmlSchemaValidationException(var1, var2, this.p8, this.a0.ah_(), this.a0.ai_()));
   }

   private void n5(String var1, String var2, String var3) {
      this.n5(new XmlSchemaValidationException(var1, new String[]{var2, var3}, this.p8, this.a0.ah_(), this.a0.ai_()));
   }

   private void n5(String var1, String[] var2, Exception var3, int var4) {
      if (var4 != 1 || this.s7()) {
         this.n5(new XmlSchemaValidationException(var1, var2, var3, this.p8, this.a0.ah_(), this.a0.ai_()), var4);
      }
   }

   private void n5(String var1, String[] var2, RuntimeException var3) {
      this.n5(new XmlSchemaValidationException(var1, var2, var3, this.p8, this.a0.ah_(), this.a0.ai_()), 0);
   }

   private void n5(XmlSchemaValidationException var1) {
      this.n5(var1, 0);
   }

   private void n5(XmlSchemaException var1) {
      this.n5(new XmlSchemaValidationException(var1.getGetRes(), var1.getArgs(), var1.getSourceUri(), var1.getLineNumber(), var1.getLinePosition()), 0);
   }

   private void n5(String var1, String var2, int var3) {
      if (var3 != 1 || this.s7()) {
         this.n5(new XmlSchemaValidationException(var1, var2, this.p8, this.a0.ah_(), this.a0.ai_()), var3);
      }
   }

   private void n5(XmlSchemaValidationException var1, int var2) {
      boolean var3 = false;
      if (var2 == 0) {
         var3 = true;
         this.e2.h0 = 2;
      }

      if (var3) {
         if (this.c4 == null) {
            throw var1;
         }

         this.c4.n5(this.y2, new i0(var1, var2));
      } else if (this.s7() && this.c4 != null) {
         this.c4.n5(this.y2, new i0(var1, var2));
      }
   }

   public static void n5(b4 var0, Object var1, XmlSchemaValidationException var2, int var3) {
      if (var0 != null) {
         var0.n5(var1, new i0(var2, var3));
      } else if (var3 == 0) {
         throw var2;
      }
   }

   // $VF: synthetic method
   static b4 n5(v7u var0, b4 var1) {
      return var0.j9 = var1;
   }

   // $VF: synthetic method
   static b4 n5(v7u var0) {
      return var0.c4;
   }

   // $VF: synthetic method
   static b4 l6(v7u var0, b4 var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static b4 l6(v7u var0) {
      return var0.j9;
   }
}
