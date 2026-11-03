package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.b8c.j9e;
import com.aspose.slides.ms.System.IDisposable;

public class y2 implements v4 {
   private u6 n5;
   private a5 l6;
   private z9 k5;
   private com.aspose.slides.internal.b8c.x0 u3;
   private u4 a6 = u4.n5().l6();
   private String u9 = com.aspose.slides.ms.System.d1.n5;
   private String h0 = com.aspose.slides.ms.System.d1.n5;
   private boolean c8 = true;
   private boolean t2 = false;
   private boolean s7 = true;
   private boolean x8 = false;
   private char[] n3;
   private int y4;
   private int e2;
   private int t9;
   private int z1;
   private int t4;
   private boolean q0;
   private int z3;
   private int m1;
   private com.aspose.slides.internal.l7h.a5 k7 = null;
   private int m3 = 0;
   private int z8 = 0;
   private boolean j5 = false;
   private boolean w1 = false;
   private com.aspose.slides.internal.l7h.a5 r4;
   private int c4 = 0;
   private y0 y2 = new y0(0, 0);
   private char y1 = '"';
   private String a0 = com.aspose.slides.ms.System.d1.n5;
   private String d2 = com.aspose.slides.ms.System.d1.n5;
   private Dictionary<String, y2$l6> d5 = null;
   private int[] s3 = null;

   private y2() {
   }

   public static v4 n5() {
      return new y2();
   }

   private void n5(u6 var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.v6g.k5.n5(var1, a5.class);
      this.k5 = var1.n5();
      a5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, a5.class);
      if (var2 != null) {
         this.t2 = var2.z1();
      }

