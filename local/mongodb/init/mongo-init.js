db.auth('root', 'example')

db = db.getSiblingDB('blue_archive')

db.createUser({
  user: 'mongo_ba',
  pwd: 'th1sIsSecr3tOfM0ng0',
  roles: [{
    role: 'dbOwner',
    db: 'blue_archive',
  }],
});

db.createCollection("students", { autoIndexId: true });
db.students.insert({
  name: "Aru",
  background: "Gehenna Academy's self-appointed president of Handyman 68, conducts all sorts of illegal business as she pleases.\nWhile Aru considers herself to be a cool outlaw, she often falls out of character and thus any appearance disparities are easily revealed.",
  school: "GEHENNA",
  playRole: "ATTACKER",
  position: "BACK",
  attackType: "EXPLOSIVE",
  armorType: "LIGHT",
  combatClass: "STRIKER",
  affinity: {urban: "S", Outdoors: "B", Indoors: "D"},
  weaponType: "SR",
  equip1: "HAT",
  equip2: "HAIRPIN",
  equip3: "WATCH",
  fullName: "Rikuhachima Aru",
  age: 16,
  birthday: "03/12",
  height: 160,
  hobbies: "Studying management",
  illustrator: "DoReMi",
  voiceActress: "Kondō Reina",
  releaseDate: "2021/02/04",
  stats: null,
  bonusAffection: null,
  skills: null,
  uniqueWeapon: null,
  cafeFurniture: null,
  gifts: null,
});
