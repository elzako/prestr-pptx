package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.p8;

public class c8 extends s7 {
   static String[] n5 = new String[]{p8.k5()};

   public c8() {
   }

   public c8(c8 var1) {
      this.n5(var1);
   }

   public h0 n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("negative index");
      } else if (var1 >= this.getInnerList().size()) {
         throw new ArgumentOutOfRangeException("index >= Count");
      } else {
         return (h0)this.getInnerList().get_Item(var1);
      }
   }

   public int n5(h0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("certificate");
      } else {
         return this.getInnerList().addItem(var1);
      }
   }

   public void n5(c8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("certificates");
      }

      this.getInnerList().addRange(var1);
   }

   public boolean l6(h0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("certificate");
      }

      for (Object recoveredElement$var3$1491 : this.getInnerList()) {
         h0 var3 = (h0)recoveredElement$var3$1491;
         if (var3.n5(var1)) {
            return true;
         }
      }

      return false;
   }

   public c8 n5(int var1, Object var2, boolean var3) {
      if (var2 == null) {
         throw new ArgumentNullException("findValue");
      }

      String var4 = d1.n5;
      String var5 = d1.n5;
      int var6 = 0;
      com.aspose.slides.ms.System.j5 var7 = com.aspose.slides.ms.System.j5.l6.m3();
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 9:
         case 14:
            try {
               var4 = (String)var2;
               break;
            } catch (RuntimeException var24) {
               String var29 = d1.n5("Invalid find value type '{0}', expected '{1}'.", j8.n5(var2), "string");
               throw new CryptographicException(var29, var24);
            }
         case 6:
         case 7:
         case 8:
            try {
               com.aspose.slides.internal.v6g.k5.u3(var2, com.aspose.slides.ms.System.j5.class).u3(var7);
               break;
            } catch (RuntimeException var20) {
               String var28 = d1.n5("Invalid find value type '{0}', expected '{1}'.", j8.n5(var2), "X509DateTime");
               throw new CryptographicException(var28, var20);
            }
         case 10:
         case 11:
         case 12:
            try {
               var5 = (String)var2;
            } catch (RuntimeException var23) {
               String var26 = d1.n5("Invalid find value type '{0}', expected '{1}'.", j8.n5(var2), "X509KeyUsageFlags");
               throw new CryptographicException(var26, var23);
            }

            try {
               com.aspose.slides.internal.o8m.y4.k5(var5);
               break;
            } catch (CryptographicUnexpectedOperationException var22) {
               String var27 = d1.n5("Invalid OID value '{0}'.", new Object[]{var5});
               throw new ArgumentException("findValue", var27);
            }
         case 13:
            try {
               var6 = (Integer)var2;
               break;
            } catch (RuntimeException var21) {
               String var9 = d1.n5("Invalid find value type '{0}', expected '{1}'.", j8.n5(var2), "X509KeyUsageFlags");
               throw new CryptographicException(var9, var21);
            }
         default:
            String var8 = d1.n5("Invalid find type '{0}'.", new Object[]{com.aspose.slides.internal.v6g.k5.l6(var1)});
            throw new CryptographicException(var8);
      }

      com.aspose.slides.internal.x7n.l6 var25 = com.aspose.slides.internal.x7n.l6.k5();
      c8 var30 = new c8();

      for (Object recoveredElement$var11$4185 : this.getInnerList()) {
         h0 var11 = (h0)recoveredElement$var11$4185;
         boolean var12;
         var12 = false;
         label148:
         switch (var1) {
            case 0:
               var12 = d1.n5(var4, var11.z8(), true, var25) == 0 || d1.n5(var4, var11.a6(), true, var25) == 0;
               break;
            case 1:
               String[] var13 = d1.n5(var11.m3().n5(true), n5, 1);

               for (String var17 : var13) {
                  int var18 = d1.u3(var17, '=');
                  var12 = d1.l6(var17, var4, var18, (short)3) >= 0;
                  if (var12) {
                     break label148;
                  }
               }
               break;
            case 2:
               var12 = d1.n5(var4, var11.l6(), true, var25) == 0;
               break;
            case 3:
               String var14 = var11.n5(0, true);
               var12 = d1.u9(var14, var4, (short)3) >= 0;
               break;
            case 4:
               var12 = d1.n5(var4, var11.n5(), true, var25) == 0;
               break;
            case 5:
               var12 = d1.n5(var4, var11.m1(), true, var25) == 0;
               break;
            case 6:
               var12 = com.aspose.slides.ms.System.j5.l6(var7, var11.z1()) && com.aspose.slides.ms.System.j5.u3(var7, var11.t9());
               break;
            case 7:
               var12 = com.aspose.slides.ms.System.j5.k5(var7, var11.z1());
               break;
            case 8:
               var12 = com.aspose.slides.ms.System.j5.n5(var7, var11.t9());
            case 9:
            case 11:
            default:
               break;
            case 10:
               var12 = var11.y4().size() == 0;
               break;
            case 12:
               var12 = var11.y4().n5(var5) != null;
               break;
            case 13:
               z8 var16 = com.aspose.slides.internal.v6g.k5.n5(var11.y4().n5("2.5.29.15"), z8.class);
               if (var16 == null) {
                  var12 = true;
               } else {
                  var12 = (var16.k5() & var6) == var6;
               }
               break;
            case 14:
               w1 var15 = com.aspose.slides.internal.v6g.k5.n5(var11.y4().n5("2.5.29.14"), w1.class);
               if (var15 != null) {
                  var12 = d1.n5(var4, var15.k5(), true, var25) == 0;
               }
         }

         if (var12) {
            if (var3) {
               try {
                  if (var11.w1()) {
                     var30.n5(var11);
                  }
               } catch (RuntimeException var19) {
               }
            } else {
               var30.n5(var11);
            }
         }
      }

      return var30;
   }

   @Override
   public IEnumerator iterator() {
      return new t2(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h0 l6(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h0 get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