      t1 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, t1.class);
      if (var3 != null) {
         this.x8 = var3.y4();
         this.c8 = var3.e2();
         this.s7 = var3.t9();
      }

      this.u3 = new com.aspose.slides.internal.b8c.x0();
      this.u3.n5(1);
      this.r4 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.ms.System.r8 var4 = var1.k5();
      if (var4 != null) {
         this.a0 = var4.toString();
      }

      this.j5 = false;
   }

   private void l6(String var1, String var2, String var3, String var4, String var5, u6 var6) {
      this.n5(var6);
      if (var2 != null && var2.length() != 0) {
         f4.n5(var2);
         int var7 = com.aspose.slides.ms.System.d1.u3(var2, ':');
         if (var7 == -1) {
            this.u3.n5(new k6(this.k5.n5(var2)));
         } else {
            this.u3.n5(new k6(this.k5.n5(com.aspose.slides.ms.System.d1.l6(var2, 0, var7)), this.k5.n5(com.aspose.slides.ms.System.d1.k5(var2, var7 + 1))));
         }

         if (var4 != null && var4.length() > 0) {
            int var8;
            if ((var8 = this.a6.k5(var4)) >= 0) {
               this.n5(this.e2, var4, var8);
            }

            this.u9 = var4;
         }

         if (var3 != null && var3.length() > 0) {
            int var10;
            if ((var10 = this.a6.u3(var3)) >= 0) {
               this.n5(this.e2, var3, var10);
            }

            this.h0 = var3;
         }

         if (var5 != null && var5.length() > 0) {
            this.n5.l6(var1, var5);
            this.w1 = true;
         }

         com.aspose.slides.ms.System.r8 var9 = this.n5.k5();
         if (var9 != null) {
            this.a0 = var9.toString();
         }

         this.j5 = true;
      } else {
         throw f4.n5(var2, "docTypeName");
      }
   }

   @Override
   public final z7 n5(u6 var1, boolean var2) {
      this.n5(var1);
      this.n5(var2);
      return this.u3;
   }

   @Override
   public final z7 n5(String var1, String var2, String var3, String var4, String var5, u6 var6) {
      this.l6(var1, var2, var3, var4, var5, var6);
      this.n5(false);
      return this.u3;
   }

   private boolean l6() {
      return this.m3 == 0;
   }

   private boolean k5() {
      return this.t9 == 26;
   }

   private boolean u3() {
      return this.n5.s7() == 0 && this.k7 != null;
   }

   private boolean a6() {
      return this.t9 == 0 || this.t9 == 32 && this.t4 == 0;
   }

   private boolean u9() {
      return this.s7;
   }

   private boolean h0() {
      return this.c8;
   }

   private void n5(boolean var1) {
      if (this.j5) {
         this.c8();
      } else {
         this.l6(var1);
      }

      this.u3.t4();
      if (this.t2 && this.d5 != null) {
         Dictionary$ValueCollection$Enumerator var2 = this.d5.getValues().iterator();

         try {
            while (var2.hasNext()) {
               y2$l6 var3 = (y2$l6)var2.next();

               for (y2$l6 var4 = var3; var4 != null; var4 = var4.u3) {
                  this.n5(0, new XmlSchemaException("The '{0}' notation is not declared.", var3.n5, this.n1(), var3.l6, var3.k5));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   private void l6(boolean var1) {
      this.j4();
      this.t9 = 2;
      this.z1 = 4;
      if (this.k5(false) != 23) {
         this.p6();
      }

      this.u3.n5(this.a6(true));
      int var2 = this.k5(false);
      if (var2 == 34 || var2 == 33) {
         String[] var3 = new String[]{this.h0};
         String[] var4 = new String[]{this.u9};
         this.n5(var2, 36, var3, var4);
         this.h0 = var3[0];
         this.u9 = var4[0];
         var2 = this.k5(false);
      }

      switch (var2) {
         case 29:
            break;
         case 31:
            if (var1) {
               this.i9();
               this.k7 = new com.aspose.slides.internal.l7h.a5();
            }

            this.t2();
            break;
         default:
            this.p6();
      }

      this.i9();
      if (this.u9 != null && this.u9.length() > 0) {
         this.s7();
      }
   }

   private void c8() {
      if (this.w1) {
         this.j4();
         this.t2();
         this.i9();
      }

      if (this.u9 != null && this.u9.length() > 0) {
         this.s7();
      }
   }

   private void t2() {
      this.x8();
   }

   private void s7() {
      if (this.n5.n5(this.u9, this.h0)) {
         com.aspose.slides.ms.System.r8 var1 = this.n5.k5();
         if (var1 != null) {
            this.d2 = var1.toString();
         }

         this.m3++;
         this.j4();
         this.x8();
      }
   }

   private void x8() {
      while (true) {
         int var1 = this.k5(false);
         int var2 = this.z8;
         switch (var1) {
            case 11:
               this.n3();
               break;
            case 12:
               this.y4();
               break;
            case 13:
               this.e2();
               break;
            case 14:
               this.t9();
               break;
            case 15:
               this.z1();
               break;
            case 16:
               this.t4();
               break;
            case 17:
               if (this.l6()) {
                  this.n5(this.e2 - 3, "A conditional section is not allowed in an internal subset.");
               }

               this.q0();
               var2 = this.z8;
               break;
            case 18:
               if (this.c4 > 0) {
                  this.c4--;
                  if (this.t2 && this.z8 != this.s3[this.c4]) {
                     this.n5(
                        this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5
                     );
                  }
               } else {
                  this.n5(this.e2 - 3, "']]>' is not expected.");
               }
               break;
            case 19:
               if (this.l6() && !this.j5) {
                  this.n5(this.e2, "Incomplete DTD content.");
               }

               if (this.c4 != 0) {
                  this.n5(this.e2, "There is an unclosed conditional section.");
               }

               return;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            default:
               break;
            case 32:
               if (this.l6()) {
                  if (this.c4 != 0) {
                     this.n5(this.e2, "There is an unclosed conditional section.");
                  }

                  if (this.k7 != null) {
                     this.l6(this.e2 - 1);
                     this.u3.l6(this.k7.toString());
                     this.k7 = null;
                  }

                  if (this.k5(false) != 29) {
                     this.l6(this.e2, ">");
                  }
               } else {
                  this.n5(this.e2, "Expected DTD markup was not found.");
               }

               return;
         }

         if (this.z8 != var2) {
            if (this.t2) {
               this.n5(this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5);
            } else if (!this.x8) {
               this.n5(this.e2, "The parameter entity replacement text must nest properly within markup declarations.");
            }
         }
      }
   }

   private void n3() {
      if (this.k5(true) != 23) {
         this.p6();
      } else {
         k6 var1 = this.a6(true);
         com.aspose.slides.internal.b8c.t6 var2 = null;
         com.aspose.slides.internal.b8c.t6[] var3 = new com.aspose.slides.internal.b8c.t6[]{var2};
         boolean var4 = !this.u3.h0().tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            var3[0] = var2;
            boolean var5 = !this.u3.c8().tryGetValue(var1, var3);
            var2 = var3[0];
            if (var5) {
               var2 = new com.aspose.slides.internal.b8c.t6(var1, var1.n5());
               this.u3.c8().addItem(var1, var2);
            }
         }

         com.aspose.slides.internal.b8c.h9 var9 = null;

         while (true) {
            switch (this.k5(false)) {
               case 23:
                  k6 var6 = this.a6(true);
                  var9 = new com.aspose.slides.internal.b8c.h9(var6, var6.n5());
                  var9.n5(!this.l6());
                  var9.l6(this.f5());
                  var9.n5(this.j3() - (this.e2 - this.z3));
                  boolean var10 = var2.l6(var9.z8()) != null;
                  this.n5(var9, var2, var10);
                  this.n5(var9, var10);
                  if (var9.j5().length() > 0 && com.aspose.slides.ms.System.d1.a6(var9.j5(), "xml")) {
                     if ("space".equals(var9.z8().l6())) {
                        if (this.x8) {
                           String var7 = com.aspose.slides.ms.System.d1.l6(var9.z1());
                           if (com.aspose.slides.ms.System.d1.a6(var7, "preserve") || com.aspose.slides.ms.System.d1.a6(var7, "default")) {
                              var9.u9(1);
                           }
                        } else {
                           var9.u9(1);
                           if (var9.t4() != 9) {
                              this.n5("Enumeration data type required.", com.aspose.slides.ms.System.d1.n5, var9.y4(), var9.n3());
                           }

                           if (this.t2) {
                              var9.n5(this.l6.t4());
                           }
                        }
                     } else if ("lang".equals(var9.z8().l6())) {
                        var9.u9(2);
                     }
                  }

                  if (!var10) {
                     var2.n5(var9);
                  }
                  break;
               case 29:
                  if (this.x8
                     && var9 != null
                     && var9.j5().length() > 0
                     && com.aspose.slides.ms.System.d1.a6(var9.j5(), "xml")
                     && "space".equals(var9.z8().l6())) {
                     var9.u9(1);
                     if (var9.a0().t2() != 9) {
                        this.n5("Enumeration data type required.", com.aspose.slides.ms.System.d1.n5, var9.y4(), var9.n3());
                     }

                     if (this.t2) {
                        var9.n5(this.l6.t4());
                     }
                  }

                  return;
               default:
                  this.p6();
                  return;
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.b8c.h9 var1, com.aspose.slides.internal.b8c.t6 var2, boolean var3) {
      int var4 = this.k5(true);
      if (var4 != 0) {
         var2.k5(true);
      }

      if (!this.k5(var4)) {
         if (var4 == 27) {
            var1.a6(9);
            var1.n5(j9e.k5(var1.a0().n3()));
            if (this.k5(false) != 25) {
               this.p6();
            } else {
               var1.k5(this.w2());

               while (true) {
                  switch (this.k5(false)) {
                     case 28:
                        return;
                     case 30:
                        if (this.k5(false) != 25) {
                           this.p6();
                           return;
                        }

                        String var7 = this.s0();
                        if (this.t2 && !this.x8 && var1.d2() != null && var1.d2().containsItem(var7) && !var3) {
                           this.n5(0, new XmlSchemaException("'{0}' is a duplicate enumeration value.", var7, this.n1(), this.f5(), this.j3()));
                        }

                        var1.k5(var7);
                        break;
                     default:
                        this.p6();
                        return;
                  }
               }
            }
         } else {
            this.p6();
         }
      } else {
         var1.a6(var4);
         var1.n5(j9e.k5(var1.a0().n3()));
         switch (var4) {
            case 1:
               if (this.t2 && var2.h0()) {
                  com.aspose.slides.internal.b8c.h9 var6 = var2.l6(var1.z8());
                  if ((var6 == null || var6.a0().t2() != 1) && !var3) {
                     this.n5(0, "The attribute of type ID is already declared on the '{0}' element.", var2.z8().toString());
                  }
               }

               var2.l6(true);
               return;
            case 8:
               if (this.t2) {
                  if (var2.y4() && !var3) {
                     this.n5(this.e2 - 8, 0, "No element type can have more than one NOTATION attribute specified.", var2.z8().toString());
                  } else {
                     if (var2.z1() != null && var2.z1().l6() == 1 && !var3) {
                        this.n5(this.e2 - 8, 0, "An attribute of type NOTATION must not be declared on an element declared EMPTY.", var2.z8().toString());
                     }

                     var2.u9(true);
                  }
               }

               if (this.k5(true) != 27) {
                  this.p6();
                  return;
               } else if (this.k5(false) != 24) {
                  this.p6();
                  return;
               } else {
                  label72:
                  while (true) {
                     String var5 = this.w2();
                     if (!this.u3.t9().containsKey(var5)) {
                        this.l6(var5);
                     }

                     if (this.t2 && !this.x8 && var1.d2() != null && var1.d2().containsItem(var5) && !var3) {
                        this.n5(0, new XmlSchemaException("'{0}' is a duplicate notation value.", var5, this.n1(), this.f5(), this.j3()));
                     }

                     var1.k5(var5);
                     switch (this.k5(false)) {
                        case 28:
                           return;
                        case 30:
                           if (this.k5(false) != 24) {
                              break label72;
                           }
                           break;
                        default:
                           this.p6();
                           return;
                     }
                  }

                  this.p6();
                  return;
               }
         }
      }
   }

   private void n5(com.aspose.slides.internal.b8c.h9 var1, boolean var2) {
      switch (this.k5(true)) {
         case 20:
            var1.h0(1);
            return;
         case 21:
            var1.h0(2);
            return;
         case 22:
            var1.h0(3);
            if (this.k5(true) != 35) {
               this.p6();
               return;
            }
         case 35:
            if (this.t2 && var1.a0().t2() == 1 && !var2) {
               this.n5(this.e2, 0, "An attribute of type ID must have a declared default of either #IMPLIED or #REQUIRED.", com.aspose.slides.ms.System.d1.n5);
            }

            if (var1.t4() != 0) {
               var1.n5(this.v3());
            } else {
               var1.n5(this.v8());
            }

            var1.u3(this.y2.n5);
            var1.k5(this.y2.l6 + 1);
            com.aspose.slides.internal.b8c.q1.n5(var1, this.n5);
            return;
         default:
            this.p6();
      }
   }

   private void y4() {
      if (this.k5(true) != 23) {
         this.p6();
      } else {
         com.aspose.slides.internal.b8c.t6 var1 = null;
         k6 var2 = this.a6(true);
         com.aspose.slides.internal.b8c.t6[] var3 = new com.aspose.slides.internal.b8c.t6[]{var1};
         boolean var4 = this.u3.h0().tryGetValue(var2, var3);
         var1 = var3[0];
         if (var4) {
            if (this.t2) {
               this.n5(this.e2 - var2.l6().length(), 0, "The '{0}' element has already been declared.", this.w2());
            }
         } else {
            var3[0] = var1;
            boolean var5 = this.u3.c8().tryGetValue(var2, var3);
            var1 = var3[0];
            if (var5) {
               this.u3.c8().removeItemByKey(var2);
            } else {
               var1 = new com.aspose.slides.internal.b8c.t6(var2, var2.n5());
            }

            this.u3.h0().addItem(var2, var1);
         }

         var1.n5(!this.l6());
         label30:
         switch (this.k5(true)) {
            case 27:
               int var8 = this.z8;
               switch (this.k5(false)) {
                  case 9:
                     com.aspose.slides.internal.b8c.l5 var9 = null;
                     var9 = new com.aspose.slides.internal.b8c.l5(2);
                     var9.a6();
                     var9.u9();
                     this.n5(var9, var8);
                     var1.n5(var9.l6(true));
                     break label30;
                  case 42:
                     com.aspose.slides.internal.b8c.l5 var6 = new com.aspose.slides.internal.b8c.l5(3);
                     var6.a6();
                     var6.u9();
                     this.l6(var6, var8);
                     var1.n5(var6.l6(true));
                     break label30;
                  default:
                     this.p6();
                     return;
               }
            case 44:
               var1.n5(com.aspose.slides.internal.b8c.z1.u3);
               break;
            case 45:
               var1.n5(com.aspose.slides.internal.b8c.z1.n5);
               break;
            default:
               this.p6();
               return;
         }

         if (this.k5(false) != 29) {
            this.l6(this.e2, ">");
         }
      }
   }

   private void n5(com.aspose.slides.internal.b8c.l5 var1, int var2) {
      Stack var3 = new Stack();
      y2$n5 var4 = new y2$n5(var2);
      var3.push(var4);

      label48:
      while (true) {
         switch (this.k5(false)) {
            case 23:
               var1.n5(this.a6(true), null);
               this.n5(var1);

               while (true) {
                  switch (this.k5(false)) {
                     case 28:
                        var1.h0();
                        if (this.t2 && this.z8 != var4.n5) {
                           this.n5(
                              this.e2,
                              0,
                              "The parameter entity replacement text must nest properly within markup declarations.",
                              com.aspose.slides.ms.System.d1.n5
                           );
                        }

                        this.n5(var1);
                        var3.pop();
                        if (var3.size() <= 0) {
                           return;
                        }

                        var4 = (y2$n5)var3.peek();
                        break;
                     case 29:
                        this.n5(this.e2, "Invalid content model.");
                        var3.pop();
                        if (var3.size() <= 0) {
                           return;
                        }

                        var4 = (y2$n5)var3.peek();
                        break;
                     case 30:
                        if (var4.l6 == 43) {
                           this.n5(this.e2, "Invalid content model.");
                        }

                        var1.c8();
                        var4.l6 = 30;
                        continue label48;
                     case 43:
                        if (var4.l6 == 30) {
                           this.n5(this.e2, "Invalid content model.");
                        }

                        var1.t2();
                        var4.l6 = 43;
                        continue label48;
                     default:
                        this.p6();
                        return;
                  }
               }
            case 27:
               var1.u9();
               var4 = new y2$n5(this.z8);
               var3.push(var4);
               break;
            case 29:
               this.n5(this.e2, "Invalid content model.");
               var3.pop();
               if (var3.size() > 0) {
                  var4 = (y2$n5)var3.peek();
                  this.p6();
                  return;
               }

               return;
            default:
               this.p6();
               return;
         }
      }
   }

   private void n5(com.aspose.slides.internal.b8c.l5 var1) {
      switch (this.k5(false)) {
         case 39:
            var1.s7();
            return;
         case 40:
            var1.n3();
            return;
         case 41:
            var1.x8();
            return;
      }
   }

   private void l6(com.aspose.slides.internal.b8c.l5 var1, int var2) {
      boolean var3 = false;
      int var4 = -1;
      int var5 = this.z8;

      while (true) {
         switch (this.k5(false)) {
            case 28:
               var1.h0();
               if (this.t2 && this.z8 != var2) {
                  this.n5(this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5);
               }

               if (this.k5(false) == 39 && var3) {
                  var1.s7();
               } else if (var3) {
                  this.l6(this.e2, "*");
               }

               return;
            case 30:
               if (!var3) {
                  var3 = true;
               } else {
                  var1.c8();
               }

               if (this.t2) {
                  var4 = this.z8;
                  if (var5 < var4) {
                     this.n5(
                        this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5
                     );
                  }
               }

               if (this.k5(false) != 23) {
                  this.p6();
               } else {
                  k6 var6 = this.a6(true);
                  if (var1.n5(var6) && this.t2) {
                     this.n5(0, "The '{0}' element already exists in the content model.", var6.toString());
                  }

                  var1.n5(var6, null);
                  if (this.t2) {
                     var5 = this.z8;
                     if (var5 < var4) {
                        this.n5(
                           this.e2,
                           0,
                           "The parameter entity replacement text must nest properly within markup declarations.",
                           com.aspose.slides.ms.System.d1.n5
                        );
                     }
                  }
               }
               break;
            default:
               this.p6();
         }
      }
   }

   private void e2() {
      boolean var1 = false;
      com.aspose.slides.internal.b8c.v6 var2 = null;
      switch (this.k5(true)) {
         case 24:
            k6 var10 = this.a6(false);
            var2 = new com.aspose.slides.internal.b8c.v6(var10, var1);
            var2.a6(this.n1());
            var2.u9(this.d2.length() == 0 ? this.a0 : this.d2);
            if (var1) {
               if (!this.u3.s7().containsKey(var10)) {
                  this.u3.s7().addItem(var10, var2);
               }
            } else if (!this.u3.t2().containsKey(var10)) {
               this.u3.t2().addItem(var10, var2);
            }

            var2.l6(!this.l6());
            var2.k5(true);
            break;
         case 38:
            var1 = true;
            if (this.k5(true) != 24) {
               this.p6();
               return;
            }

            k6 var3 = this.a6(false);
            var2 = new com.aspose.slides.internal.b8c.v6(var3, var1);
            var2.a6(this.n1());
            var2.u9(this.d2.length() == 0 ? this.a0 : this.d2);
            if (var1) {
               if (!this.u3.s7().containsKey(var3)) {
                  this.u3.s7().addItem(var3, var2);
               }
            } else if (!this.u3.t2().containsKey(var3)) {
               this.u3.t2().addItem(var3, var2);
            }

            var2.l6(!this.l6());
            var2.k5(true);
            break;
         default:
            this.p6();
            return;
      }

      int var11 = this.k5(true);
      switch (var11) {
         case 33:
         case 34:
            String var4 = null;
            String var5 = null;
            String[] var6 = new String[]{var5};
            String[] var7 = new String[]{var4};
            this.n5(var11, 13, var6, var7);
            var5 = var6[0];
            var4 = var7[0];
            var2.n5(true);
            var2.l6(var4);
            var2.k5(var5);
            if (this.k5(false) == 37) {
               if (var1) {
                  this.l6(this.e2 - 5, ">");
               }

               if (!this.q0) {
                  this.l6(this.e2 - 5, "'{0}' is an unexpected token. Expecting white space.", "NDATA");
               }

               if (this.k5(true) != 24) {
                  this.p6();
                  return;
               }

               var2.n5(this.a6(false));
               String var8 = var2.q0().l6();
               if (!this.u3.t9().containsKey(var8)) {
                  this.l6(var8);
               }
            }
            break;
         case 35:
            var2.u3(this.v8());
            var2.n5(this.y2.n5);
            var2.l6(this.y2.l6);
            break;
         default:
            this.p6();
            return;
      }

      if (this.k5(false) == 29) {
         var2.k5(false);
      } else {
         this.p6();
      }
   }

   private void t9() {
      if (this.k5(true) != 24) {
         this.p6();
      }

      k6 var1 = this.a6(false);
      com.aspose.slides.internal.b8c.i2 var2 = null;
      if (!this.u3.t9().containsKey(var1.l6())) {
         if (this.d5 != null) {
            this.d5.removeItemByKey(var1.l6());
         }

         var2 = new com.aspose.slides.internal.b8c.i2(var1);
         this.u3.t9().addItem(var2.n5().l6(), var2);
      } else if (this.t2) {
         this.n5(this.e2 - var1.l6().length(), 0, "The notation '{0}' has already been declared.", var1.l6());
      }

      int var3 = this.k5(true);
      if (var3 != 34 && var3 != 33) {
         this.p6();
      } else {
         String var4 = null;
         String var5 = null;
         String[] var6 = new String[]{var4};
         String[] var7 = new String[]{var5};
         this.n5(var3, 8, var6, var7);
         var4 = var6[0];
         var5 = var7[0];
         if (var2 != null) {
            var2.n5(var5);
            var2.l6(var4);
         }
      }

      if (this.k5(false) != 29) {
         this.p6();
      }
   }

   private void l6(String var1) {
      if (this.d5 == null) {
         this.d5 = new Dictionary<>();
      }

      y2$l6 var2 = new y2$l6(var1, this.f5(), this.j3() - var1.length());
      y2$l6 var3 = null;
      y2$l6[] var4 = new y2$l6[]{var3};
      boolean var5 = this.d5.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var2.u3 = var3.u3;
         var3.u3 = var2;
      } else {
         this.d5.addItem(var1, var2);
      }
   }

   private void z1() {
      this.i9();

      try {
         if (this.u3()) {
            this.n5.k5(this.k7);
            this.k7.n5("-->");
         } else {
            this.n5.k5(null);
         }
      } catch (XmlException var2) {
         if (!"Unexpected end of file while parsing {0} has occurred.".equals(var2.getResString()) || this.z8 == 0) {
            throw var2;
         }

         this.n5(0, "The parameter entity replacement text must nest properly within markup declarations.", (String)null);
      }

      this.j4();
   }

   private void t4() {
      this.i9();
      if (this.u3()) {
         this.n5.l6(this.k7);
         this.k7.n5("?>");
      } else {
         this.n5.l6(null);
      }

      this.j4();
   }

   private void q0() {
      int var1 = this.z8;
      switch (this.k5(false)) {
         case 46:
            if (this.k5(false) != 31) {
               this.p6();
            } else {
               if (this.t2 && var1 != this.z8) {
                  this.n5(this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5);
               }

               if (this.k5(false) != 18) {
                  this.p6();
               } else if (this.t2 && var1 != this.z8) {
                  this.n5(this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5);
               }
            }
            break;
         case 47:
            if (this.k5(false) != 31) {
               this.p6();
            } else {
               if (this.t2 && var1 != this.z8) {
                  this.n5(this.e2, 0, "The parameter entity replacement text must nest properly within markup declarations.", com.aspose.slides.ms.System.d1.n5);
               }

               if (this.t2) {
                  if (this.s3 == null) {
                     this.s3 = new int[2];
                  } else if (this.s3.length == this.c4) {
                     int[] var2 = new int[this.s3.length * 2];
                     com.aspose.slides.ms.System.u3.n5(
                        com.aspose.slides.ms.System.u3.n5((Object)(this.s3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, this.s3.length
                     );
                     this.s3 = var2;
                  }

                  this.s3[this.c4] = var1;
               }

               this.c4++;
            }
            break;
         default:
            this.p6();
      }
   }

   private void n5(int var1, int var2, String[] var3, String[] var4) {
      y0 var5 = new y0(this.f5(), this.j3() - 6);
      var3[0] = null;
      var4[0] = null;
      if (this.k5(true) != 35) {
         this.k5(this.e2, "\"", "'");
      }

      if (var1 == 34) {
         var4[0] = this.v8();
         if (com.aspose.slides.ms.System.d1.u3(var4[0], '#') >= 0) {
            this.n5(
               this.e2 - var4[0].length() - 1,
               "Fragment identifier '{0}' cannot be part of the system identifier '{1}'.",
               new String[]{com.aspose.slides.ms.System.d1.k5(var4[0], com.aspose.slides.ms.System.d1.u3(var4[0], '#')), var4[0]}
            );
         }

         if (var2 == 36 && !this.j5) {
            this.y2.l6++;
            this.n5.n5(var4[0], var5.n5(), this.y2.n5());
         }
      } else {
         var3[0] = this.v8();
         int var6;
         if ((var6 = this.a6.u3(var3[0])) >= 0) {
            this.n5(this.e2 - 1 - var3[0].length() + var6, var3[0], var6);
         }

         if (var2 == 36 && !this.j5) {
            this.y2.l6++;
            this.n5.l6(var3[0], var5.n5(), this.y2.n5());
            if (this.k5(false) == 35) {
               if (!this.q0) {
                  this.n5("'{0}' is an unexpected token. Expecting white space.", com.aspose.slides.ms.System.d1.n5(this.y1, 1), this.y2.n5, this.y2.l6);
               }

               var4[0] = this.v8();
               this.y2.l6++;
               this.n5.n5(var4[0], var5.n5(), this.y2.n5());
            } else {
               this.k5(this.e2, "\"", "'");
            }
         } else if (this.k5(false) == 35) {
            if (!this.q0) {
               this.n5("'{0}' is an unexpected token. Expecting white space.", com.aspose.slides.ms.System.d1.n5(this.y1, 1), this.y2.n5, this.y2.l6);
            }

            var4[0] = this.v8();
         } else if (var2 != 8) {
            this.k5(this.e2, "\"", "'");
         }
      }
   }

   private int k5(boolean var1) {
      this.q0 = false;

      while (true) {
         switch (this.n3[this.e2]) {
            case '\u0000':
               if (this.e2 == this.y4) {
                  if ((this.n5.t2() || this.g7() == 0) && !this.u9(false)) {
                     if (this.t9 == 0) {
                        return 19;
                     }

                     this.n5(this.e2, "Incomplete DTD content.");
                  }
               } else {
                  this.n5(this.n3, this.y4, this.e2);
                  if ((this.n5.t2() || this.g7() == 0) && !this.u9(false)) {
                     if (this.t9 == 0) {
                        return 19;
                     }

                     this.n5(this.e2, "Incomplete DTD content.");
                  }
               }
               break;
            case '\t':
            case ' ':
               this.q0 = true;
               this.e2++;
               break;
            case '\n':
               this.q0 = true;
               this.e2++;
               this.n5.l6(this.e2);
               break;
            case '\r':
               this.q0 = true;
               if (this.n3[this.e2 + 1] == '\n') {
                  if (this.h0()) {
                     this.i9();
                     this.n5.n5(this.n5.u9() + 1);
                  }

                  this.e2 += 2;
               } else {
                  if (this.e2 + 1 >= this.y4 && !this.n5.t2()) {
                     if ((this.n5.t2() || this.g7() == 0) && !this.u9(false)) {
                        if (this.t9 == 0) {
                           return 19;
                        }

                        this.n5(this.e2, "Incomplete DTD content.");
                     }
                     break;
                  }

                  this.n3[this.e2] = '\n';
                  this.e2++;
               }

               this.n5.l6(this.e2);
               break;
            case '%':
               if (this.y4 - this.e2 < 2) {
                  if ((this.n5.t2() || this.g7() == 0) && !this.u9(false)) {
                     if (this.t9 == 0) {
                        return 19;
                     }

                     this.n5(this.e2, "Incomplete DTD content.");
                  }
               } else {
                  if (this.a6.n5(this.n3[this.e2 + 1])) {
                     if (var1 && !this.q0 && this.t9 != 32) {
                        this.l6(this.e2, "'{0}' is an unexpected token. Expecting white space.", this.u3(this.e2));
                     }

                     this.z3 = this.e2;

                     while (true) {
                        switch (this.t9) {
                           case 0:
                              return this.z3();
                           case 1:
                              return this.m1();
                           case 2:
                              return this.k7();
                           case 3:
                              return this.m3();
                           case 4:
                              return this.z8();
                           case 5:
                              return this.j5();
                           case 6:
                              return this.r4();
                           case 7:
                              return this.c4();
                           case 8:
                              return this.y2();
                           case 9:
                              return this.y1();
                           case 10:
                              return this.a0();
                           case 11:
                              return this.d2();
                           case 12:
                              return this.d5();
                           case 13:
                              return this.s3();
                           case 14:
                              return this.p8();
                           case 15:
                              return this.f2();
                           case 16:
                              return this.i1();
                           case 17:
                              return this.e5();
                           case 18:
                              return this.b3();
                           case 19:
                              return this.o0();
                           case 20:
                              return this.t1();
                           case 21:
                              return this.a5();
                           case 22:
                              return this.h2();
                           case 23:
                              return this.v4();
                           case 24:
                              return this.a3();
                           case 25:
                              return this.p3();
                           case 26:
                              return this.x9();
                           case 27:
                           default:
                              return 9;
                           case 28:
                              return this.u6();
                           case 29:
                              return this.v0();
                           case 30:
                              return this.f0();
                           case 31:
                              return this.w1();
                           case 32:
                              this.q0 = true;
                              this.t9 = this.t4;
                        }
                     }
                  }

                  if (this.k5()) {
                     this.e2++;
                  } else {
                     this.n5(true, false, false);
                  }
               }
               break;
            default:
               if (var1 && !this.q0 && this.t9 != 32) {
                  this.l6(this.e2, "'{0}' is an unexpected token. Expecting white space.", this.u3(this.e2));
               }

               this.z3 = this.e2;

               while (true) {
                  switch (this.t9) {
                     case 0:
                        return this.z3();
                     case 1:
                        return this.m1();
                     case 2:
                        return this.k7();
                     case 3:
                        return this.m3();
                     case 4:
                        return this.z8();
                     case 5:
                        return this.j5();
                     case 6:
                        return this.r4();
                     case 7:
                        return this.c4();
                     case 8:
                        return this.y2();
                     case 9:
                        return this.y1();
                     case 10:
                        return this.a0();
                     case 11:
                        return this.d2();
                     case 12:
                        return this.d5();
                     case 13:
                        return this.s3();
                     case 14:
                        return this.p8();
                     case 15:
                        return this.f2();
                     case 16:
                        return this.i1();
                     case 17:
                        return this.e5();
                     case 18:
                        return this.b3();
                     case 19:
                        return this.o0();
                     case 20:
                        return this.t1();
                     case 21:
                        return this.a5();
                     case 22:
                        return this.h2();
                     case 23:
                        return this.v4();
                     case 24:
                        return this.a3();
                     case 25:
                        return this.p3();
                     case 26:
                        return this.x9();
                     case 27:
                     default:
                        return 9;
                     case 28:
                        return this.u6();
                     case 29:
                        return this.v0();
                     case 30:
                        return this.f0();
                     case 31:
                        return this.w1();
                     case 32:
                        this.q0 = true;
                        this.t9 = this.t4;
                  }
               }
         }
      }
   }

   private int z3() {
      while (true) {
         label195:
         switch (this.n3[this.e2]) {
            case '<':
               switch (this.n3[this.e2 + 1]) {
                  case '!':
                     switch (this.n3[this.e2 + 2]) {
                        case '-':
                           if (this.n3[this.e2 + 3] == '-') {
                              this.e2 += 4;
                              return 15;
                           }

                           if (this.y4 - this.e2 < 4) {
                              if (this.g7() == 0) {
                                 this.n5(this.y4, "Incomplete DTD content.");
                              }
                              continue;
                           }

                           this.n5(this.e2, "Expected DTD markup was not found.");
                           break label195;
                        case 'A':
                           if (this.y4 - this.e2 < 9) {
                              if (this.g7() == 0) {
                                 this.n5(this.y4, "Incomplete DTD content.");
                              }
                              continue;
                           }

                           if (this.n3[this.e2 + 3] != 'T'
                              || this.n3[this.e2 + 4] != 'T'
                              || this.n3[this.e2 + 5] != 'L'
                              || this.n3[this.e2 + 6] != 'I'
                              || this.n3[this.e2 + 7] != 'S'
                              || this.n3[this.e2 + 8] != 'T') {
                              this.n5(this.e2, "Expected DTD markup was not found.");
                           }

                           this.e2 += 9;
                           this.t9 = 2;
                           this.z1 = 13;
                           return 11;
                        case 'E':
                           if (this.n3[this.e2 + 3] == 'L') {
                              if (this.y4 - this.e2 < 9) {
                                 if (this.g7() == 0) {
                                    this.n5(this.y4, "Incomplete DTD content.");
                                 }
                                 continue;
                              }

                              if (this.n3[this.e2 + 4] != 'E'
                                 || this.n3[this.e2 + 5] != 'M'
                                 || this.n3[this.e2 + 6] != 'E'
                                 || this.n3[this.e2 + 7] != 'N'
                                 || this.n3[this.e2 + 8] != 'T') {
                                 this.n5(this.e2, "Expected DTD markup was not found.");
                              }

                              this.e2 += 9;
                              this.t9 = 2;
                              this.z1 = 6;
                              return 12;
                           }

                           if (this.n3[this.e2 + 3] == 'N') {
                              if (this.y4 - this.e2 < 8) {
                                 if (this.g7() == 0) {
                                    this.n5(this.y4, "Incomplete DTD content.");
                                 }
                                 continue;
                              }

                              if (this.n3[this.e2 + 4] != 'T' || this.n3[this.e2 + 5] != 'I' || this.n3[this.e2 + 6] != 'T' || this.n3[this.e2 + 7] != 'Y') {
                                 this.n5(this.e2, "Expected DTD markup was not found.");
                              }

                              this.e2 += 8;
                              this.t9 = 20;
                              return 13;
                           }

                           if (this.y4 - this.e2 < 4) {
                              if (this.g7() == 0) {
                                 this.n5(this.y4, "Incomplete DTD content.");
                              }
                              continue;
                           }

                           this.n5(this.e2, "Expected DTD markup was not found.");
                           return 9;
                        case 'N':
                           if (this.y4 - this.e2 < 10) {
                              if (this.g7() == 0) {
                                 this.n5(this.y4, "Incomplete DTD content.");
                              }
                              continue;
                           }

                           if (this.n3[this.e2 + 3] != 'O'
                              || this.n3[this.e2 + 4] != 'T'
                              || this.n3[this.e2 + 5] != 'A'
                              || this.n3[this.e2 + 6] != 'T'
                              || this.n3[this.e2 + 7] != 'I'
                              || this.n3[this.e2 + 8] != 'O'
                              || this.n3[this.e2 + 9] != 'N') {
                              this.n5(this.e2, "Expected DTD markup was not found.");
                           }

                           this.e2 += 10;
                           this.t9 = 1;
                           this.z1 = 23;
                           return 14;
                        case '[':
                           this.e2 += 3;
                           this.t9 = 24;
                           return 17;
                        default:
                           if (this.y4 - this.e2 < 3) {
                              if (this.g7() == 0) {
                                 this.n5(this.y4, "Incomplete DTD content.");
                              }
                              continue;
                           }

                           this.n5(this.e2 + 2, "Expected DTD markup was not found.");
                           break label195;
                     }
                  case '?':
                     this.e2 += 2;
                     return 16;
                  default:
                     if (this.y4 - this.e2 < 2) {
                        if (this.g7() == 0) {
                           this.n5(this.y4, "Incomplete DTD content.");
                        }
                        continue;
                     }

                     this.n5(this.e2, "Expected DTD markup was not found.");
                     return 9;
               }
            case ']':
               if (this.y4 - this.e2 < 2 && !this.n5.t2()) {
                  if (this.g7() == 0) {
                     this.n5(this.y4, "Incomplete DTD content.");
                  }
                  continue;
               }

               if (this.n3[this.e2 + 1] != ']') {
                  this.e2++;
                  this.t9 = 31;
                  return 32;
               }

               if (this.y4 - this.e2 < 3 && !this.n5.t2()) {
                  if (this.g7() == 0) {
                     this.n5(this.y4, "Incomplete DTD content.");
                  }
                  continue;
               }

               if (this.n3[this.e2 + 1] == ']' && this.n3[this.e2 + 2] == '>') {
                  this.e2 += 3;
                  return 18;
               }

               if (this.y4 - this.e2 == 0) {
                  if (this.g7() == 0) {
                     this.n5(this.y4, "Incomplete DTD content.");
                  }
                  continue;
               }

               this.n5(this.e2, "Expected DTD markup was not found.");
               break;
            default:
               if (this.y4 - this.e2 == 0) {
                  if (this.g7() == 0) {
                     this.n5(this.y4, "Incomplete DTD content.");
                  }
                  continue;
               }

               this.n5(this.e2, "Expected DTD markup was not found.");
         }

         if (this.g7() == 0) {
            this.n5(this.y4, "Incomplete DTD content.");
         }
      }
   }

   private int m1() {
      this.y0();
      this.t9 = this.z1;
      return 24;
   }

   private int k7() {
      this.j9();
      this.t9 = this.z1;
      return 23;
   }

   private int m3() {
      this.e9();
      this.t9 = this.z1;
      return 25;
   }

   private int z8() {
      switch (this.n3[this.e2]) {
         case '>':
            this.e2++;
            this.t9 = 0;
            return 29;
         case 'P':
            if (!this.o5()) {
               this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            }

            this.z1 = 5;
            this.t9 = 29;
            return 33;
         case 'S':
            if (!this.j8()) {
               this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            }

            this.z1 = 5;
            this.t9 = 28;
            return 34;
         case '[':
            this.e2++;
            this.t9 = 0;
            return 31;
         default:
            this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            return 9;
      }
   }

   private int j5() {
      switch (this.n3[this.e2]) {
         case '>':
            this.e2++;
            this.t9 = 0;
            return 29;
         case '[':
            this.e2++;
            this.t9 = 0;
            return 31;
         default:
            this.n5(this.e2, "Expecting an internal subset or the end of the DOCTYPE declaration.");
            return 9;
      }
   }

   private int w1() {
      if (this.n3[this.e2] != '>') {
         this.l6(this.e2, ">");
      }

      this.e2++;
      this.t9 = 0;
      return 29;
   }

   private int r4() {
      while (true) {
         switch (this.n3[this.e2]) {
            case '(':
               this.t9 = 7;
               this.e2++;
               return 27;
            case 'A':
               if (this.y4 - this.e2 < 3) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               if (this.n3[this.e2 + 1] == 'N' && this.n3[this.e2 + 2] == 'Y') {
                  this.e2 += 3;
                  this.t9 = 31;
                  return 44;
               }

               this.n5(this.e2, "Invalid content model.");
               break;
            case 'E':
               if (this.y4 - this.e2 < 5) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               if (this.n3[this.e2 + 1] == 'M' && this.n3[this.e2 + 2] == 'P' && this.n3[this.e2 + 3] == 'T' && this.n3[this.e2 + 4] == 'Y') {
                  this.e2 += 5;
                  this.t9 = 31;
                  return 45;
               }

               this.n5(this.e2, "Invalid content model.");
               break;
            default:
               this.n5(this.e2, "Invalid content model.");
         }

         if (this.g7() == 0) {
            this.n5(this.e2, "Incomplete DTD content.");
         }
      }
   }

   private int c4() {
      if (this.n3[this.e2] == '#') {
         while (this.y4 - this.e2 < 7) {
            if (this.g7() == 0) {
               this.n5(this.e2, "Incomplete DTD content.");
            }
         }

         if (this.n3[this.e2 + 1] == 'P'
            && this.n3[this.e2 + 2] == 'C'
            && this.n3[this.e2 + 3] == 'D'
            && this.n3[this.e2 + 4] == 'A'
            && this.n3[this.e2 + 5] == 'T'
            && this.n3[this.e2 + 6] == 'A') {
            this.e2 += 7;
            this.t9 = 11;
            return 42;
         }

         this.n5(this.e2 + 1, "Expecting 'PCDATA'.");
      }

      this.t9 = 8;
      return 9;
   }

   private int y2() {
      switch (this.n3[this.e2]) {
         case '(':
            this.e2++;
            return 27;
         case '>':
            this.e2++;
            this.t9 = 0;
            return 29;
         default:
            this.j9();
            this.t9 = 9;
            return 23;
      }
   }

   private int y1() {
      this.t9 = 10;
      byte var1;
      switch (this.n3[this.e2]) {
         case '*':
            var1 = 39;
            break;
         case '+':
            var1 = 41;
            break;
         case '?':
            var1 = 40;
            break;
         default:
            return 9;
      }

      if (this.q0) {
         this.n5(this.e2, "White space not allowed before '?', '*', or '+'.");
      }

      this.e2++;
      return var1;
   }

   private int a0() {
      switch (this.n3[this.e2]) {
         case ')':
            this.e2++;
            this.t9 = 9;
            return 28;
         case ',':
            this.e2++;
            this.t9 = 8;
            return 43;
         case '>':
            this.e2++;
            this.t9 = 0;
            return 29;
         case '|':
            this.e2++;
            this.t9 = 8;
            return 30;
         default:
            this.n5(this.e2, "Expecting '?', '*', or '+'.");
            return 9;
      }
   }

   private int d2() {
      switch (this.n3[this.e2]) {
         case ')':
            this.e2++;
            this.t9 = 12;
            return 28;
         case '|':
            this.e2++;
            this.z1 = 11;
            this.t9 = 2;
            return 30;
         default:
            this.k5(this.e2, ")", "|");
            return 9;
      }
   }

   private int d5() {
      this.t9 = 31;
      if (this.n3[this.e2] == '*' && !this.q0) {
         this.e2++;
         return 39;
      } else {
         return 9;
      }
   }

   private int s3() {
      switch (this.n3[this.e2]) {
         case '>':
            this.e2++;
            this.t9 = 0;
            return 29;
         default:
            if (!this.q0) {
               this.l6(this.e2, "'{0}' is an unexpected token. Expecting white space.", this.u3(this.e2));
            }

            this.j9();
            this.t9 = 14;
            return 23;
      }
   }

   private int p8() {
      while (true) {
         label139:
         switch (this.n3[this.e2]) {
            case '(':
               this.e2++;
               this.t9 = 3;
               this.z1 = 17;
               return 27;
            case 'C':
               if (this.y4 - this.e2 < 5) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               if (this.n3[this.e2 + 1] != 'D' || this.n3[this.e2 + 2] != 'A' || this.n3[this.e2 + 3] != 'T' || this.n3[this.e2 + 4] != 'A') {
                  this.n5(this.e2, "Invalid attribute type.");
               }

               this.e2 += 5;
               this.t9 = 18;
               return 0;
            case 'E':
               if (this.y4 - this.e2 < 9) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               this.t9 = 18;
               if (this.n3[this.e2 + 1] != 'N' || this.n3[this.e2 + 2] != 'T' || this.n3[this.e2 + 3] != 'I' || this.n3[this.e2 + 4] != 'T') {
                  this.n5(this.e2, "'{0}' is an invalid attribute type.");
               }

               switch (this.n3[this.e2 + 5]) {
                  case 'I':
                     if (this.n3[this.e2 + 6] != 'E' || this.n3[this.e2 + 7] != 'S') {
                        this.n5(this.e2, "'{0}' is an invalid attribute type.");
                     }

                     this.e2 += 8;
                     return 5;
                  case 'Y':
                     this.e2 += 6;
                     return 4;
                  default:
                     this.n5(this.e2, "'{0}' is an invalid attribute type.");
                     break label139;
               }
            case 'I':
               if (this.y4 - this.e2 < 6) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               this.t9 = 18;
               if (this.n3[this.e2 + 1] != 'D') {
                  this.n5(this.e2, "'{0}' is an invalid attribute type.");
               }

               if (this.n3[this.e2 + 2] != 'R') {
                  this.e2 += 2;
                  return 1;
               }

               if (this.n3[this.e2 + 3] != 'E' || this.n3[this.e2 + 4] != 'F') {
                  this.n5(this.e2, "'{0}' is an invalid attribute type.");
               }

               if (this.n3[this.e2 + 5] != 'S') {
                  this.e2 += 5;
                  return 2;
               }

               this.e2 += 6;
               return 3;
            case 'N':
               if (this.y4 - this.e2 < 8 && !this.n5.t2()) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               switch (this.n3[this.e2 + 1]) {
                  case 'M':
                     if (this.n3[this.e2 + 2] != 'T'
                        || this.n3[this.e2 + 3] != 'O'
                        || this.n3[this.e2 + 4] != 'K'
                        || this.n3[this.e2 + 5] != 'E'
                        || this.n3[this.e2 + 6] != 'N') {
                        this.n5(this.e2, "'{0}' is an invalid attribute type.");
                     }

                     this.t9 = 18;
                     if (this.n3[this.e2 + 7] == 'S') {
                        this.e2 += 8;
                        return 7;
                     }

                     this.e2 += 7;
                     return 6;
                  case 'O':
                     if (this.n3[this.e2 + 2] != 'T'
                        || this.n3[this.e2 + 3] != 'A'
                        || this.n3[this.e2 + 4] != 'T'
                        || this.n3[this.e2 + 5] != 'I'
                        || this.n3[this.e2 + 6] != 'O'
                        || this.n3[this.e2 + 7] != 'N') {
                        this.n5(this.e2, "'{0}' is an invalid attribute type.");
                     }

                     this.e2 += 8;
                     this.t9 = 15;
                     return 8;
                  default:
                     this.n5(this.e2, "'{0}' is an invalid attribute type.");
                     break label139;
               }
            default:
               this.n5(this.e2, "'{0}' is an invalid attribute type.");
         }

         if (this.g7() == 0) {
            this.n5(this.e2, "Incomplete DTD content.");
         }
      }
   }

   private int f2() {
      if (this.n3[this.e2] == '(') {
         this.e2++;
         this.t9 = 1;
         this.z1 = 16;
         return 27;
      } else {
         this.l6(this.e2, "(");
         return 9;
      }
   }

   private int i1() {
      switch (this.n3[this.e2]) {
         case ')':
            this.e2++;
            this.t9 = 18;
            return 28;
         case '|':
            this.e2++;
            this.t9 = 1;
            this.z1 = 16;
            return 30;
         default:
            this.k5(this.e2, ")", "|");
            return 9;
      }
   }

   private int e5() {
      switch (this.n3[this.e2]) {
         case ')':
            this.e2++;
            this.t9 = 18;
            return 28;
         case '|':
            this.e2++;
            this.t9 = 3;
            this.z1 = 17;
            return 30;
         default:
            this.k5(this.e2, ")", "|");
            return 9;
      }
   }

   private int b3() {
      while (true) {
         label84:
         switch (this.n3[this.e2]) {
            case '"':
            case '\'':
               this.n5(0);
               this.t9 = 13;
               return 35;
            case '#':
               if (this.y4 - this.e2 < 6) {
                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  continue;
               }

               switch (this.n3[this.e2 + 1]) {
                  case 'F':
                     if (this.n3[this.e2 + 2] != 'I' || this.n3[this.e2 + 3] != 'X' || this.n3[this.e2 + 4] != 'E' || this.n3[this.e2 + 5] != 'D') {
                        this.n5(this.e2, "Expecting an attribute type.");
                     }

                     this.e2 += 6;
                     this.t9 = 19;
                     return 22;
                  case 'I':
                     if (this.y4 - this.e2 < 8) {
                        if (this.g7() == 0) {
                           this.n5(this.e2, "Incomplete DTD content.");
                        }
                        continue;
                     }

                     if (this.n3[this.e2 + 2] != 'M'
                        || this.n3[this.e2 + 3] != 'P'
                        || this.n3[this.e2 + 4] != 'L'
                        || this.n3[this.e2 + 5] != 'I'
                        || this.n3[this.e2 + 6] != 'E'
                        || this.n3[this.e2 + 7] != 'D') {
                        this.n5(this.e2, "Expecting an attribute type.");
                     }

                     this.e2 += 8;
                     this.t9 = 13;
                     return 21;
                  case 'R':
                     if (this.y4 - this.e2 < 9) {
                        if (this.g7() == 0) {
                           this.n5(this.e2, "Incomplete DTD content.");
                        }
                        continue;
                     }

                     if (this.n3[this.e2 + 2] != 'E'
                        || this.n3[this.e2 + 3] != 'Q'
                        || this.n3[this.e2 + 4] != 'U'
                        || this.n3[this.e2 + 5] != 'I'
                        || this.n3[this.e2 + 6] != 'R'
                        || this.n3[this.e2 + 7] != 'E'
                        || this.n3[this.e2 + 8] != 'D') {
                        this.n5(this.e2, "Expecting an attribute type.");
                     }

                     this.e2 += 9;
                     this.t9 = 13;
                     return 20;
                  default:
                     this.n5(this.e2, "Expecting an attribute type.");
                     break label84;
               }
            default:
               this.n5(this.e2, "Expecting an attribute type.");
         }

         if (this.g7() == 0) {
            this.n5(this.e2, "Incomplete DTD content.");
         }
      }
   }

   private int o0() {
      switch (this.n3[this.e2]) {
         case '"':
         case '\'':
            this.n5(0);
            this.t9 = 13;
            return 35;
         default:
            this.k5(this.e2, "\"", "'");
            return 9;
      }
   }

   private int n5(int var1) {
      char var2 = this.n3[this.e2];
      int var3 = var1 == 0 ? 32 : 10;
      int var4 = this.z8;
      this.y2.n5(this.f5(), this.j3());
      this.e2++;
      this.z3 = this.e2;
      this.r4.n5(0);

      label209:
      while (true) {
         while ((this.a6.n5[this.n3[this.e2]] & 255 & 128) != 0 && this.n3[this.e2] != '%') {
            this.e2++;
         }

         if (this.n3[this.e2] == var2 && this.z8 == var4) {
            if (this.r4.l6() > 0) {
               this.r4.n5(this.n3, this.z3, this.e2 - this.z3);
            }

            this.e2++;
            this.y1 = var2;
            return 35;
         }

         int var5 = this.e2 - this.z3;
         if (var5 > 0) {
            this.r4.n5(this.n3, this.z3, var5);
            this.z3 = this.e2;
         }

         switch (this.n3[this.e2]) {
            case '\t':
               if (var1 == 0 && this.h0()) {
                  this.r4.n5(' ');
                  this.z3++;
               }

               this.e2++;
               break;
            case '\n':
               this.e2++;
               if (this.h0()) {
                  this.r4.n5((char)var3);
                  this.z3 = this.e2;
               }

               this.n5.l6(this.e2);
               break;
            case '\r':
               if (this.n3[this.e2 + 1] == '\n') {
                  if (this.h0()) {
                     if (var1 == 0) {
                        this.r4.n5(this.n5.x8() ? "  " : " ");
                     } else {
                        this.r4.n5(this.n5.x8() ? "\r\n" : "\n");
                     }

                     this.z3 = this.e2 + 2;
                     this.i9();
                     this.n5.n5(this.n5.u9() + 1);
                  }

                  this.e2 += 2;
               } else {
                  if (this.e2 + 1 == this.y4) {
                     if ((this.n5.t2() || this.g7() == 0) && (var1 == 2 || !this.u9(true))) {
                        this.n5(this.e2, "There is an unclosed literal string.");
                     }

                     this.z3 = this.e2;
                     break;
                  }

                  this.e2++;
                  if (this.h0()) {
                     this.r4.n5((char)var3);
                     this.z3 = this.e2;
                  }
               }

               this.n5.l6(this.e2);
               break;
            case '"':
            case '\'':
            case '>':
               this.e2++;
               break;
            case '%':
               if (var1 != 1) {
                  this.e2++;
               } else {
                  this.n5(true, true, var1 == 0);
                  this.z3 = this.e2;
               }
               break;
            case '&':
               if (var1 == 2) {
                  this.e2++;
               } else {
                  if (this.e2 + 1 != this.y4) {
                     if (this.n3[this.e2 + 1] == '#') {
                        this.i9();
                        int var8 = this.n5.n5(this.u3() ? this.k7 : null);
                        this.j4();
                        this.r4.n5(this.n3, this.e2, var8 - this.e2);
                        this.n5.n5(var8);
                        this.z3 = var8;
                        this.e2 = var8;
                     } else {
                        this.i9();
                        if (var1 == 0) {
                           int var9 = this.n5.n5(true, this.u3() ? this.k7 : null);
                           this.j4();
                           if (var9 >= 0) {
                              this.r4.n5(this.n3, this.e2, var9 - this.e2);
                              this.n5.n5(var9);
                              this.z3 = var9;
                              this.e2 = var9;
                           } else {
                              this.n5(false, true, true);
                              this.z3 = this.e2;
                           }
                        } else {
                           int var10 = this.n5.n5(false, null);
                           this.j4();
                           if (var10 >= 0) {
                              this.z3 = this.e2;
                              this.e2 = var10;
                           } else {
                              this.r4.n5('&');
                              this.e2++;
                              this.z3 = this.e2;
                              k6 var7 = this.z7();
                              this.l6(var7, false, false, false);
                           }
                        }
                     }
                     continue;
                  }

                  if ((this.n5.t2() || this.g7() == 0) && (var1 == 2 || !this.u9(true))) {
                     this.n5(this.e2, "There is an unclosed literal string.");
                  }

                  this.z3 = this.e2;
               }
               break;
            case '<':
               if (var1 == 0) {
                  this.n5(this.e2, "'{0}', hexadecimal value {1}, is an invalid attribute character.", XmlException.buildCharExceptionArgs('<', '\u0000'));
               }

               this.e2++;
               break;
            default:
               if (this.e2 != this.y4) {
                  char var6 = this.n3[this.e2];
                  if (!u4.n5((int)var6)) {
                     break label209;
                  }

                  if (this.e2 + 1 != this.y4) {
                     this.e2++;
                     if (!u4.l6((int)this.n3[this.e2])) {
                        break label209;
                     }

                     this.e2++;
                  } else {
                     if ((this.n5.t2() || this.g7() == 0) && (var1 == 2 || !this.u9(true))) {
                        this.n5(this.e2, "There is an unclosed literal string.");
                     }

                     this.z3 = this.e2;
                  }
               } else {
                  if ((this.n5.t2() || this.g7() == 0) && (var1 == 2 || !this.u9(true))) {
                     this.n5(this.e2, "There is an unclosed literal string.");
                  }

                  this.z3 = this.e2;
               }
         }
      }

      this.n5(this.n3, this.y4, this.e2);
      return 9;
   }

   private k6 z7() {
      try {
         this.y0();
      } catch (XmlException var2) {
         this.n5("An error occurred while parsing EntityName.", com.aspose.slides.ms.System.d1.n5, var2.getLineNumber(), var2.getLinePosition());
      }

      if (this.n3[this.e2] != ';') {
         this.l6(this.e2, ";");
      }

      k6 var1 = this.a6(false);
      this.e2++;
      return var1;
   }

   private int v4() {
      switch (this.n3[this.e2]) {
         case 'P':
            if (!this.o5()) {
               this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            }

            this.z1 = 31;
            this.t9 = 29;
            return 33;
         case 'S':
            if (!this.j8()) {
               this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            }

            this.z1 = 31;
            this.t9 = 28;
            return 34;
         default:
            this.n5(this.e2, "Expecting a system identifier or a public identifier.");
            return 9;
      }
   }

   private int u6() {
      if (this.n3[this.e2] != '"' && this.n3[this.e2] != '\'') {
         this.k5(this.e2, "\"", "'");
      }

      this.n5(2);
      this.t9 = this.z1;
      return 35;
   }

   private int t1() {
      if (this.n3[this.e2] == '%') {
         this.e2++;
         this.z1 = 21;
         this.t9 = 1;
         return 38;
      } else {
         this.y0();
         this.t9 = 21;
         return 24;
      }
   }

   private int a5() {
      switch (this.n3[this.e2]) {
         case '"':
         case '\'':
            this.n5(1);
            this.t9 = 31;
            return 35;
         case 'P':
            if (!this.o5()) {
               this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            }

            this.z1 = 22;
            this.t9 = 29;
            return 33;
         case 'S':
            if (!this.j8()) {
               this.n5(this.e2, "Expecting external ID, '[' or '>'.");
            }

            this.z1 = 22;
            this.t9 = 28;
            return 34;
         default:
            this.n5(this.e2, "Expecting an external identifier or an entity value.");
            return 9;
      }
   }

   private int h2() {
      if (this.n3[this.e2] == 'N') {
         while (this.y4 - this.e2 < 5) {
            if (this.g7() == 0) {
               this.t9 = 31;
               return 9;
            }
         }

         if (this.n3[this.e2 + 1] == 'D' && this.n3[this.e2 + 2] == 'A' && this.n3[this.e2 + 3] == 'T' && this.n3[this.e2 + 4] == 'A') {
            this.e2 += 5;
            this.t9 = 1;
            this.z1 = 31;
            return 37;
         }
      }

      this.t9 = 31;
      return 9;
   }

   private int v0() {
      if (this.n3[this.e2] != '"' && this.n3[this.e2] != '\'') {
         this.k5(this.e2, "\"", "'");
      }

      this.n5(2);
      this.t9 = 30;
      return 35;
   }

   private int f0() {
      if (this.n3[this.e2] != '"' && this.n3[this.e2] != '\'') {
         this.t9 = this.z1;
         return 9;
      } else {
         this.n5(2);
         this.t9 = this.z1;
         return 35;
      }
   }

   private int a3() {
      if (this.n3[this.e2] != 'I') {
         this.n5(this.e2, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
      }

      this.e2++;

      while (true) {
         while (this.y4 - this.e2 >= 5) {
            switch (this.n3[this.e2]) {
               case 'G':
                  if (this.n3[this.e2 + 1] == 'N'
                     && this.n3[this.e2 + 2] == 'O'
                     && this.n3[this.e2 + 3] == 'R'
                     && this.n3[this.e2 + 4] == 'E'
                     && !this.a6.u3(this.n3[this.e2 + 5])) {
                     this.z1 = 26;
                     this.t9 = 25;
                     this.e2 += 5;
                     return 46;
                  }

                  this.n5(this.e2 - 1, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
                  return 9;
               case 'N':
                  if (this.y4 - this.e2 >= 6) {
                     if (this.n3[this.e2 + 1] == 'C'
                        && this.n3[this.e2 + 2] == 'L'
                        && this.n3[this.e2 + 3] == 'U'
                        && this.n3[this.e2 + 4] == 'D'
                        && this.n3[this.e2 + 5] == 'E'
                        && !this.a6.u3(this.n3[this.e2 + 6])) {
                        this.z1 = 0;
                        this.t9 = 25;
                        this.e2 += 6;
                        return 47;
                     }

                     this.n5(this.e2 - 1, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
                     return 9;
                  }

                  if (this.g7() == 0) {
                     this.n5(this.e2, "Incomplete DTD content.");
                  }
                  break;
               default:
                  this.n5(this.e2 - 1, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
                  return 9;
            }
         }

         if (this.g7() == 0) {
            this.n5(this.e2, "Incomplete DTD content.");
         }
      }
   }

   private int p3() {
      if (this.n3[this.e2] != '[') {
         this.l6(this.e2, "[");
      }

      this.e2++;
      this.t9 = this.z1;
      return 31;
   }

   private int x9() {
      int var1 = 0;

      label143:
      while (true) {
         while ((this.a6.n5[this.n3[this.e2]] & 255 & 64) != 0 && this.n3[this.e2] != ']') {
            this.e2++;
         }

         switch (this.n3[this.e2]) {
            case '\t':
            case '"':
            case '&':
            case '\'':
               this.e2++;
               break;
            case '\n':
               this.e2++;
               this.n5.l6(this.e2);
               break;
            case '\r':
               if (this.n3[this.e2 + 1] == '\n') {
                  this.e2 += 2;
               } else {
                  if (this.e2 + 1 >= this.y4 && !this.n5.t2()) {
                     if (this.n5.t2() || this.g7() == 0) {
                        if (this.u9(false)) {
                           break;
                        }

                        this.n5(this.e2, "There is an unclosed conditional section.");
                     }

                     this.z3 = this.e2;
                     break;
                  }

                  this.e2++;
               }

               this.n5.l6(this.e2);
               break;
            case '<':
               if (this.y4 - this.e2 >= 3) {
                  if (this.n3[this.e2 + 1] == '!' && this.n3[this.e2 + 2] == '[') {
                     var1++;
                     this.e2 += 3;
                     continue;
                  }

                  this.e2++;
               } else {
                  if (this.n5.t2() || this.g7() == 0) {
                     if (this.u9(false)) {
                        continue;
                     }

                     this.n5(this.e2, "There is an unclosed conditional section.");
                  }

                  this.z3 = this.e2;
               }
               break;
            case ']':
               if (this.y4 - this.e2 >= 3) {
                  if (this.n3[this.e2 + 1] == ']' && this.n3[this.e2 + 2] == '>') {
                     if (var1 <= 0) {
                        this.e2 += 3;
                        this.t9 = 0;
                        return 18;
                     }

                     var1--;
                     this.e2 += 3;
                     continue;
                  }

                  this.e2++;
               } else {
                  if (this.n5.t2() || this.g7() == 0) {
                     if (this.u9(false)) {
                        continue;
                     }

                     this.n5(this.e2, "There is an unclosed conditional section.");
                  }

                  this.z3 = this.e2;
               }
               break;
            default:
               if (this.e2 != this.y4) {
                  char var2 = this.n3[this.e2];
                  if (!u4.n5((int)var2)) {
                     break label143;
                  }

                  if (this.e2 + 1 != this.y4) {
                     this.e2++;
                     if (!u4.l6((int)this.n3[this.e2])) {
                        break label143;
                     }

                     this.e2++;
                  } else {
                     if (this.n5.t2() || this.g7() == 0) {
                        if (this.u9(false)) {
                           continue;
                        }

                        this.n5(this.e2, "There is an unclosed conditional section.");
                     }

                     this.z3 = this.e2;
                  }
               } else {
                  if (this.n5.t2() || this.g7() == 0) {
                     if (this.u9(false)) {
                        continue;
                     }

                     this.n5(this.e2, "There is an unclosed conditional section.");
                  }

                  this.z3 = this.e2;
               }
         }
      }

      this.n5(this.n3, this.y4, this.e2);
      return 9;
   }

   private void y0() {
      this.u3(false);
   }

   private void j9() {
      this.u3(this.u9());
   }

   private void u3(boolean var1) {
      this.z3 = this.e2;
      int var2 = -1;

      while (true) {
         if ((this.a6.n5[this.n3[this.e2]] & 255 & 4) == 0 && this.n3[this.e2] != ':') {
            if (this.e2 + 1 >= this.y4) {
               if (this.z6()) {
                  continue;
               }

               this.l6(this.e2, "Unexpected end of file while parsing {0} has occurred.", "Name");
               break;
            }

            this.n5(
               this.e2, "Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(this.n3, this.y4, this.e2)
            );
            break;
         }

         this.e2++;
         break;
      }

      while (true) {
         while ((this.a6.n5[this.n3[this.e2]] & 255 & 8) != 0) {
            this.e2++;
         }

         if (this.n3[this.e2] != ':') {
            if (this.e2 != this.y4) {
               break;
            }

            if (!this.z6()) {
               if (this.z3 == this.e2) {
                  this.l6(this.e2, "Unexpected end of file while parsing {0} has occurred.", "Name");
               }
               break;
            }
         } else if (var1) {
            if (var2 != -1) {
               this.n5(this.e2, "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(':', '\u0000'));
            }

            var2 = this.e2 - this.z3;
            this.e2++;
         } else {
            this.e2++;
         }
      }

      this.m1 = var2 == -1 ? -1 : this.z3 + var2;
   }

   private boolean z6() {
      int var1 = this.e2 - this.z3;
      this.e2 = this.z3;
      boolean var2 = this.g7() != 0;
      this.z3 = this.e2;
      this.e2 += var1;
      return var2;
   }

   private void e9() {
      this.z3 = this.e2;

      while (true) {
         while ((this.a6.n5[this.n3[this.e2]] & 255 & 8) != 0 || this.n3[this.e2] == ':') {
            this.e2++;
         }

         if (this.e2 < this.y4) {
            if (this.e2 - this.z3 == 0) {
               this.n5(
                  this.e2,
                  "The '{0}' character, hexadecimal value {1}, cannot be included in a name.",
                  XmlException.buildCharExceptionArgs(this.n3, this.y4, this.e2)
               );
            }

            return;
         }

         int var1 = this.e2 - this.z3;
         this.e2 = this.z3;
         if (this.g7() == 0) {
            if (var1 > 0) {
               this.z3 = this.e2;
               this.e2 += var1;
               return;
            }

            this.l6(this.e2, "Unexpected end of file while parsing {0} has occurred.", "NmToken");
         }

         this.z3 = this.e2;
         this.e2 += var1;
      }
   }

   private boolean o5() {
      while (this.y4 - this.e2 < 6) {
         if (this.g7() == 0) {
            return false;
         }
      }

      if (this.n3[this.e2 + 1] == 'U'
         && this.n3[this.e2 + 2] == 'B'
         && this.n3[this.e2 + 3] == 'L'
         && this.n3[this.e2 + 4] == 'I'
         && this.n3[this.e2 + 5] == 'C') {
         this.e2 += 6;
         return true;
      } else {
         return false;
      }
   }

   private boolean j8() {
      while (this.y4 - this.e2 < 6) {
         if (this.g7() == 0) {
            return false;
         }
      }

      if (this.n3[this.e2 + 1] == 'Y'
         && this.n3[this.e2 + 2] == 'S'
         && this.n3[this.e2 + 3] == 'T'
         && this.n3[this.e2 + 4] == 'E'
         && this.n3[this.e2 + 5] == 'M') {
         this.e2 += 6;
         return true;
      } else {
         return false;
      }
   }

   private k6 a6(boolean var1) {
      if (this.m1 == -1) {
         return new k6(this.k5.n5(this.n3, this.z3, this.e2 - this.z3));
      }

      if (var1) {
         return new k6(this.k5.n5(this.n3, this.m1 + 1, this.e2 - this.m1 - 1), this.k5.n5(this.n3, this.z3, this.m1 - this.z3));
      }

      this.l6(this.z3, "'{0}' is an unqualified name and cannot contain the character ':'.", this.w2());
      return null;
   }

   private String w2() {
      return com.aspose.slides.ms.System.d1.n5(this.n3, this.z3, this.e2 - this.z3);
   }

   private String s0() {
      return this.w2();
   }

   private String v8() {
      return this.r4.l6() == 0 ? com.aspose.slides.ms.System.d1.n5(this.n3, this.z3, this.e2 - this.z3 - 1) : this.r4.toString();
   }

   private String v3() {
      String var1 = this.r4.l6() == 0 ? com.aspose.slides.ms.System.d1.n5(this.n3, this.z3, this.e2 - this.z3 - 1) : this.r4.toString();
      return n5(var1);
   }

   private int g7() {
      this.i9();
      int var1 = this.n5.n3();
      this.j4();
      return var1;
   }

   private void j4() {
      this.n3 = this.n5.u3();
      this.y4 = this.n5.a6();
      this.e2 = this.n5.u9();
   }

   private void i9() {
      this.l6(this.e2);
   }

   private void l6(int var1) {
      if (this.u3()) {
         int var2 = this.n5.u9();
         if (var1 - var2 > 0) {
            this.k7.n5(this.n3, var2, var1 - var2);
         }
      }

      this.n5.n5(this.e2);
   }

   private boolean n5(boolean var1, boolean var2, boolean var3) {
      this.e2++;
      return this.n5(this.z7(), var1, var2, var3);
   }

   private boolean n5(k6 var1, boolean var2, boolean var3, boolean var4) {
      this.i9();
      if (var2 && this.l6() && !this.a6()) {
         this.n5(this.e2 - var1.l6().length() - 1, "A parameter entity reference is not allowed in internal markup.");
      }

      com.aspose.slides.internal.b8c.v6 var5 = this.l6(var1, var2, true, var4);
      if (var5 == null) {
         return false;
      }

      if (var5.z8()) {
         this.l6(this.e2 - var1.l6().length() - 1, var2 ? "Parameter entity '{0}' references itself." : "General entity '{0}' references itself.", var1.l6());
      }

      int var6 = 0;
      if (var5.l6()) {
         int[] var7 = new int[]{0};
         boolean var8 = !this.n5.n5(var5, var7);
         var6 = var7[0];
         if (var8) {
            return false;
         }

         this.m3++;
      } else {
         if (var5.z3().length() == 0) {
            return false;
         }

         int[] var10 = new int[]{0};
         boolean var11 = !this.n5.n5(var5, var10);
         var6 = var10[0];
         if (var11) {
            return false;
         }
      }

      this.z8 = var6;
      if (var2 && !var3 && this.t9 != 32) {
         this.t4 = this.t9;
         this.t9 = 32;
      }

      this.j4();
      return true;
   }

   private boolean u9(boolean var1) {
      this.i9();
      o0 var2 = null;
      o0[] var3 = new o0[]{var2};
      int[] var4 = new int[]{this.z8};
      boolean var5 = !this.n5.n5(var3, var4);
      var2 = var3[0];
      this.z8 = var4[0];
      if (var5) {
         return false;
      }

      this.j4();
      if (var2 == null) {
         if (this.t9 == 32) {
            this.t9 = this.t4;
         }

         return false;
      } else {
         if (var2.l6()) {
            this.m3--;
         }

         if (!var1 && this.t9 != 32) {
            this.t4 = this.t9;
            this.t9 = 32;
         }

         return true;
      }
   }

   private com.aspose.slides.internal.b8c.v6 l6(k6 var1, boolean var2, boolean var3, boolean var4) {
      com.aspose.slides.internal.b8c.v6 var5 = null;
      if (var2) {
         com.aspose.slides.internal.b8c.v6[] var6 = new com.aspose.slides.internal.b8c.v6[]{var5};
         this.u3.s7().tryGetValue(var1, var6);
         var5 = var6[0];
      } else {
         com.aspose.slides.internal.b8c.v6[] var8 = new com.aspose.slides.internal.b8c.v6[]{var5};
         this.u3.t2().tryGetValue(var1, var8);
         var5 = var8[0];
      }

      if (var5 == null) {
         if (var2) {
            if (this.t2) {
               this.n5(this.e2 - var1.l6().length() - 1, 0, "Reference to undeclared parameter entity '{0}'.", var1.l6());
            }
         } else if (var3) {
            if (!this.l6()) {
               if (this.t2) {
                  this.n5(this.e2 - var1.l6().length() - 1, 0, "Reference to undeclared entity '{0}'.", var1.l6());
               }
            } else {
               this.l6(this.e2 - var1.l6().length() - 1, "Reference to undeclared entity '{0}'.", var1.l6());
            }
         }

         return null;
      } else {
         if (!var5.q0().k5()) {
            this.l6(this.e2 - var1.l6().length() - 1, "Reference to unparsed entity '{0}'.", var1.l6());
         }

         if (var4 && var5.z1()) {
            this.l6(this.e2 - var1.l6().length() - 1, "External entity '{0}' reference cannot appear in the attribute value.", var1.l6());
         }

         return var5;
      }
   }

   private void n5(int var1, int var2, String var3, String var4) {
      this.n5(var2, new XmlSchemaException(var3, var4, this.n1(), this.f5(), this.j3() + (var1 - this.e2)));
   }

   private void n5(int var1, String var2, String var3) {
      this.n5(var1, new XmlSchemaException(var2, var3, this.n1(), this.f5(), this.j3()));
   }

   private void n5(int var1, XmlSchemaException var2) {
      v0 var3 = this.l6.t4();
      if (var3 != null) {
         var3.n5(var2, var1);
      }
   }

   private boolean k5(int var1) {
      return var1 >= 0 && var1 <= 8;
   }

   private int f5() {
      return this.n5.h0();
   }

   private int j3() {
      return this.e2 - this.n5.c8();
   }

   private String n1() {
      com.aspose.slides.ms.System.r8 var1 = this.n5.k5();
      return var1 != null ? var1.toString() : com.aspose.slides.ms.System.d1.n5;
   }

   private void p6() {
      this.n5(this.e2, "An internal error has occurred.");
   }

   private void n5(int var1, String var2) {
      this.l6(var1, var2, com.aspose.slides.ms.System.d1.n5);
   }

   private void l6(int var1, String var2, String var3) {
      this.e2 = var1;
      com.aspose.slides.ms.System.r8 var4 = this.n5.k5();
      this.n5.n5(new XmlException(var2, var3, this.f5(), this.j3(), var4 == null ? null : var4.toString()));
   }

   private void n5(int var1, String var2, String[] var3) {
      this.e2 = var1;
      com.aspose.slides.ms.System.r8 var4 = this.n5.k5();
      this.n5.n5(new XmlException(var2, var3, this.f5(), this.j3(), var4 == null ? null : var4.toString()));
   }

   private void n5(String var1, String var2, int var3, int var4) {
      com.aspose.slides.ms.System.r8 var5 = this.n5.k5();
      this.n5.n5(new XmlException(var1, var2, var3, var4, var5 == null ? null : var5.toString()));
   }

   private void n5(int var1, String var2, int var3) {
      this.n5(var1, "'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var2, var3));
   }

   private void n5(char[] var1, int var2, int var3) {
      this.n5(var3, "'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var1, var2, var3));
   }

   private void l6(int var1, String var2) {
      this.k5(var1, var2, null);
   }

   private void k5(int var1, String var2, String var3) {
      String var4 = this.u3(var1);
      if (var3 != null) {
         this.n5(this.e2, "'{0}' is an unexpected token. The expected token is '{1}' or '{2}'.", new String[]{var4, var2, var3});
      } else {
         this.n5(this.e2, "'{0}' is an unexpected token. The expected token is '{1}'.", new String[]{var4, var2});
      }
   }

   private String u3(int var1) {
      if (!this.a6.l6(this.n3[var1])) {
         return com.aspose.slides.ms.System.d1.n5(this.n3, var1, 1);
      }

      int var2 = var1;

      while (this.a6.l6(this.n3[var2])) {
         var2++;
      }

      int var3 = var2 - var1;
      return com.aspose.slides.ms.System.d1.n5(this.n3, var1, var3 > 0 ? var3 : 1);
   }

   public static String n5(String var0) {
      int var1 = var0.length();
      if (var1 <= 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var2 = 0;
      com.aspose.slides.internal.l7h.a5 var3 = null;

      while (var0.charAt(var2) == ' ') {
         if (++var2 == var1) {
            return " ";
         }
      }

      int var4;
      for (var4 = var2; var4 < var1; var4++) {
         if (var0.charAt(var4) == ' ') {
            int var5 = var4 + 1;

            while (var5 < var1 && var0.charAt(var5) == ' ') {
               var5++;
            }

            if (var5 == var1) {
               if (var3 == null) {
                  return com.aspose.slides.ms.System.d1.l6(var0, var2, var4 - var2);
               }

               var3.n5(var0, var2, var4 - var2);
               return var3.toString();
            }

            if (var5 > var4 + 1) {
               if (var3 == null) {
                  var3 = new com.aspose.slides.internal.l7h.a5(var1);
               }

               var3.n5(var0, var2, var4 - var2 + 1);
               var2 = var5;
               var4 = var5 - 1;
            }
         }
      }

      if (var3 == null) {
         return var2 == 0 ? var0 : com.aspose.slides.ms.System.d1.l6(var0, var2, var1 - var2);
      }

      if (var4 > var2) {
         var3.n5(var0, var2, var4 - var2);
      }

      return var3.toString();
   }
}
