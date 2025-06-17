/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {

                            // 1 Option
     return this.length===0 ? -1 : this[this.length-1];

      // 2 Option

    // if(this.length ===0){
    //     return -1;
    // }else{
    //    return this[this.length - 1];
    // }

      
      
    
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */
