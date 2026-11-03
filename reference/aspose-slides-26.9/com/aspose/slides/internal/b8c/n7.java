package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public final class n7 {
   private int n5;
   private com.aspose.slides.ms.System.Xml.z9 l6;
   private o2 k5;
   private b4 u3;
   private com.aspose.slides.ms.System.Xml.s2 a6;
   private com.aspose.slides.ms.System.Xml.c7 u9;
   private com.aspose.slides.ms.System.Xml.o5 h0;
   private boolean c8;
   private int t2 = 0;
   private int s7;
   private r7 x8;
   private a9 n3;
   private x0 y4;
   private com.aspose.slides.ms.System.Xml.o8 e2 = null;
   private XmlDocument t9;
   private boolean z1;
   private com.aspose.slides.ms.System.Xml.l0 t4;
   private com.aspose.slides.ms.System.Xml.s2 q0;
   private String z3;
   private com.aspose.slides.ms.System.Xml.u4 m1 = com.aspose.slides.ms.System.Xml.u4.n5().l6();

   public n7(int var1, com.aspose.slides.ms.System.Xml.z9 var2, o2 var3, b4 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.e2 = com.aspose.slides.internal.s5g.n5.l6();
      this.z1 = true;
      this.t9 = new XmlDocument();
   }

   public final int n5(com.aspose.slides.ms.System.Xml.c7 var1, String var2) {
      this.l6(var1, var2);

      while (this.u3() && var1.u9()) {
      }

      return this.n5();
   }

   public final void l6(com.aspose.slides.ms.System.Xml.c7 var1, String var2) {
      this.u9 = var1;
      this.h0 = com.aspose.slides.ms.System.Xml.o5.n5(var1);
      this.a6 = var1.b3();
      if (this.a6 == null) {
         this.a6 = new com.aspose.slides.ms.System.Xml.s2(this.l6);
         this.c8 = true;
      } else {
         this.c8 = false;
      }

      while (var1.s7() != 1 && var1.u9()) {
      }

      this.s7 = Integer.MAX_VALUE;
      this.t2 = var1.t4();
      int var3 = this.k5.n5(var1.n3(), var1.y4());
      String var4 = null;
      String[] var5 = new String[]{var4};
      boolean var6 = !this.n5(var3, var5);
      var4 = var5[0];
      if (var6) {
         throw new XmlSchemaException(var4, var1.q0(), this.h0.ah_(), this.h0.ai_());
      }

      if (this.n5 == 3) {
         this.n3 = new a9();
         this.n3.n5(new com.aspose.slides.ms.System.r8(var1.q0(), 0));
         this.x8 = new h3d(var1, this.a6, this.n3, this.l6, this.k5, this.u3);
      } else {
         this.y4 = new x0();
         this.y4.n5(2);
         this.x8 = new i8(var1, this.a6, this.y4, var2, this.l6, this.k5, this.u3);
         ((i8)this.x8).n5(this.e2);
      }
   }

   private boolean n5(int var1, String[] var2) {
      var2[0] = null;
      if (this.n5 == 0) {
         this.n5 = var1;
      }

      switch (var1) {
         case 0:
         case 1:
            var2[0] = "Expected Schema root. Make sure the root element is <Schema> and the namespace is 'http://www.w3.org/2001/XMLSchema' for an XSD Schema or 'urn:schemas-microsoft-com:xml-data' for an XDR Schema.";
            if (this.n5 == 3) {
               var2[0] = "The root element of a W3C XML Schema should be <Schema> and its namespace should be 'http://www.w3.org/2001/XMLSchema'.";
            }

            return false;
         case 2:
            if (this.n5 == 3) {
               var2[0] = "'XmlSchemaSet' can load only W3C XML Schemas.";
               return false;
            }

            if (this.n5 != 2) {
               var2[0] = "Different Schema types cannot be mixed.";
               return false;
            }
            break;
         case 3:
            if (this.n5 != 3) {
               var2[0] = "Different Schema types cannot be mixed.";
               return false;
            }
      }

      return true;
   }

   public final int n5() {
      return this.n5;
   }

   public final a9 l6() {
      return this.n3;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.e2 = var1;
   }

   public final x0 k5() {
      return this.y4;
   }

   public final boolean u3() {
      if (this.u9.t4() > this.s7) {
         if (this.z1) {
            this.n5(false);
         }

         return true;
      } else {
         if (this.u9.s7() == 1) {
            if (this.x8.n5(this.u9.e2(), this.u9.n3(), this.u9.y4())) {
               this.a6.k5();
               if (this.u9.k5()) {
                  do {
                     this.x8.n5(this.u9.e2(), this.u9.n3(), this.u9.y4(), this.u9.z1());
                     if (com.aspose.slides.ms.System.Xml.v8.n5(this.u9.y4(), this.k5.a6) && this.c8) {
                        this.a6.n5(this.u9.e2().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : this.u9.n3(), this.u9.z1());
                     }
                  } while (this.u9.u3());

                  this.u9.a6();
               }

               this.x8.l6();
               if (this.u9.m1()) {
                  this.a6.u3();
                  this.x8.k5();
                  if (this.u9.t4() == this.t2) {
                     return false;
                  }
               } else if (!this.x8.n5()) {
                  this.s7 = this.u9.t4();
                  this.z1 = true;
                  if (this.q0 == null) {
                     this.q0 = new com.aspose.slides.ms.System.Xml.s2(this.l6);
                     this.z3 = this.l6.n5("xmlns");
                  }

                  this.n5(true);
               }
            } else if (!this.u9.m1()) {
               this.s7 = this.u9.t4();
               this.z1 = false;
            }
         } else if (this.u9.s7() == 3) {
            if (!this.m1.n5(this.u9.z1())) {
               this.x8.n5(this.u9.z1());
            }
         } else if (this.u9.s7() == 5 || this.u9.s7() == 14 || this.u9.s7() == 4) {
            this.x8.n5(this.u9.z1());
         } else if (this.u9.s7() == 15) {
            if (this.u9.t4() != this.s7) {
               this.a6.u3();
               this.x8.k5();
            } else {
               if (this.z1) {
                  com.aspose.slides.ms.System.Xml.i0 var1 = this.t4.getChildNodes();
                  com.aspose.slides.ms.System.Xml.l0[] var2 = new com.aspose.slides.ms.System.Xml.l0[var1.n5()];

                  for (int var3 = 0; var3 < var1.n5(); var3++) {
                     var2[var3] = var1.k5(var3);
                  }

                  this.x8.n5(var2);
                  this.a6.u3();
                  this.x8.k5();
               }

               this.s7 = Integer.MAX_VALUE;
            }

            if (this.u9.t4() == this.t2) {
               return false;
            }
         }

         return true;
      }
   }

   private void n5(boolean var1) {
      com.aspose.slides.ms.System.Xml.m8 var2 = null;
      switch (this.u9.s7()) {
         case 1:
            this.q0.k5();
            var2 = this.l6(var1);
            break;
         case 2:
         case 6:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            this.t4.appendChild(var2);
            break;
         case 3:
            com.aspose.slides.ms.System.Xml.t0 var8 = this.t9.createTextNode(this.u9.z1());
            this.t4.appendChild(var8);
            break;
         case 4:
            com.aspose.slides.ms.System.Xml.u5 var7 = this.t9.createCDataSection(this.u9.z1());
            this.t4.appendChild(var7);
            break;
         case 5:
            com.aspose.slides.ms.System.Xml.t6 var6 = this.t9.createEntityReference(this.u9.x8());
            this.t4.appendChild(var6);
            break;
         case 7:
            com.aspose.slides.ms.System.Xml.j1 var5 = this.t9.createProcessingInstruction(this.u9.x8(), this.u9.z1());
            this.t4.appendChild(var5);
            break;
         case 8:
            com.aspose.slides.ms.System.Xml.h5 var4 = this.t9.createComment(this.u9.z1());
            this.t4.appendChild(var4);
         case 13:
         case 16:
            break;
         case 14:
            com.aspose.slides.ms.System.Xml.n8 var3 = this.t9.createSignificantWhitespace(this.u9.z1());
            this.t4.appendChild(var3);
            break;
         case 15:
            this.q0.u3();
            this.t4 = this.t4.getParentNode();
      }
   }

   private com.aspose.slides.ms.System.Xml.m8 l6(boolean var1) {
      com.aspose.slides.ms.System.Xml.c7 var2 = this.u9;
      boolean var3 = var2.m1();
      com.aspose.slides.ms.System.Xml.m8 var4 = this.t9.createElement(var2.e2(), var2.n3(), var2.y4());
      var4.l6(var3);
      if (var1) {
         this.t4 = var4;
      } else {
         com.aspose.slides.ms.System.Xml.w5 var5 = var4.getAttributes();
         if (var2.k5()) {
            do {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var2.y4(), this.k5.a6)) {
                  this.q0.n5(var2.e2().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : this.u9.n3(), this.u9.z1());
               }

               com.aspose.slides.ms.System.Xml.u8 var6 = this.a6();
               var5.l6(var6);
            } while (var2.u3());
         }

         var2.a6();
         String var9 = this.q0.n5(var2.e2());
         if (var9 == null) {
            com.aspose.slides.ms.System.Xml.u8 var7 = this.n5(var2.e2(), this.a6.n5(var2.e2()));
            var5.l6(var7);
         } else if (var9.length() == 0) {
            String var10 = this.a6.n5(var2.e2());
            if (!com.aspose.slides.ms.System.d1.a6(var10, com.aspose.slides.ms.System.d1.n5)) {
               com.aspose.slides.ms.System.Xml.u8 var8 = this.n5(var2.e2(), var10);
               var5.l6(var8);
            }
         }

         while (var2.u3()) {
            if (var2.e2().length() != 0) {
               String var11 = this.q0.n5(var2.e2());
               if (var11 == null) {
                  com.aspose.slides.ms.System.Xml.u8 var12 = this.n5(var2.e2(), this.a6.n5(var2.e2()));
                  var5.l6(var12);
               }
            }
         }

         var2.a6();
         this.t4.appendChild(var4);
         if (!var2.m1()) {
            this.t4 = var4;
         }
      }

      return var4;
   }

   private com.aspose.slides.ms.System.Xml.u8 n5(String var1, String var2) {
      com.aspose.slides.ms.System.Xml.u8 var3;
      if (var1.length() == 0) {
         var3 = this.t9.createAttribute(com.aspose.slides.ms.System.d1.n5, this.z3, "http://www.w3.org/2000/xmlns/");
      } else {
         var3 = this.t9.createAttribute(this.z3, var1, "http://www.w3.org/2000/xmlns/");
      }

      var3.appendChild(this.t9.createTextNode(var2));
      this.q0.n5(var1, var2);
      return var3;
   }

   private com.aspose.slides.ms.System.Xml.u8 a6() {
      com.aspose.slides.ms.System.Xml.c7 var1 = this.u9;
      com.aspose.slides.ms.System.Xml.u8 var2 = this.t9.createAttribute(var1.e2(), var1.n3(), var1.y4());

      while (var1.c8()) {
         switch (var1.s7()) {
            case 3:
               var2.appendChild(this.t9.createTextNode(var1.z1()));
               break;
            case 5:
               var2.appendChild(this.u9());
               break;
            default:
               throw com.aspose.slides.ms.System.Xml.i2.n5(var1.s7());
         }
      }

      return var2;
   }

   private com.aspose.slides.ms.System.Xml.t6 u9() {
      com.aspose.slides.ms.System.Xml.t6 var1 = this.t9.createEntityReference(this.u9.n3());
      if (!this.u9.z3()) {
         return var1;
      }

      this.u9.a0();

      while (this.u9.c8()) {
         switch (this.u9.s7()) {
            case 3:
               var1.appendChild(this.t9.createTextNode(this.u9.z1()));
               break;
            case 5:
               var1.appendChild(this.u9());
               break;
            case 16:
               if (var1.getChildNodes().n5() == 0) {
                  var1.appendChild(this.t9.createTextNode(com.aspose.slides.ms.System.d1.n5));
               }

               return var1;
            default:
               throw com.aspose.slides.ms.System.Xml.i2.n5(this.u9.s7());
         }
      }

      return var1;
   }
}
