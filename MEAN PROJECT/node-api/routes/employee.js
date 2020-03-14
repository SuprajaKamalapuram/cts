const express = require('express');
const router=express.Router();
const Employee=require('../models/employe');

router.get('/',async(req,res) =>{
    const employees=await Employee.find();
    try{
        res.status(200).json({
            error:false,
            data:employees
        });
    }catch (err){
        res.status(400).json({
            error:true,
            message:err.message
        });
    }

});


router.get('/:id',(req,res) =>{

    let id=req.params.id;
    console.log(id);

    res.status(200).json({
        error:false,
        message:'get  employee:' + id
        
    });
});

router.post('/', async(req,res) =>{

    let emp=req.body;
    console.log(emp);
    let doc=await Employee.create(emp)
    try{
        res.status(201).json({
            error:false,
            data:doc
    })
 } catch(err){
        res.status(400).json({
        error:true,
        message:err.message
    })
}
});  
    

router.put('/:id', async (req,res) =>{
    const employee=Employee.findByIdAndUpdate(req.params.id,req.body, {
        new:true,
        runValidators:true
    })

    if(!employee){
        res.status(404).json({
            error:true,
            message:"employee id does not exist"
        })
    }
    try{
        res.status(200).json({
            error:false,
            data:employee
    })
}   catch(err){
         res.status(400).json({
             error:true,
             message:err.message

         })  
        
    }
});

router.delete('/', (req,res) =>{
    res.status(200).json({
        error:false,
        message:'delete employees'
    });
});





module.exports=router;