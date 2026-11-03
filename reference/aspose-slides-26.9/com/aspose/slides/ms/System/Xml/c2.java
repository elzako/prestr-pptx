package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;

public class c2 extends o3 {
   private int n5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private int c8;
   private int t2;
   private u4 s7 = new u4();
   private w2 x8;

   public c2(c7 var1, boolean var2, boolean var3, boolean var4, boolean var5, int var6) {
      super(var1);
      this.n5 = 0;
      this.u3 = var2;
      this.a6 = var3;
      this.u9 = var4;
      this.h0 = var5;
      this.c8 = var6;
      this.t2 = 0;
      if (var2) {
         u4.n5().n5(this.s7);
      }
   }

   @Override
   public w4 n5() {
      w4 var1 = this.l6.n5();
      if (var1 == null) {
         var1 = new w4();
      } else {
         var1 = var1.z3();
      }

      if (this.u3) {
         var1.l6(true);
      }

      if (this.a6) {
         var1.k5(true);
      }

      if (this.u9) {
         var1.a6(true);
      }

      if (this.h0) {
         var1.u3(true);
      }

      if (this.c8 != -1) {
         var1.u3(this.c8);
      }

      var1.h0(true);
      return var1;
   }

   @Override
   public boolean k5(String var1) {
      if (this.n5 == 1) {
         this.t2();
      }

      return super.l6.k5(var1);
   }

   @Override
   public void l6(int var1) {
      if (this.n5 == 1) {
         this.t2();
      }

      super.l6.l6(var1);
   }

   @Override
   public boolean k5() {
      if (this.n5 == 1) {
         this.t2();
      }

      return super.l6.k5();
   }

   @Override
   public boolean u3() {
      if (this.n5 == 1) {
         this.t2();
      }

      return super.l6.u3();
   }

   @Override
   public boolean a6() {
      if (this.n5 == 1) {
         this.t2();
      }

      return super.l6.a6();
   }

   @Override
   public boolean u9() {
      switch (this.n5) {
         case 0:
            this.n5 = 3;
            if (super.l6.h0() == 0 && !super.l6.u9()) {
               return false;
            }
            break;
         case 1:
            this.t2();
            this.n5 = 3;
            if (!super.l6.u9()) {
               return false;
            }
            break;
         case 2:
            return false;
         case 3:
            if (!super.l6.u9()) {
               return false;
            }
            break;
         default:
            return false;
      }

      int var1 = super.l6.s7();
      if (!this.u3) {
         switch (var1) {
            case 7:
               if (this.h0) {
                  return this.u9();
               }
               break;
            case 8:
               if (this.u9) {
                  return this.u9();
               }
            case 9:
            case 11:
            case 12:
            default:
               break;
            case 10:
               if (this.c8 == 0) {
                  this.l6(
                     "For security reasons DTD is prohibited in this XML document. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method.",
                     com.aspose.slides.ms.System.d1.n5
                  );
               } else if (this.c8 == 1) {
                  return this.u9();
               }
               break;
            case 13:
               if (this.a6) {
                  return this.u9();
               }
         }

         return true;
      } else {
         switch (var1) {
            case 1:
               if (this.u3) {
                  this.k5(super.l6.e2(), super.l6.n3());
                  if (super.l6.k5()) {
                     do {
                        this.k5(super.l6.e2(), super.l6.n3());
                        this.c8(super.l6.z1());
                     } while (super.l6.u3());

                     super.l6.a6();
                  }
               }
            case 2:
            case 6:
            case 9:
            case 11:
            case 12:
            default:
               break;
            case 3:
            case 4:
               if (this.u3) {
                  this.c8(super.l6.z1());
               }
               break;
            case 5:
               if (this.u3) {
                  this.h0(super.l6.x8());
               }
               break;
            case 7:
               if (this.h0) {
                  return this.u9();
               }

               if (this.u3) {
                  this.h0(super.l6.x8());
                  this.c8(super.l6.z1());
               }
               break;
            case 8:
               if (this.u9) {
                  return this.u9();
               }

               if (this.u3) {
                  this.c8(super.l6.z1());
               }
               break;
            case 10:
               if (this.c8 == 0) {
                  this.l6(
                     "For security reasons DTD is prohibited in this XML document. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method.",
                     com.aspose.slides.ms.System.d1.n5
                  );
               } else if (this.c8 == 1) {
                  return this.u9();
               }

               if (this.u3) {
                  this.h0(super.l6.x8());
                  this.c8(super.l6.z1());
                  String var2 = super.l6.u3("SYSTEM");
                  if (var2 != null) {
                     this.c8(var2);
                  }

                  var2 = super.l6.u3("PUBLIC");
                  int var3;
                  if (var2 != null && (var3 = this.s7.u3(var2)) >= 0) {
                     this.n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var2, var3));
                  }
               }
               break;
            case 13:
               if (this.a6) {
                  return this.u9();
               }

               if (this.u3) {
                  this.l6(super.l6.z1());
               }
               break;
            case 14:
               if (this.u3) {
                  this.l6(super.l6.z1());
               }
               break;
            case 15:
               if (this.u3) {
                  this.k5(super.l6.e2(), super.l6.n3());
               }
         }

         this.t2 = var1;
         return true;
      }
   }

   @Override
   public int h0() {
      switch (this.n5) {
         case 0:
            return super.l6.h0() == 4 ? 4 : 0;
         case 1:
         case 3:
         default:
            return super.l6.h0();
         case 2:
            return 2;
      }
   }

   @Override
   public boolean c8() {
      if (this.n5 == 1) {
         this.t2();
      }

      return super.l6.c8();
   }

   private void l6(String var1, String var2) {
      this.n5 = 2;
      throw new XmlException(var1, var2, (f0)null);
   }

   private void n5(String var1, String[] var2) {
      this.n5 = 2;
      throw new XmlException(var1, var2, (f0)null);
   }

   private void l6(String var1) {
      int var2;
      if ((var2 = this.s7.l6(var1)) != -1) {
         this.n5(
            "The Whitespace or SignificantWhitespace node can contain only XML white space characters. '{0}' is not an XML white space character.",
            XmlException.buildCharExceptionArgs(var1, var2)
         );
      }
   }

   private void h0(String var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      y5.n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
   }

   private void k5(String var1, String var2) {
      try {
         if (var1.length() > 0) {
            y5.k5(var1);
         }

         y5.k5(var2);
      } catch (RuntimeException var4) {
         this.n5 = 2;
         throw var4;
      }
   }

   private void c8(String var1) {
      f4.n5(var1, 0, 1);
   }

   private void t2() {
      this.n5 = 3;
      if (this.x8 != null) {
         this.x8.n5();
      }
   }
}
